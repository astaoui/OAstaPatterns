package structuralPatterns.filterOrCriteriaPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by medasta on 04/11/2016.
 */
public class MaleCriteria implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons=new ArrayList<>();
        for (Person person: persons) {
            if (person.getGender().equalsIgnoreCase("male")){
                malePersons.add(person);
            }

        }

        return malePersons;
    }
}
