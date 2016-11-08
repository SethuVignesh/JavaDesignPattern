package FilterPattern;

import java.util.List;

/**
 * Created by sethugayu on 8/15/16.
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
