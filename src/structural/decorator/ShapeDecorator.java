package structural.decorator;

/**
 * Created by medasta on 04/11/2016.
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape ;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public abstract void draw() ;
}
