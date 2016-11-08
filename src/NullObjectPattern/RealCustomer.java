package NullObjectPattern;

/**
 * Created by sethugayu on 8/14/16.
 */
public class RealCustomer extends AbstractCustomer {
    public RealCustomer(String name){
        this.name=name;
    }
    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
