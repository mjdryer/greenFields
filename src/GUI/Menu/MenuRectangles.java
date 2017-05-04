package GUI.Menu;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

import java.util.Random;

import static GUI.Menu.MenuImages.microsoftHillsPattern;


public class MenuRectangles {

    public static Rectangle menuSceneOuterBorder, menuSceneInnerBorder, tallThinOne, tallThinTwo, tallThinThree;
    public static Rectangle shortWideOne, shortWideTwo, shortWideThree;
    public static Rectangle dragAndDrop, dragAndDropTwo, dragAndDropThree;
    public static Rectangle brickOne, brickTwo, brickThree;
    public static Group tallThinGroup, shortWideGroup, brickGroup, squareGroup;
    public static double orgSceneX, orgSceneY;
    public static double orgTranslateX, orgTranslateY;

    public static void configureAllMenuRectangles(){

        initializeMenuRectangles();
        configureMenuSeneRectangles();
        setOnDrag();
        initializeGroup();

    }

    private static void initializeGroup() {
        shortWideGroup = new Group();
        tallThinGroup = new Group();
        brickGroup = new Group();
        squareGroup = new Group();
        setLayoutsOfGroups();
        configureGroups();
    }

    private static void configureGroups() {
        shortWideGroup.getChildren().addAll(shortWideOne, shortWideTwo, shortWideThree);
        squareGroup.getChildren().addAll(dragAndDrop, dragAndDropTwo, dragAndDropThree);
    }

    private static void setLayoutsOfGroups() {
        shortWideGroup.setLayoutX(-200);
        shortWideGroup.setLayoutY(300);
        squareGroup.setLayoutX(-200);
        squareGroup.setLayoutY(300);
    }

    private static void setOnDrag() {

        squareSetOnDrop();
        tallThinSetOnDrop();
        shortWideSetOnDrop();
        brickSetOnDrop();

    }

    private static void brickSetOnDrop() {

        brickOne.setOnMousePressed(rectangleOnMouseDragged);
        brickOne.setOnMouseDragged(rectangleOnMousePressed);
        brickOne.setOnMouseClicked(event -> setGravity(brickOne));

        brickTwo.setOnMousePressed(rectangleOnMouseDragged);
        brickTwo.setOnMouseDragged(rectangleOnMousePressed);
        brickTwo.setOnMouseClicked(event -> setGravity(brickTwo));

        brickThree.setOnMousePressed(rectangleOnMouseDragged);
        brickThree.setOnMouseDragged(rectangleOnMousePressed);
        brickThree.setOnMouseClicked(event -> setGravity(brickThree));
    }

    private static void shortWideSetOnDrop() {

        shortWideOne.setOnMousePressed(rectangleOnMouseDragged);
        shortWideOne.setOnMouseDragged(rectangleOnMousePressed);
        shortWideOne.setOnMouseClicked(event -> setGravity(shortWideOne));

        shortWideTwo.setOnMousePressed(rectangleOnMouseDragged);
        shortWideTwo.setOnMouseDragged(rectangleOnMousePressed);
        shortWideTwo.setOnMouseClicked(event -> setGravity(shortWideTwo));

        shortWideThree.setOnMousePressed(rectangleOnMouseDragged);
        shortWideThree.setOnMouseDragged(rectangleOnMousePressed);
        shortWideThree.setOnMouseClicked(event -> setGravity(shortWideThree));
    }

    private static void tallThinSetOnDrop() {

        tallThinOne.setOnMousePressed(rectangleOnMouseDragged);
        tallThinOne.setOnMouseDragged(rectangleOnMousePressed);
        tallThinOne.setOnMouseClicked(event -> setGravity(tallThinOne));

        tallThinTwo.setOnMousePressed(rectangleOnMouseDragged);
        tallThinTwo.setOnMouseDragged(rectangleOnMousePressed);
        tallThinTwo.setOnMouseClicked(event -> setGravity(tallThinTwo));

        tallThinThree.setOnMousePressed(rectangleOnMouseDragged);
        tallThinThree.setOnMouseDragged(rectangleOnMousePressed);
        tallThinThree.setOnMouseClicked(event -> setGravity(tallThinThree));
    }

    private static void squareSetOnDrop() {

        dragAndDrop.setOnMousePressed(rectangleOnMouseDragged);
        dragAndDrop.setOnMouseDragged(rectangleOnMousePressed);
        dragAndDrop.setOnMouseClicked(event -> setGravity(dragAndDrop));

        dragAndDropTwo.setOnMousePressed(rectangleOnMouseDragged);
        dragAndDropTwo.setOnMouseDragged(rectangleOnMousePressed);
        dragAndDropTwo.setOnMouseClicked(event -> setGravity(dragAndDropTwo));

        dragAndDropThree.setOnMousePressed(rectangleOnMouseDragged);
        dragAndDropThree.setOnMouseDragged(rectangleOnMousePressed);
        dragAndDropThree.setOnMouseClicked(event -> setGravity(dragAndDropThree));
    }

    private static void setGravity(Rectangle rectangle) {
        Random chooseColor = new Random();
        int colorChoice = chooseColor.nextInt(6);
        if (colorChoice == 0)
            rectangle.setFill(Paint.valueOf("Blue"));
        else if (colorChoice == 1)
            rectangle.setFill(Paint.valueOf("Red"));
        else if (colorChoice == 2)
            rectangle.setFill(Paint.valueOf("Orange"));
        else if (colorChoice == 3)
            rectangle.setFill(Paint.valueOf("Green"));
        else if (colorChoice == 4)
            rectangle.setFill(Paint.valueOf("Purple"));
        else
            rectangle.setFill(Paint.valueOf("Pink"));
    }

    static EventHandler<MouseEvent> rectangleOnMouseDragged = new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent event) {
            orgSceneX = event.getSceneX();
            orgSceneY = event.getSceneY();
            orgTranslateX = ((Rectangle)(event.getSource())).getTranslateX();
            orgTranslateY = ((Rectangle)(event.getSource())).getTranslateY();
            System.out.println("CLICKED");
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

        initializeTallThin();
        initializeBrick();
        initializeShortWide();
        initializeSquare();
        initializeOther();
    }

    private static void initializeOther() {
        menuSceneOuterBorder = new Rectangle(5, 5, 590, 590);
        menuSceneInnerBorder = new Rectangle(10, 10, 580, 580);
    }

    private static void initializeSquare() {
        dragAndDrop = new Rectangle(50, -100, 50, 50);
        dragAndDropTwo = new Rectangle(50, -150, 50, 50);
        dragAndDropThree = new Rectangle(50, -200, 50, 50);
    }

    private static void initializeShortWide() {
        shortWideOne = new Rectangle(-100, 100, 100, 20);
        shortWideTwo = new Rectangle(-100, 135, 100, 20);
        shortWideThree = new Rectangle(-100, 170, 100, 20);
    }

    private static void initializeBrick() {
        brickOne = new Rectangle(-150, 400, 70, 35);
        brickTwo = new Rectangle(-150, 400, 70, 35);
        brickThree = new Rectangle(-150, 400, 70, 35);
    }

    private static void initializeTallThin() {
        tallThinOne = new Rectangle(100, -200, 20, 100);
        tallThinTwo = new Rectangle(130, -200, 20, 100);
        tallThinThree = new Rectangle(160, -200, 20, 100);
    }


    public static void configureMenuSeneRectangles(){
        configureShortWide();
        configureSquare();
        configureTallThin();
        configureBrick();
        configureOther();
        }

    private static void configureBrick() {
        configureSingleRectangle(brickOne, 2, 1, 1, Paint.valueOf("Black"), Paint.valueOf("Green"));
        configureSingleRectangle(brickTwo, 2, 1, 1, Paint.valueOf("Black"), Paint.valueOf("Green"));
        configureSingleRectangle(brickThree, 2, 1, 1, Paint.valueOf("Black"), Paint.valueOf("Green"));
    }

    private static void configureOther() {
        configureSingleRectangle(menuSceneOuterBorder, 5, 10, 10, Paint.valueOf("Black"), null);
        configureSingleRectangle(menuSceneInnerBorder, 2, 5, 5, Paint.valueOf("Black"), microsoftHillsPattern);

    }

    private static void configureTallThin() {
        configureSingleRectangle(tallThinOne, 2, 1, 1, Paint.valueOf("Black"), Paint.valueOf("Green"));
        configureSingleRectangle(tallThinTwo, 2, 1, 1, Paint.valueOf("Black"), Paint.valueOf("Green"));
        configureSingleRectangle(tallThinThree, 2, 1, 1, Paint.valueOf("Black"), Paint.valueOf("Green"));

    }

    private static void configureSquare() {
        configureSingleRectangle(dragAndDrop, 2, 10, 10, Paint.valueOf("Black"), Paint.valueOf("Green"));
        configureSingleRectangle(dragAndDropTwo, 2, 10, 10, Paint.valueOf("Black"), Paint.valueOf("Green"));
        configureSingleRectangle(dragAndDropThree, 2, 10, 10, Paint.valueOf("Black"), Paint.valueOf("Green"));
    }

    private static void configureShortWide() {
        configureSingleRectangle(shortWideOne, 2, 1, 1, Paint.valueOf("Black"), Paint.valueOf("Green"));
        configureSingleRectangle(shortWideTwo, 2, 1, 1, Paint.valueOf("Black"), Paint.valueOf("Green"));
        configureSingleRectangle(shortWideThree, 2, 1, 1, Paint.valueOf("Black"), Paint.valueOf("Green"));
    }

    public static void configureSingleRectangle(Rectangle rectangle, double strokeWidth, double arcWidth, double arcHeight, Paint strokeColor, Paint fillColor){

        rectangle.setStroke(strokeColor);
        rectangle.setStrokeWidth(strokeWidth);
        rectangle.setFill(fillColor);
        rectangle.setArcHeight(arcHeight);
        rectangle.setArcWidth(arcWidth);

    }
}
