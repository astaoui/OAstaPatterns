package structural.adapter;

/**
 * Created by medasta on 04/11/2016.
 */
public class Mp4PLayer implements AdvancedMediaPlayer {
    @Override
    public void payVlc(String fileName) {

    }

    @Override
    public void payMp4(String fileName) {
        System.out.println("Playing MP4 file ." +
                " name: "+fileName);
    }
}
