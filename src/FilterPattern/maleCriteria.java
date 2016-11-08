package FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sethugayu on 8/15/16.
 */
public class maleCriteria implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons= new ArrayList<Person>();
        for (Person person:persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }

        }

                return malePersons;
    }
}
