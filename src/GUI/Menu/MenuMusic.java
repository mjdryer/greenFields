package GUI.Menu;


import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class MenuMusic {

    public static MediaPlayer menuMusicPlayer;

    public static void playMenuMusic(){

        Media menuMedia = new Media(MenuMusic.class.getResource("GUI/audioAssets/GoksuMarshes.mp3").toExternalForm());
        menuMusicPlayer = new MediaPlayer(menuMedia);
        menuMusicPlayer.play();
    }

}
