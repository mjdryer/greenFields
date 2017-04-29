package GUI.Menu;

import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.scene.shape.Line;
import static GUI.Menu.MenuGraphicContext.menuCanvasMain;


public class MenuAnimations {

    public static PathTransition menuStayPath, menuLeavePath;
    public static Line menuStayLine, menuLeaveLine;


    public static void configureMenuAnimations(){

        initializeMenuLines();
        initializeMenuPathTransition();

    }

    private static void initializeMenuPathTransition() {

        menuStayPath = new PathTransition();
        menuStayPath.setCycleCount(Animation.INDEFINITE);
        menuStayPath.setDuration(javafx.util.Duration.seconds(2));
        menuStayPath.setNode(menuCanvasMain);
        menuStayPath.setAutoReverse(true);
        menuStayPath.setPath(menuStayLine);
        menuStayPath.play();

        menuLeavePath = new PathTransition();
        menuLeavePath.setCycleCount(1);
        menuLeavePath.setDuration(javafx.util.Duration.seconds(3));
        menuLeavePath.setNode(menuCanvasMain);
        menuLeavePath.setPath(menuLeaveLine);
    }


    private static void initializeMenuLines() {

        menuStayLine = new Line();
        menuStayLine.setStartY(260);
        menuStayLine.setEndY(270);
        menuStayLine.setStartX(300);
        menuStayLine.setEndX(300);

        menuLeaveLine = new Line();
        menuLeaveLine.setStartX(300);
        menuLeaveLine.setEndX(300);
        menuLeaveLine.setStartY(265);
        menuLeaveLine.setEndY(-1000);
    }

}
