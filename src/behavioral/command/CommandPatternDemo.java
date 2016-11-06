package behavioral.command;

/**
 * Created by medasta on 06/11/2016.
 */
public class CommandPatternDemo {

    public static void main(String[] args) {

        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();

        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }

}
