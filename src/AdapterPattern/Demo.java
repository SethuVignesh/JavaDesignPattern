package AdapterPattern;

/**
 * Created by sethugayu on 8/14/16.
 */
public class Demo {
    public static void main(System[] args){
        AudioPlayer audioPlayer=new AudioPlayer();
        audioPlayer.play("mp3","beyond the horizon.mp3");
        audioPlayer.play("mp4","alone.mp4");
        audioPlayer.play("vlc","far far away.vlc");
        audioPlayer.play("avi","mind me.avi");
    }
}
