package structuralPatterns.decoratorPattern;

/**
 * Created by medasta on 04/11/2016.
 */
public class SomeEffectDecorator extends ShapeDecorator {


    public SomeEffectDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
            decoratedShape.draw();
            setEffect(decoratedShape);
    }

    private void setEffect(Shape decoratedShape) {
        System.out.println("new Effect on the Shape");
    }
}
