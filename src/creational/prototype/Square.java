package creational.prototype;

/**
 * Created by medasta on 04/11/2016.
 */
public class Square extends Shape {

    public Square() {
    type="Shape";
    }

    @Override
    public void draw() {
        System.out.println("Square Drawing");
    }
}
