package structuralPatterns.filterOrCriteriaPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by medasta on 04/11/2016.
 */
public class SinglePersons implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons=new ArrayList<>();
        for (Person person:persons) {
            if (person.getMaritalStatus().equalsIgnoreCase("single")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}