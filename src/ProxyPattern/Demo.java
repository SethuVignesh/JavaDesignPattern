package ProxyPattern;

/**
 * Created by sethugayu on 8/14/16.
 */
public class Demo {
    public static void main(String[] args){
        Image image= new ProxyImage("test_10mg.jpg");
        image.display();

        image.display();
    }
}
