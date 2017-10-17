package ObserverPattern;

public class ZeeSports extends Observer{

    public  ZeeSports(Score score){
        this.score=score;
        this.score.addChannel(this);

    }

    @Override
    public void update() {

        System.out.print("ZeeSports:"+score.getData());
    }
}
