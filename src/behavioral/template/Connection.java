package behavioral.template;

/**
 * Created by medasta on 06/11/2016.
 */
public class Connection {
    public Result ecexuteQuery(String s) {
        System.out.println("Connecting to the DataBase ...");
        if(s.equalsIgnoreCase("select * from people")){
            System.out.println("Executing Query....");
            System.out.println("Fetching Results ... ");
            return new Result("asta , med , oasta");}
        else if(s.equalsIgnoreCase("select * from companies")){
            System.out.println("Executing Query....");
            System.out.println("Fetching Results ... ");
            return new Result("astaCafe , astaPhoenix");}
        else {
            System.out.println("Executing Query  FAILED :( ");
            return null;
        }
    }

    public void close() {
        System.out.println("----");
    }
}
