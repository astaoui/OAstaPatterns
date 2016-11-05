package structural.filterOrCriteria;

import java.util.List;

/**
 * Created by medasta on 04/11/2016.
 */
public class AndCriteria implements Criteria {

    Criteria criteria1;
    Criteria criteria2;

    public AndCriteria(Criteria criteria1, Criteria criteria2) {
        this.criteria1 = criteria1;
        this.criteria2 = criteria2;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {

        List<Person> listCriteria1=criteria1.meetCriteria(persons);
        List<Person> list_Criteria1_And_Criteria2=criteria2.meetCriteria(listCriteria1);
        return list_Criteria1_And_Criteria2;
    }
}
