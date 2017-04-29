package GUI.Game;

import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;


import static GUI.Menu.MenuImages.oceanSidePattern;
import static GUI.Menu.MenuRectangles.configureSingleRectangle;

/**
 * Created by Max Dryer on 4/29/2017.
 */
public class GameRectangles {

    public static Rectangle gameSceneOuterBorder, gameSceneInnerBorder;


    public static void configureAllGameRectangles(){

        initializeGameRectangles();
        configureGameSeneRectangles();

    }

    public static void initializeGameRectangles(){

        gameSceneOuterBorder = new Rectangle(5, 5, 590, 590);
        gameSceneInnerBorder = new Rectangle(10, 10, 580, 580);

    }

    public static void configureGameSeneRectangles(){

        configureSingleRectangle(gameSceneOuterBorder, 5, 10, 10, Paint.valueOf("Black"), null);
        configureSingleRectangle(gameSceneInnerBorder, 2, 5, 5, Paint.valueOf("Black"), oceanSidePattern);
    }

}
