package creational.prototype;

/**
 * Created by medasta on 04/11/2016.
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type="Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Rectangle Drawing ");
    }
}
