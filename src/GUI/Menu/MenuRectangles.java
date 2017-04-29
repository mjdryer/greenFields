package GUI.Menu;

import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

import static GUI.Menu.MenuImages.microsoftHillsPattern;
import static GUI.Menu.MenuImages.oceanSidePattern;
import static GUI.Menu.MenuImages.rollingHillsPattern;


public class MenuRectangles {

    public static Rectangle menuSceneOuterBorder, menuSceneInnerBorder;


    public static void configureAllMenuRectangles(){

        initializeMenuRectangles();
        configureMenuSeneRectangles();

    }

    public static void initializeMenuRectangles(){

        menuSceneOuterBorder = new Rectangle(5, 5, 590, 590);
        menuSceneInnerBorder = new Rectangle(10, 10, 580, 580);

    }

    public static void configureMenuSeneRectangles(){

        configureSingleRectangle(menuSceneOuterBorder, 5, 10, 10, Paint.valueOf("Black"), null);
        configureSingleRectangle(menuSceneInnerBorder, 2, 5, 5, Paint.valueOf("Black"), rollingHillsPattern);
    }

    public static void configureSingleRectangle(Rectangle rectangle, double strokeWidth, double arcWidth, double arcHeight, Paint strokeColor, Paint fillColor){

        rectangle.setStroke(strokeColor);
        rectangle.setStrokeWidth(strokeWidth);
        rectangle.setFill(fillColor);
        rectangle.setArcHeight(arcHeight);
        rectangle.setArcWidth(arcWidth);

    }
}
