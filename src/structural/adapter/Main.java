package structural.adapter;

/**
 * Created by medasta on 04/11/2016.
 */
public class Main {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "Chriki asta la vista.mp3");
        audioPlayer.play("mp4", "Cry me a river .mp4");
        audioPlayer.play("vlc", "My away.vlc");
        audioPlayer.play("avi", "Mack the knife.avi");
    }
}
