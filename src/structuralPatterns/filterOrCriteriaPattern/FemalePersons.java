package structuralPatterns.filterOrCriteriaPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by medasta on 04/11/2016.
 */
public class FemalePersons implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons=new ArrayList<>();
        for (Person person:persons) {
            if (person.getGender().equalsIgnoreCase("female")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
