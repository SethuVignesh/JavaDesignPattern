package AbstractFactoryPattern;

/**
 * Created by sethugayu on 8/14/16.
 */
public interface AbstractFactory {
    abstract Color getColor(String colorType);
    abstract Shape getShape(String shapeType);
}
