package SingletonDesignPattern;

/**
 * Created by sethuvignesh on 8/5/16.
 */
public class SingletonClass {
    private static SingletonClass singletonClass= new SingletonClass();
    private SingletonClass(){

    }

    public static SingletonClass getInstsnce(){
        return  singletonClass;
    }
    public void className(){
        System.out.println(" in Singleton Class");
    }
}
