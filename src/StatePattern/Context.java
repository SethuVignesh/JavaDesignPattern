package StatePattern;

/**
 * Created by sethugayu on 8/15/16.
 */
public class Context {
    private  State state;
    public Context(){
        state=null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
