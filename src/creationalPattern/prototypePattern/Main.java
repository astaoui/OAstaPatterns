package creationalPattern.prototypePattern;

/**
 * Created by medasta on 04/11/2016.
 */
public class Main {

    public static void main(String[] args){
        ShapeCache shapeCache=new ShapeCache();
        shapeCache.loadCache();

        Shape clonedShape = (Shape) shapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());
        Shape clonedShape2 = (Shape) shapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());
        Shape clonedShape3 = (Shape) shapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
