package behavioral.template;

/**
 * Created by medasta on 06/11/2016.
 */
public class Main {

    public static void main(String[] args){
        AbstractQuery query =new QueryPeople();
        Result result=query.execute();
        System.out.println(result.getValues());
    }
}
