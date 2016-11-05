package structural.composite;

/**
 * Created by medasta on 05/11/2016.
 */
public abstract class BinaryExpression implements Expression {

    protected Expression right;
    protected Expression left;

    public BinaryExpression(Expression left, Expression right) {

        this.left=left;
        this.right=right;

    }


}
