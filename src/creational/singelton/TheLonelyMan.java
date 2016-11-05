package creational.singelton;

/**
 * Created by medasta on 03/11/2016.
 */
public class TheLonelyMan {
    private static TheLonelyMan lonelyMan =new TheLonelyMan();

    private TheLonelyMan() {
    }

    public static TheLonelyMan getLonelyMan() {
        return lonelyMan;
    }

    public void hello(){
        System.out.println("Hello There ,I'am The Lonely Man");
    }
}
