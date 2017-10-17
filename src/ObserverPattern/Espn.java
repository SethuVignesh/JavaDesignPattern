package ObserverPattern;

public class Espn extends Observer{
    public  Espn(Score score){
        this.score=score;
        this.score.addChannel(this);
    }

    @Override
    public void update() {
        System.out.print("ESPN:"+score.getData());
    }
}
