package AbstractFactoryPattern;

/**
 * Created by sethugayu on 8/14/16.
 */
public class Demo{
    public static void main(String[] args){
       AbstractFactory shapeFactory= FactoryProducer.getFactory("SHAPE");

        Shape shape1= shapeFactory.getShape("SQUARE");

        shape1.draw();

        Shape shape2=shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3=shapeFactory.getShape("CIRCLE");
        shape3.draw();

        AbstractFactory colorFactory= FactoryProducer.getFactory("color");

        Color color1= colorFactory.getColor("REd");
        color1.fillColor();

        Color color2=colorFactory.getColor("green");
        color2.fillColor();

        Color color3=colorFactory.getColor("blue");
        color3.fillColor();


    }

}