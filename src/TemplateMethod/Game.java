package TemplateMethod;

/**
 * Created by sethugayu on 8/15/16.
 */
public abstract class  Game {
    abstract void startPlay();
   abstract void  initialisePlay();
   abstract void endPlay();

    public final void play(){
        startPlay();
        initialisePlay();
        endPlay();

    }
}
