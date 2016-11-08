package StatePattern;

/**
 * Created by sethugayu on 8/15/16.
 */
public class Demo {
    public static void main(String[] args){
        Context context= new Context();

        StartState startState= new StartState();
        startState.doAction(context);

        System.out.println(context.getState());

        StopState stopState= new StopState();
        stopState.doAction(context);

        System.out.println(context.getState());
    }
}
