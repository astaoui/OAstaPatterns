package creational.prototype;

import java.util.HashMap;

/**
 * Created by medasta on 04/11/2016.
 */
public class ShapeCache {

    private static HashMap<String ,Shape> shapeMap=new HashMap<>();

    public static Shape getShape(String id) {
        Shape cachedShape=shapeMap.get(id);

        return (Shape) cachedShape.clone();
    }


    public void loadCache(){
        Circle circle=new Circle();
        circle.setId(1);
        shapeMap.put("1",circle);

        Square square =new Square();
        square.setId(2);
        shapeMap.put("2",square);

        Rectangle rectangle =new Rectangle();
        rectangle.setId(3);
        shapeMap.put("3",rectangle);

    }
}
