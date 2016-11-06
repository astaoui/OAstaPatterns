package behavioral.observer;

/**
 * Created by medasta on 06/11/2016.
 */
public class HRDepartment implements IObserver {
    @Override
    public void callMe(Employee employee,String msg) {
        System.out.println("-------------------------------------");
        System.out.println("HR Department  was Notified ");
        System.out.println(msg+" "+employee.getName() );
        System.out.println("-------------------------------------");
        System.out.println();
    }
}
