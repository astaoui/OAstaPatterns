package structural.facade;

/**
 * Created by medasta on 04/11/2016.
 */
public class Facade {
    private JobA jobA;
    private JobB jobB;
    private JobC jobC;
    private JobZ jobZ;

    public Facade() {
        this.jobA =new JobA();
        this.jobB = new JobB();
        this.jobC = new JobC();
        this.jobZ = new JobZ();
    }

    public void chaineOftasks1(){
        jobA.task();
        jobC.task();
        jobZ.task();
    }

    public void chaineOfTasks2(){
        jobB.task();
        jobZ.task();
    }

}
