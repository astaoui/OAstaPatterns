package creationalPattern.builderPattern;

/**
 * Created by medasta on 04/11/2016.
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
