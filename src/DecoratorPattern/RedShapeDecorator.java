package DecoratorPattern;

/**
 * Created by sethugayu on 8/15/16.
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setBorder(decoratedShape);
    }

    private void setBorder(Shape decoratedShape) {
        System.out.println("Border color: Red");
    }
}
