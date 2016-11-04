package builderPattern;

/**
 * Created by medasta on 04/11/2016.
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packigin packigin() {
        return new Bottle();
    }

    @Override
    public abstract float price() ;
}
