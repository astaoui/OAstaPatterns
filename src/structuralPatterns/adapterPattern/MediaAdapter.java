package structuralPatterns.adapterPattern;

/**
 * Created by medasta on 04/11/2016.
 */
public class MediaAdapter implements MediaPlayer{

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("Vlc")) {
            this.advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            this.advancedMediaPlayer = new Mp4PLayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("Vlc")) {
            this.advancedMediaPlayer.payVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            this.advancedMediaPlayer.payMp4(fileName);
        }
    }
}
