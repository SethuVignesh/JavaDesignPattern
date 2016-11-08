package AdapterPattern;

/**
 * Created by sethugayu on 8/14/16.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void PlayMp4(String fileName) {
        System.out.println("Playing mp4 file . Name: "+fileName);

    }
}
