package GUI;


import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import static GUI.Menu.MenuButtons.*;
import static GUI.Menu.MenuButtons.beginGame;
import static GUI.Menu.MenuButtons.brickOneButton;
import static GUI.Menu.MenuButtons.instructions;
import static GUI.Menu.MenuCheckBoxes.*;

import static GUI.Menu.MenuGraphicContext.*;
import static GUI.Menu.MenuImages.bannerPattern;
import static GUI.Menu.MenuImages.bigBannerPattern;
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
        configureGraphicContext();
        createMenuButtons();
        addChildrenToPanes();

    }

    private static void addChildrenToPanes() {

        menuPane.getChildren().addAll(menuSceneInnerBorder, menuSceneOuterBorder, bigBannerPattern,
                tallThinOneButton, smallWideOneButton, squareOneButton, brickOneButton,
                menuCanvasMain, menuCanvasSide, bannerPattern,
                beginGame, instructions, rollingHills, oceanSide, microsoftHills,
                musicOffCheck, musicOnCheck, tallThinGroup, shortWideOne, shortWideTwo, shortWideThree
                , brickOne, brickTwo, brickThree, tallThinOne, tallThinTwo, tallThinThree, dragAndDrop, dragAndDropTwo,
                dragAndDropThree);


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
