package structural.decorator;

/**
 * Created by medasta on 04/11/2016.
 */
public class Main {

    public static void main(String[] args){

        Shape circle=new Circle();

        Shape redCircle=new RedShapeDecorator(new Circle());

        Shape rectangle=new RedShapeDecorator(new Rectangle());

        Shape redCircleWithEffect=new SomeEffectDecorator(redCircle);

        System.out.println("-------------------");
        circle.draw();
        System.out.println("-------------------");
        redCircle.draw();
        System.out.println("-------------------");
        rectangle.draw();
        System.out.println("-------------------");
        redCircleWithEffect.draw();
    }
}
