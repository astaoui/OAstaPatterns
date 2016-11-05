package creational.singelton;

/**
 * Created by medasta on 03/11/2016.
 */
public class Main {
    public static void main(String[] args){
        TheLonelyMan lonelyMan=TheLonelyMan.getLonelyMan();
        lonelyMan.hello();
    }
}
