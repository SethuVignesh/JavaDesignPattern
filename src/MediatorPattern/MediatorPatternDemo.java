package MediatorPattern;

/**
 * Created by sethugayu on 8/15/16.
 */
public class MediatorPatternDemo {
    public static void main(String[] args){
        User robert=new User("Robert");
        User john= new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert");
    }
}
