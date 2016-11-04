package creationalPattern.builderPattern;

/**
 * Created by medasta on 04/11/2016.
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 25.5f;
    }
}
