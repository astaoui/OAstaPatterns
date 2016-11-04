package creationalPattern.builderPattern;

/**
 * Created by medasta on 04/11/2016.
 */
public abstract class Burger implements Item {

    @Override
    public Packigin packigin() {
        return new Wrapper();
    }

    @Override
    public abstract float price() ;
}
