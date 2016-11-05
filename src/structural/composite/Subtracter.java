package structural.composite;

/**
 * Created by medasta on 05/11/2016.
 */
public class Subtracter extends BinaryExpression {


    public Subtracter(Expression left, Expression right) {
    super(left,right);
    }

    @Override
    public double getValue() {
        return left.getValue()-right.getValue();
    }
}
