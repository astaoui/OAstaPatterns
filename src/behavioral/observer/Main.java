package behavioral.observer;

/**
 * Created by medasta on 06/11/2016.
 */
public class Main {


    public static void main(String[] args){

        IObserver hr=new HRDepartment();
        IObserver payroo=new PayrollDepartement();

        EmployeeManagementSystem EMS=new EmployeeManagementSystem();

        Employee med=new Employee("Asta",22);
        Employee med2=new Employee("O-Asta",22);
        Employee med3=new Employee("AstaYes",22);

        EMS.registerObserver(hr);
        EMS.registerObserver(payroo);

        EMS.hireNewEmployee(med);
        EMS.hireNewEmployee(med2);
        EMS.hireNewEmployee(med3);
    }
}
