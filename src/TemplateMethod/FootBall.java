package TemplateMethod;

/**
 * Created by sethugayu on 8/15/16.
 */
public class FootBall extends Game {
    @Override
    void startPlay() {
        System.out.println("Starting Football game");
    }

    @Override
    void initialisePlay() {
        System.out.println("Enjoying the Football game");

    }

    @Override
    void endPlay() {
        System.out.println("Ending the Football game");

    }
}
