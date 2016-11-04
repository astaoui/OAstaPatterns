package structuralPatterns.decoratorPattern;

/**
 * Created by medasta on 04/11/2016.
 */
public class Rectangle implements  Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
