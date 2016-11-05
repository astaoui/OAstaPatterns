package structural.composite;

/**
 * Created by medasta on 05/11/2016.
 */
public class Constant implements Expression {
    double value;
    public Constant(double value) {
    this.value=value;
    }

    @Override
    public double getValue() {
        return value;
    }
}
