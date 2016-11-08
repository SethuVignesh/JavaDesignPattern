package AbstractFactoryPattern;

/**
 * Created by sethugayu on 8/14/16.
 */
public class Green implements Color {
    @Override
    public void fillColor() {
        System.out.println("Inside Green:: fillColor() method.");
    }
}
