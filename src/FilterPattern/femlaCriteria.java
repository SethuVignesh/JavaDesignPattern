package FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sethugayu on 8/15/16.
 */
public class femlaCriteria implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons= new ArrayList<Person>();
        for(Person person:persons){
            if(person.getGender().equalsIgnoreCase("female")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
