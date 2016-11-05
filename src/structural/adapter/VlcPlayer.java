package structural.adapter;

/**
 * Created by medasta on 04/11/2016.
 */
public class VlcPlayer implements  AdvancedMediaPlayer {
    @Override
    public void payVlc(String fileName) {
        System.out.println("Playing vlc file ." +
                " name :"+fileName);
    }

    @Override
    public void payMp4(String fileName) {

    }
}
