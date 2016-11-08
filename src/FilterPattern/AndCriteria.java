package FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sethugayu on 8/15/16.
 */
public class AndCriteria implements Criteria{
    Criteria firstCriteria,secondCriteria;
    public AndCriteria(Criteria firstCriteria,Criteria secondCriteria){
        this.firstCriteria=firstCriteria;
        this.secondCriteria=secondCriteria;

    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons=firstCriteria.meetCriteria(persons);
        List<Person> secondCriteriaPersons= secondCriteria.meetCriteria(persons);
        List<Person> andCriteriaPersons=new ArrayList<>();
        for (Person person:firstCriteriaPersons) {
            if(secondCriteriaPersons.contains(person)){
//                secondCriteriaPersons.remove(person);
                andCriteriaPersons.add(person);

            }

        }

        return andCriteriaPersons;
    }
}
