package FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sethugayu on 8/15/16.
 */
public class SinglesCriteria implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singles= new ArrayList<Person>();
        for (Person person:persons) {
            if(person.getMartialStatus().equalsIgnoreCase("single")){
                singles.add(person);
            }

        }
        return singles;
    }
}
