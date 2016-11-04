package structuralPatterns.filterOrCriteriaPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by medasta on 04/11/2016.
 */
public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));

        Criteria male = new MaleCriteria();
        Criteria female = new FemalePersons();
        Criteria single = new SinglePersons();
        Criteria singleMale = new AndCriteria(single, male);

        System.out.println("---------------------------");

        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("---------------------------");

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("---------------------------");

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + person.getGender()
                    +", Marital Status : " + person.getMaritalStatus()
                    +" ]");
        }
    }
}
