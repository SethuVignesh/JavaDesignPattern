package TemplateMethod;

/**
 * Created by sethugayu on 8/15/16.
 */
public class Cricket extends Game {
    @Override
    void startPlay() {
        System.out.println("Starting Cricket game");
    }

    @Override
    void initialisePlay() {
        System.out.println("Enjoying the Cricket game");

    }

    @Override
    void endPlay() {
        System.out.println("Ending the cricket game");

    }
}
