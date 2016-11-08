package AbstractFactoryPattern;

/**
 * Created by sethugayu on 8/14/16.
 */
public class ColorFactory implements AbstractFactory {
    public Shape getShape(String shapeType){
        return null;
    }
    public Color getColor(String colorType){
        if (colorType==null){
            return null;
        }
        if (colorType.equalsIgnoreCase("RED")){
            return new Red();

        }else if(colorType.equalsIgnoreCase("GREEN")){
            return new Green();

        }else if(colorType.equalsIgnoreCase("BLUE")){
            return new Blue();

        }
        return null;
    }
}
