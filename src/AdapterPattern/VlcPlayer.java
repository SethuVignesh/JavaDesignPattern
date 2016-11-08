package AdapterPattern;

/**
 * Created by sethugayu on 8/14/16.
 */
public class VlcPlayer implements  AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file . Name: "+ fileName);
    }

    @Override
    public void PlayMp4(String fileName) {

    }
}
