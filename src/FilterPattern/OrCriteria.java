package FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sethugayu on 8/15/16.
 */
public class OrCriteria implements Criteria {
    Criteria firstCriteria,secondCriteria;
    public  OrCriteria(Criteria firstCriteria,Criteria secondCrieria){
        this.firstCriteria=firstCriteria;
        this.secondCriteria=secondCrieria;

    }
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons= firstCriteria.meetCriteria(persons);
        List<Person> secondCriteriaPersons= secondCriteria.meetCriteria(persons);
        for (Person person:firstCriteriaPersons) {
            if(secondCriteriaPersons.contains(person)==false){
                secondCriteriaPersons.add(person);
            }

        }

        return secondCriteriaPersons;
    }
}
