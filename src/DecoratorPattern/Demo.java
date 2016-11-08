package DecoratorPattern;

/**
 * Created by sethugayu on 8/15/16.
 */
public class Demo {
    public static void main(String[] args){
        Shape circle= new Circle();
        Shape redCircle=new RedShapeDecorator(new Circle());
        Shape redRectangle= new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("Circle with red border");
        redCircle.draw();

        System.out.print("Rectangle with red border");
        redRectangle.draw();
    }
}
