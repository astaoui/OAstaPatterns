package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by medasta on 06/11/2016.
 */
public class EmployeeManagementSystem implements ISubject {

    private List<Employee> employeeList ;
    private List<IObserver> observers;
    private Employee emp=null;
    private String msg=null;

    public EmployeeManagementSystem() {
        this.employeeList = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public void hireNewEmployee(Employee employee){
        this.emp=employee;
        this.msg="New Hire";
        this.employeeList.add(employee);
        this.notifyObservers(emp,msg);
    }
    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove( observer);
    }

    @Override
    public void notifyObservers(Employee employee,String msg) {
        for (IObserver observer:observers
             ) {
            observer.callMe(employee, msg);
        }
    }
}
