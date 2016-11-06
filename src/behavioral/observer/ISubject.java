package behavioral.observer;

/**
 * Created by medasta on 06/11/2016.
 */
public interface ISubject {

    public  void registerObserver(IObserver observer);
    public  void removeObserver(IObserver observer);
    public  void notifyObservers(Employee employee,String msg);

}
