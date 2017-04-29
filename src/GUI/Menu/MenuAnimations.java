package GUI.Menu;

import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.scene.Node;
import javafx.scene.shape.Line;
import javafx.scene.shape.Shape;
import javafx.util.Duration;

import static GUI.Menu.MenuCheckBoxes.microsoftHills;
import static GUI.Menu.MenuCheckBoxes.oceanSide;
import static GUI.Menu.MenuCheckBoxes.rollingHills;
import static GUI.Menu.MenuGraphicContext.menuCanvasMain;


public class MenuAnimations {

    public static PathTransition menuTitleBounce, menuTitleLeave, checkboxOneEnter, checkboxOneLeave, checkboxTwoEnter, checkboxTwoLeave,
    checkboxThreeEnter, checkboxThreeLeave;

    public static Line titleBounceLine, titleLeaveLine, checkboxOneEnterLine, checkboxOneLeaveLine, checkboxTwoEnterLine, checkboxTwoLeaveLine,
    checkboxThreeEnterLine, checkboxThreeLeaveLine;


    public static void configureMenuAnimations(){

        initializeMenuLines();
        initializeMenuPathTransition();
        setDelays();
    }

    private static void initializeMenuPathTransition() {

        menuTitleBounce = new PathTransition();
        menuTitleLeave = new PathTransition();
        checkboxOneEnter = new PathTransition();
        checkboxOneLeave = new PathTransition();
        checkboxTwoEnter = new PathTransition();
        checkboxTwoLeave = new PathTransition();
        checkboxThreeEnter = new PathTransition();
        checkboxThreeLeave = new PathTransition();

        configureSinglePathTransition(checkboxOneEnter, 1, 2.5, oceanSide, checkboxOneEnterLine, false);
        configureSinglePathTransition(checkboxOneLeave, 1, 2, oceanSide, checkboxOneLeaveLine, false);

        configureSinglePathTransition(checkboxTwoEnter, 1, 2, rollingHills, checkboxTwoEnterLine, false);
        configureSinglePathTransition(checkboxTwoLeave, 1, 2, rollingHills, checkboxTwoLeaveLine, false);

        configureSinglePathTransition(checkboxThreeEnter, 1, 3, microsoftHills, checkboxThreeEnterLine, false);
        configureSinglePathTransition(checkboxThreeLeave, 1, 2, microsoftHills, checkboxThreeLeaveLine, false);

        configureSinglePathTransition(menuTitleLeave, 1, 3, menuCanvasMain, titleLeaveLine, false);
        configureSinglePathTransition(menuTitleBounce, Animation.INDEFINITE, 2, menuCanvasMain, titleBounceLine, true);

        menuTitleBounce.play();
    }


    private static void initializeMenuLines() {

        titleBounceLine = new Line();
        titleLeaveLine = new Line();
        checkboxOneEnterLine = new Line();
        checkboxOneLeaveLine = new Line();
        checkboxTwoEnterLine = new Line();
        checkboxTwoLeaveLine = new Line();
        checkboxThreeEnterLine = new Line();
        checkboxThreeLeaveLine = new Line();

        configureSingleLine(titleBounceLine, 300, 300, 260, 270);
        configureSingleLine(titleLeaveLine, 300, 300, 265, -1000);

        configureSingleLine(checkboxOneEnterLine, -100, 480, 120, 120);
        configureSingleLine(checkboxTwoEnterLine, -100, 480, 130, 130);
        configureSingleLine(checkboxThreeEnterLine, -100, 480, 140, 140);

        configureSingleLine(checkboxOneLeaveLine, 480, 1140, 120, 120);
        configureSingleLine(checkboxTwoLeaveLine, 480, 1140, 130, 130);
        configureSingleLine(checkboxThreeLeaveLine, 480, 1140, 140, 140);
    }

    private static void setDelays() {

        checkboxOneLeave.setDelay(Duration.seconds(.5));
        checkboxThreeLeave.setDelay(Duration.seconds(1));

    }

    public static void configureSinglePathTransition(PathTransition pathTransition, int cycleCount, double duration, Node node, Shape path, boolean autoReverse){

        pathTransition.setCycleCount(cycleCount);
        pathTransition.setDuration(Duration.seconds(duration));
        pathTransition.setNode(node);
        pathTransition.setPath(path);
        pathTransition.setAutoReverse(autoReverse);
    }

    public static void configureSingleLine(Line line, int xStart, int xEnd, int yStart, int yEnd){

        line.setStartX(xStart);
        line.setEndX(xEnd);
        line.setStartY(yStart);
        line.setEndY(yEnd);

    }
}
