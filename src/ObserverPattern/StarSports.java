package ObserverPattern;

public class StarSports extends Observer {

    public  StarSports(Score score){
        this.score=score;
        this.score.addChannel(this);
    }

    @Override
    public void update() {
        System.out.print("StarSports:"+score.getData());

    }
}
