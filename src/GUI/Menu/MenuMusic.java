package GUI.Menu;


import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class MenuMusic {

    private static MediaPlayer menuMusicPlayer;

    public static void playMenuMusic(){

        Media menuMedia = new Media(MenuMusic.class.getResource("C:/Users/Max Dryer/IdeaProjects/greenFields/GoskuMarshes.mp3").toExternalForm());
        menuMusicPlayer = new MediaPlayer(menuMedia);
        menuMusicPlayer.play();
    }

}
