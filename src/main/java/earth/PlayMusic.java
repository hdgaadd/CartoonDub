package earth;

import javazoom.jl.player.Player;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;

public class PlayMusic {
    public Player player = null;

    File directory = new File("");// 参数为空
    String courseFile = directory.getCanonicalPath();

    String str= courseFile + "\\src\\main\\java\\beastMusic\\";

    public PlayMusic() throws IOException {
    }

    //随机播放
    public void random(String url){
        File file = new File(str+url+"\\");//文件夹
        File[] files = file.listFiles();
        Random random = new Random();
        int index=random.nextInt(files.length);
        File mp3 = files[index];//mp3文件
        music(mp3);
    }
    //变身
    public void trans(String url){
        music(new File(str+url+"\\trans.mp3"));
    }
    //laughter
    public void laughter(String url){
        music(new File(str+url+"\\laughter1.mp3"));
    }
    //播放
    public void music(File mp3){
        try {
            new Player(new BufferedInputStream
                    (new FileInputStream(
                            mp3)))
                    .play();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
