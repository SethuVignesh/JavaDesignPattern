package Prototype;

/**
 * Created by sethugayu on 8/14/16.
 */
public class Circle extends Shape {
    public Circle(){
        type="Circle";
    }
    @Override
    void draw() {
        System.out.println("Inside Circle:: draw() method.");
    }
}
