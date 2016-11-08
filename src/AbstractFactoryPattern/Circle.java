package AbstractFactoryPattern;

/**
 * Created by sethugayu on 8/14/16.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle:: draw() method.");
    }
}
