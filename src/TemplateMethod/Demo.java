package TemplateMethod;

/**
 * Created by sethugayu on 8/15/16.
 */
public class Demo {
    public  static void main(String[] atrgs){
        Game game= new Cricket();
        game.play();

        game= new FootBall();
        game.play();
    }
}
