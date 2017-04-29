package GUI;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import static GUI.Menu.MenuAnimations.configureMenuAnimations;
import static GUI.Menu.MenuImages.configureImages;
import static GUI.Menu.MenuMusic.playMenuMusic;
import static GUI.PanesScenes.*;


public class Main extends Application {

    public static Stage theStage;

    public void start(Stage greenFields){
        theStage = greenFields;
        configureEverything();
        greenFields.setScene(menuScene);
        greenFields.show();
        //playMenuMusic();
    }

    public static void configureEverything() {

        configurePanes();
        configureScenes();
        configureMenuAnimations();
        configureImages();
    }

}
