package structural.proxy;

/**
 * Created by medasta on 05/11/2016.
 */
public class BuisnessObjectProxy extends BuisnessObject {

    BuisnessObjectImpl buisnessObject;
    public BuisnessObjectProxy(BuisnessObjectImpl buisnessObject) {
        this.buisnessObject=buisnessObject;
    }

    @Override
    public void task() {
        System.out.println("Pre BuisnessObject tasks");
        this.buisnessObject.task();
        System.out.println("Post BuisnessObject tasks");
    }
}
