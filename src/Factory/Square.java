package Factory;

/**
 * Created by sethugayu on 8/14/16.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
