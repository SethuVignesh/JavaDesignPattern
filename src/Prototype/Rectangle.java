package Prototype;

/**
 * Created by sethugayu on 8/14/16.
 */
public class Rectangle extends Shape {
    public Rectangle(){
        type="Rectangle";
    }
    @Override
    void draw() {
        System.out.println("Inside REctangle::draw() method .");

    }
}
