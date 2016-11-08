package StatePattern;

/**
 * Created by sethugayu on 8/15/16.
 */
public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }
}
