package Prototype;

/**
 * Created by sethugayu on 8/14/16.
 */
public class Square extends Shape {
    public Square(){
        type="Square";
    }
    @Override
    void draw() {
        System.out.println("Inside Square:: draw() method.");

    }
}
