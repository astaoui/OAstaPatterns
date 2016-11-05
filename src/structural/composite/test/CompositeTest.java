package structural.composite.test;

/**
 * Created by medasta on 05/11/2016.
 */
import org.junit.Test;
import structural.composite.*;

import static org.junit.Assert.assertEquals;

public class CompositeTest {
    @Test
    public void testConstant(){
        double testValue=3.0;
    Expression e=new Constant(testValue);
        assertEquals(testValue,e.getValue(),0.0);
    }

    @Test
    public void testAdder(){
        double testValue=2.0;
        double testValue2=4.0;
        Expression left=new Constant(testValue);
        Expression right=new Constant(testValue2);
        Expression e=new Adder(left,right);
        assertEquals((testValue+testValue2),e.getValue(),0.0);
    }

    @Test
    public void testSubstracter(){
        double testValue=2.0;
        double testValue2=4.0;
        Expression left=new Constant(testValue);
        Expression right=new Constant(testValue2);
        Expression e=new Subtracter(left,right);
        assertEquals((testValue-testValue2),e.getValue(),0.0);
    }

    @Test
    public void testDivider(){
        double testValue=2.0;
        double testValue2=4.0;
        Expression left=new Constant(testValue);
        Expression right=new Constant(testValue2);
        Expression e=new Divider(left,right);
        assertEquals((testValue/testValue2),e.getValue(),0.0);
    }

    @Test
    public void testMultiplier(){
        double testValue=2.0;
        double testValue2=4.0;
        Expression left=new Constant(testValue);
        Expression right=new Constant(testValue2);
        Expression e=new Multiplier(left,right);
        assertEquals((testValue*testValue2),e.getValue(),0.0);
    }

    @Test
    public void testComplexExpression(){

        Expression e=(new Divider(new Multiplier(new Adder(new Constant(1.0),new Constant(1.0)),new Constant(2.0)),new Constant(2.0)));
        assertEquals(2.0,e.getValue(),0.0001);

    }



}