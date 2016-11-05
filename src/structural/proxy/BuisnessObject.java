package structural.proxy;

/**
 * Created by medasta on 05/11/2016.
 */
public abstract class BuisnessObject {

    abstract public void task();

    public static BuisnessObject create(){
        return new BuisnessObjectProxy(new BuisnessObjectImpl());
    }
}
