package AbstractFactoryPattern;

/**
 * Created by sethugayu on 8/14/16.
 */
public class Red implements Color {
    @Override
    public void fillColor() {
        System.out.println("Inside Red color: fill() method.");
    }
}
