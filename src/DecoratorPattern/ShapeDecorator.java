package DecoratorPattern;

/**
 * Created by sethugayu on 8/15/16.
 */
public class ShapeDecorator implements Shape {
    protected  Shape decoratedShape;
    public  ShapeDecorator(Shape decoratedShape){
        this.decoratedShape=decoratedShape;
    }
    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
