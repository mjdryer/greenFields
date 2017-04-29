package GUI;


import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import static GUI.Game.GameRectangles.configureAllGameRectangles;
import static GUI.Game.GameRectangles.gameSceneInnerBorder;
import static GUI.Game.GameRectangles.gameSceneOuterBorder;
import static GUI.Menu.MenuButtons.beginGame;
import static GUI.Menu.MenuButtons.createMenuButtons;
import static GUI.Menu.MenuButtons.instructions;
import static GUI.Menu.MenuCheckBoxes.*;
import static GUI.Menu.MenuGraphicContext.configureGraphicContext;

import static GUI.Menu.MenuGraphicContext.menuCanvasMain;
import static GUI.Menu.MenuGraphicContext.menuCanvasSide;
import static GUI.Menu.MenuImages.bannerPattern;
import static GUI.Menu.MenuRectangles.*;

public class PanesScenes {

    public static Pane menuPane;
    public static Pane gamePane;

    public static Scene menuScene;
    public static Scene gameScene;

    public static void configurePanes() {

        createMenuCheckBoxes();
        initializePanes();
        configureAllMenuRectangles();
        configureAllGameRectangles();
        configureGraphicContext();
        createMenuButtons();
        addChildrenToPanes();

    }

    private static void addChildrenToPanes() {

        menuPane.getChildren().addAll(menuSceneInnerBorder, menuSceneOuterBorder, menuCanvasMain, menuCanvasSide,
                beginGame, instructions, rollingHills, oceanSide, microsoftHills, musicOffCheck, musicOnCheck, bannerPattern);
        gamePane.getChildren().addAll(gameSceneInnerBorder, gameSceneOuterBorder);

    }

    private static void initializePanes() {

        menuPane = new Pane();
        gamePane = new Pane();

    }

    public static void configureScenes() {

        menuScene = new Scene(menuPane, 600, 600);
        gameScene = new Scene(gamePane, 600, 600);

    }

}
