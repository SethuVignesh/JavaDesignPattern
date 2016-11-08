package Factory;

/**
 * Created by sethugayu on 8/14/16.
 */
public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType==null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return  new Rectangle();
        }else if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        }else  if(shapeType.equalsIgnoreCase("SQUARE")){
            return  new Square();
        }
        return null;
    }
}
