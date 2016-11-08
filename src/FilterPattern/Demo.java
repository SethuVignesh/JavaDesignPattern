package FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sethugayu on 8/15/16.
 */
public class Demo {
    public static void main(String[] args){
        List<Person> persons= new ArrayList<>();
        persons.add(new Person("John","male","single"));

        persons.add(new Person("Rega","female","single"));

        persons.add(new Person("Soap","male","married"));

        persons.add(new Person("Beep","female","married"));

        System.out.println("Male Persons");
        printPersons(new maleCriteria().meetCriteria(persons));

        System.out.println("Female Persons");
        printPersons(new femlaCriteria().meetCriteria(persons));

        System.out.println("Married and Male Persons");
        printPersons(new AndCriteria(new maleCriteria(),new SinglesCriteria()).meetCriteria(persons));
        System.out.println("Married or Female Persons");
        printPersons(new OrCriteria(new femlaCriteria(),new SinglesCriteria()).meetCriteria(persons));


    }

    public static void printPersons(List<Person> persons) {
        for (Person person:persons) {
            System.out.println("Name:"+person.getName()+" Gender:"+person.getGender()+" Martial status: "+person.getMartialStatus());
        }
    }
}
