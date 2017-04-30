package GUI.Menu;

import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.TriangleMesh;
import org.w3c.dom.css.Rect;

import static GUI.Menu.MenuImages.microsoftHillsPattern;


public class MenuRectangles {

    public static Rectangle menuSceneOuterBorder, menuSceneInnerBorder, longSkinnyOne, longSkinnyTwo, longSkinnyThree;
    public static Rectangle shortWideOne, shortWideTwo, shortWideThree;
    public static Rectangle dragAndDrop, dragAndDropTwo, dragAndDropThree;
    public static double orgSceneX, orgSceneY;
    public static double orgTranslateX, orgTranslateY;

    public static void configureAllMenuRectangles(){

        initializeMenuRectangles();
        configureMenuSeneRectangles();
        setOnDrag();

    }

    private static void setOnDrag() {

        dragAndDrop.setOnMousePressed(rectangleOnMouseDragged);
        dragAndDrop.setOnMouseDragged(rectangleOnMousePressed);

        longSkinnyOne.setOnMousePressed(rectangleOnMouseDragged);
        longSkinnyOne.setOnMouseDragged(rectangleOnMousePressed);

        longSkinnyTwo.setOnMousePressed(rectangleOnMouseDragged);
        longSkinnyTwo.setOnMouseDragged(rectangleOnMousePressed);

        longSkinnyThree.setOnMousePressed(rectangleOnMouseDragged);
        longSkinnyThree.setOnMouseDragged(rectangleOnMousePressed);

    }

    static EventHandler<MouseEvent> rectangleOnMouseDragged = new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent event) {
            orgSceneX = event.getSceneX();
            orgSceneY = event.getSceneY();
            orgTranslateX = ((Rectangle)(event.getSource())).getTranslateX();
            orgTranslateY = ((Rectangle)(event.getSource())).getTranslateY();
        }
    };

    static EventHandler<MouseEvent> rectangleOnMousePressed = new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent event) {
            double offsetX = event.getSceneX() - orgSceneX;
            double offsetY = event.getSceneY() - orgSceneY;
            double newTranslateX = orgTranslateX + offsetX;
            double newTranslateY = orgTranslateY + offsetY;

            ((Rectangle)(event.getSource())).setTranslateX(newTranslateX);
            ((Rectangle)(event.getSource())).setTranslateY(newTranslateY);
        }
    };

    public static void initializeMenuRectangles(){

        menuSceneOuterBorder = new Rectangle(5, 5, 590, 590);
        menuSceneInnerBorder = new Rectangle(10, 10, 580, 580);
        dragAndDrop = new Rectangle(100, 100, 50, 50);
        longSkinnyOne = new Rectangle(100, 200, 20, 100);
        longSkinnyTwo = new Rectangle(130, 200, 20, 100);
        longSkinnyThree = new Rectangle(160, 200, 20, 100);
    }

    public static void configureMenuSeneRectangles(){

        configureSingleRectangle(menuSceneOuterBorder, 5, 10, 10, Paint.valueOf("Black"), null);
        configureSingleRectangle(menuSceneInnerBorder, 2, 5, 5, Paint.valueOf("Black"), microsoftHillsPattern);
        configureSingleRectangle(dragAndDrop, 2, 10, 10, Paint.valueOf("Black"), Paint.valueOf("Green"));
        configureSingleRectangle(longSkinnyOne, 2, 1, 1, Paint.valueOf("Black"), Paint.valueOf("Green"));
        configureSingleRectangle(longSkinnyTwo, 2, 1, 1, Paint.valueOf("Black"), Paint.valueOf("Green"));
        configureSingleRectangle(longSkinnyThree, 2, 1, 1, Paint.valueOf("Black"), Paint.valueOf("Green"));
    }

    public static void configureSingleRectangle(Rectangle rectangle, double strokeWidth, double arcWidth, double arcHeight, Paint strokeColor, Paint fillColor){

        rectangle.setStroke(strokeColor);
        rectangle.setStrokeWidth(strokeWidth);
        rectangle.setFill(fillColor);
        rectangle.setArcHeight(arcHeight);
        rectangle.setArcWidth(arcWidth);

    }
}
