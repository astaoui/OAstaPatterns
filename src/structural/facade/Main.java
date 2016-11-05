package structural.facade;

/**
 * Created by medasta on 04/11/2016.
 */
public class Main {
    public static void main(String[] args){
        Facade facade=new Facade();
        System.out.println();
        System.out.println("-------------------------");

        System.out.println("Calling chaineOfTasks1");
        facade.chaineOftasks1();

        System.out.println();
        System.out.println("-------------------------");
        System.out.println();

        System.out.println("Calling chaineOfTasks2");
        facade.chaineOfTasks2();
    }
}
