package structuralPatterns.decoratorPattern;

/**
 * Created by medasta on 04/11/2016.
 */
public class RedShapeDecorator extends ShapeDecorator {


    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape redBorder) {
        System.out.println("Border Color : RED");
    }
}
