package ObserverPattern;

public class TestClass {
    public static void main(String[] args) {
        Score score= new Score();
//        score.addChannel(
         new Espn(score);
//        score.addChannel(
         new StarSports(score);
//        score.addChannel(
         new ZeeSports(score);

        score.setData(1);
    }
}
