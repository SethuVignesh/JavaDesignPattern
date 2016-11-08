package AbstractFactoryPattern;

/**
 * Created by sethugayu on 8/14/16.
 */
public class ShapeFactory implements AbstractFactory {
    public  Shape getShape(String shapeType){
        if(shapeType==null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();

        }else if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        return null;
    }
    public Color getColor(String colorType){
        return null;
    }
}
