package behavioral.command;

/**
 * Created by medasta on 06/11/2016.
 */
public class SellStock implements  Order {

    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }
    public void execute() {
        abcStock.sell();
    }

}
