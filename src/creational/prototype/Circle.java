package creational.prototype;

/**
 * Created by medasta on 04/11/2016.
 */
public class Circle extends Shape {
    public Circle() {
        type="Circle";
    }

    @Override
    public void draw() {
        System.out.println("Circle Drawing");
    }
}
