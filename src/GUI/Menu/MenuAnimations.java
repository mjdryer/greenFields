package GUI.Menu;

import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.scene.Node;
import javafx.scene.shape.Line;
import javafx.scene.shape.Shape;
import javafx.util.Duration;

import static GUI.Menu.MenuButtons.*;
import static GUI.Menu.MenuCheckBoxes.*;
import static GUI.Menu.MenuGraphicContext.inGameCanvas;
import static GUI.Menu.MenuGraphicContext.menuCanvasMain;
import static GUI.Menu.MenuImages.bannerPattern;
import static GUI.Menu.MenuImages.bigBannerPattern;
import static GUI.Menu.MenuRectangles.*;


public class MenuAnimations {

    public static PathTransition menuTitleBounce, menuTitleLeave, checkboxOneEnter, checkboxOneLeave,
            checkboxTwoEnter, checkboxTwoLeave, checkboxThreeEnter, checkboxThreeLeave, musicOnPath,
            musicOffPath, musicOnUp, musicOffUp, bannerDown, bannerUp, groupInPath, bigBannerPath,
            squareDownPath, tallThinDownPath, smallWideDownPath, brickDownPath,
            inGameCanvasDrop,
            squareOnePath, squareTwoPath, squareThreePath,
            tallThinOnePath, tallThinTwoPath, tallThinThreePath,
            brickOnePath, brickTwoPath, brickThreePath,
            shortWideOnePath, shortWideTwoPath, shortWideThreePath;

    public static Line titleBounceLine, titleLeaveLine, checkboxOneEnterLine, checkboxOneLeaveLine,
            checkboxTwoEnterLine, checkboxTwoLeaveLine, checkboxThreeEnterLine, checkboxThreeLeaveLine,
            musicOnLine, musicOffLine, bannerDownLine, bannerUpLine, musicOnUpLine, musicOffUpLine,
            groupInLine, bigBannerLine, squareDownLine, tallThinDownLine, smallWideDownLine, brickDownLine,
            squareGroupLine, inGameCanvasLine,
            tallThinOneLine, tallThinTwoLine, tallThinThreeLine,
            brickOneLine, brickTwoLine, brickThreeLine,
            shortWideOneLine, shortWideTwoLine, shortWideThreeLine,
            squareOneLine, squareTwoLine, squareThreeLine;


    public static void configureMenuAnimations(){

        initializeMenuLines();
        configureMenuLines();
        initializeMenuPathTransition();
        configureMenuPathTransitions();
        setDelays();
        menuTitleBounce.play();
    }

    private static void configureMenuLines() {
        configureCheckBoxLines();
        configureMusicLines();
        configureTitleBannerLines();
        configureGroupLines();
    }

    private static void initializeMenuLines() {
        initializeCheckBoxLines();
        initializeBannerTitleLines();
        initializeMusicLines();
    }

    private static void configureMenuPathTransitions() {
        configureMusicPaths();
        configureCheckBoxPaths();
        configureBannerTitlePaths();
        configureGroupPaths();
    }

    private static void initializeMenuPathTransition() {
        initializeMusicPaths();
        initializeCheckBoxPaths();
        initializeBannerTitlePaths();
    }



    private static void configureGroupPaths() {
        intializeBrickGroupPaths();
        initializeTallGroupPaths();
        initializeWideGroupPaths();
        initializeSquareGroupPaths();

        configureBrickGroupPaths();
        configureTallGroupPaths();
        configureWideGroupPaths();
        configureSquareGroupPaths();

    }

    private static void configureSquareGroupPaths() {
        configureSinglePathTransition(squareOnePath, 1, 2, dragAndDrop, squareOneLine, false);
        configureSinglePathTransition(squareTwoPath, 1, 2, dragAndDropTwo, squareTwoLine, false);
        configureSinglePathTransition(squareThreePath, 1, 2, dragAndDropThree, squareThreeLine, false);
    }

    private static void initializeSquareGroupPaths() {
        squareOnePath = new PathTransition();
        squareTwoPath = new PathTransition();
        squareThreePath = new PathTransition();
    }

    private static void initializeWideGroupPaths() {
        shortWideOnePath = new PathTransition();
        shortWideTwoPath = new PathTransition();
        shortWideThreePath = new PathTransition();
    }

    private static void configureWideGroupPaths() {
        configureSinglePathTransition(shortWideOnePath, 1, 2, shortWideOne, shortWideOneLine, false);
        configureSinglePathTransition(shortWideTwoPath, 1, 2, shortWideTwo, shortWideTwoLine, false);
        configureSinglePathTransition(shortWideThreePath, 1, 2, shortWideThree, shortWideThreeLine, false);
    }

    private static void configureTallGroupPaths() {
        configureSinglePathTransition(tallThinOnePath, 1, 2, tallThinOne, tallThinOneLine, false);
        configureSinglePathTransition(tallThinTwoPath, 1, 2, tallThinTwo, tallThinTwoLine, false);
        configureSinglePathTransition(tallThinThreePath, 1, 2, tallThinThree, tallThinThreeLine, false);
    }

    private static void initializeTallGroupPaths() {
        tallThinOnePath = new PathTransition();
        tallThinTwoPath = new PathTransition();
        tallThinThreePath = new PathTransition();
    }

    private static void intializeBrickGroupPaths() {
        brickOnePath = new PathTransition();
        brickTwoPath = new PathTransition();
        brickThreePath = new PathTransition();
    }

    private static void configureBrickGroupPaths() {
        configureSinglePathTransition(brickOnePath, 1, 1, brickOne, brickOneLine, false);
        configureSinglePathTransition(brickTwoPath, 1, 1, brickTwo, brickTwoLine, false);
        configureSinglePathTransition(brickThreePath, 1, 1, brickThree, brickThreeLine, false);
    }

    private static void configureBannerTitlePaths() {
        configureSinglePathTransition(menuTitleLeave, 1, 3, menuCanvasMain, titleLeaveLine, false);
        configureSinglePathTransition(menuTitleBounce, Animation.INDEFINITE, 2, menuCanvasMain, titleBounceLine, true);
        configureSinglePathTransition(bannerDown, 1, .5, bannerPattern, bannerDownLine, false);
        configureSinglePathTransition(bannerUp, 1, .5, bannerPattern, bannerUpLine, false);
        configureSinglePathTransition(bigBannerPath, 1, 1, bigBannerPattern, bigBannerLine, false);
        configureSinglePathTransition(inGameCanvasDrop, 1, 1, inGameCanvas, inGameCanvasLine, false);
    }

    private static void configureCheckBoxPaths() {
        configureActualCheckBoxPaths();
        configureButtonPaths();
    }

    private static void configureActualCheckBoxPaths() {
        configureSinglePathTransition(checkboxOneEnter, 1, 2.5, oceanSide, checkboxOneEnterLine, false);
        configureSinglePathTransition(checkboxOneLeave, 1, 2, oceanSide, checkboxOneLeaveLine, false);
        configureSinglePathTransition(checkboxTwoEnter, 1, 2, rollingHills, checkboxTwoEnterLine, false);
        configureSinglePathTransition(checkboxTwoLeave, 1, 2, rollingHills, checkboxTwoLeaveLine, false);
        configureSinglePathTransition(checkboxThreeEnter, 1, 3, microsoftHills, checkboxThreeEnterLine, false);
        configureSinglePathTransition(checkboxThreeLeave, 1, 2, microsoftHills, checkboxThreeLeaveLine, false);

    }

    private static void configureButtonPaths() {
        configureSinglePathTransition(smallWideDownPath, 1, .5, smallWideOneButton, smallWideDownLine, false);
        configureSinglePathTransition(tallThinDownPath, 1, .5, tallThinOneButton, tallThinDownLine, false);
        configureSinglePathTransition(squareDownPath, 1, .5, squareOneButton, squareDownLine, false);
        configureSinglePathTransition(brickDownPath, 1, .5, brickOneButton, brickDownLine, false);
    }

    private static void configureMusicPaths() {
        configureSinglePathTransition(musicOnPath, 1, .5, musicOnCheck, musicOnLine, false);
        configureSinglePathTransition(musicOffPath, 1, .5, musicOffCheck, musicOffLine, false);
        configureSinglePathTransition(musicOnUp, 1, .5, musicOnCheck, musicOnUpLine, false);
        configureSinglePathTransition(musicOffUp, 1, .5, musicOffCheck, musicOffUpLine, false);
    }

    private static void configureGroupLines() {
        initializeSquareLines();
        initializeWideLines();
        initializeTallLines();
        initializeBrickLines();

        configureSquareLines();
        configureWideLiens();
        configureBrickLines();
        configureTallLines();
    }

    private static void configureSquareLines() {
        configureSingleLine(squareOneLine, 0, 300, 500, 500);
        configureSingleLine(squareTwoLine, 0, 300, 500, 500);
        configureSingleLine(squareThreeLine, 0, 300, 500, 500);
    }

    private static void initializeSquareLines() {
        squareOneLine = new Line();
        squareTwoLine = new Line();
        squareThreeLine = new Line();
    }

    private static void initializeWideLines() {
        shortWideOneLine = new Line();
        shortWideTwoLine = new Line();
        shortWideThreeLine = new Line();
    }

    private static void configureWideLiens() {
        configureSingleLine(shortWideOneLine, 0, 300, 500, 500);
        configureSingleLine(shortWideTwoLine, 0, 300, 500, 500);
        configureSingleLine(shortWideThreeLine, 0, 300, 500, 500);
    }

    private static void configureTallLines() {
        configureSingleLine(tallThinOneLine, 0, 300, 500, 500);
        configureSingleLine(tallThinTwoLine, 0, 300, 500, 500);
        configureSingleLine(tallThinThreeLine, 0, 300, 500, 500);
    }

    private static void initializeTallLines() {
        tallThinOneLine = new Line();
        tallThinTwoLine = new Line();
        tallThinThreeLine = new Line();
    }

    private static void initializeBrickLines() {
        brickOneLine = new Line();
        brickTwoLine = new Line();
        brickThreeLine = new Line();
    }

    private static void configureBrickLines() {
        configureSingleLine(brickOneLine, 0, 200, 500, 500);
        configureSingleLine(brickTwoLine, 0, 200, 500, 500);
        configureSingleLine(brickThreeLine, 0, 200, 500, 500);
    }

    private static void configureTitleBannerLines() {
        configureSingleLine(titleBounceLine, 300, 300, 260, 270);
        configureSingleLine(titleLeaveLine, 300, 300, 265, -1000);
        configureSingleLine(bannerDownLine, 150, 150, -20, 150);
        configureSingleLine(bannerUpLine, 150, 150, 150, -20);
        configureSingleLine(groupInLine, 150, 300, 150, 150);
        configureSingleLine(bigBannerLine, 260, 260, -100, 270);
        configureSingleLine(inGameCanvasLine, 300, 300, 0, 500);
    }

    private static void configureMusicLines() {
        configureSingleLine(musicOnLine, -80, -80, -20, 70);
        configureSingleLine(musicOffLine, 79, 79, -20, 100);
        configureSingleLine(musicOnUpLine, -80, -80, 70, -20);
        configureSingleLine(musicOffUpLine, 79, 79, 100, -20);
    }

    private static void configureCheckBoxLines() {
        configureSingleLine(checkboxOneEnterLine, -100, 480, 120, 120);
        configureSingleLine(checkboxTwoEnterLine, -100, 480, 130, 130);
        configureSingleLine(checkboxThreeEnterLine, -100, 480, 140, 140);
        configureSingleLine(checkboxOneLeaveLine, 480, 1140, 120, 120);
        configureSingleLine(checkboxTwoLeaveLine, 480, 1140, 130, 130);
        configureSingleLine(checkboxThreeLeaveLine, 480, 1140, 140, 140);
        configureSingleLine(smallWideDownLine, 0, 30, 0, 100);
        configureSingleLine(tallThinDownLine, 0, 280, 0, 100);
        configureSingleLine(squareDownLine, 0, 30, 0, 170);
        configureSingleLine(brickDownLine, 0, 280, 0, 170);
    }

    private static void initializeBannerTitlePaths() {
        menuTitleBounce = new PathTransition();
        menuTitleLeave = new PathTransition();
        bannerUp = new PathTransition();
        bannerDown = new PathTransition();
        groupInPath = new PathTransition();
        bigBannerPath = new PathTransition();
        inGameCanvasDrop = new PathTransition();
    }

    private static void initializeCheckBoxPaths() {
        initializeActualCheckBoxPaths();
        initializeButtonPaths();
    }

    private static void initializeButtonPaths() {
        tallThinDownPath = new PathTransition();
        smallWideDownPath = new PathTransition();
        squareDownPath = new PathTransition();
        brickDownPath = new PathTransition();
    }

    private static void initializeActualCheckBoxPaths() {
        checkboxOneEnter = new PathTransition();
        checkboxOneLeave = new PathTransition();
        checkboxTwoEnter = new PathTransition();
        checkboxTwoLeave = new PathTransition();
        checkboxThreeEnter = new PathTransition();
        checkboxThreeLeave = new PathTransition();
    }

    private static void initializeMusicPaths() {
        musicOnPath = new PathTransition();
        musicOffPath = new PathTransition();
        musicOnUp = new PathTransition();
        musicOffUp = new PathTransition();
    }

    private static void initializeMusicLines() {
        musicOnLine = new Line();
        musicOffLine = new Line();
        musicOnUpLine = new Line();
        musicOffUpLine = new Line();
    }

    private static void initializeBannerTitleLines() {
        titleBounceLine = new Line();
        titleLeaveLine = new Line();
        bannerDownLine = new Line();
        bannerUpLine = new Line();
        groupInLine = new Line();
        bigBannerLine = new Line();
        inGameCanvasLine = new Line();
    }

    private static void initializeCheckBoxLines() {
        checkboxOneEnterLine = new Line();
        checkboxOneLeaveLine = new Line();
        checkboxTwoEnterLine = new Line();
        checkboxTwoLeaveLine = new Line();
        checkboxThreeEnterLine = new Line();
        checkboxThreeLeaveLine = new Line();
        smallWideDownLine = new Line();
        tallThinDownLine = new Line();
        squareDownLine = new Line();
        brickDownLine = new Line();
    }

    private static void setDelays() {

        checkboxOneLeave.setDelay(Duration.seconds(.5));
        checkboxThreeLeave.setDelay(Duration.seconds(1));
        groupInPath.setDelay(Duration.seconds(3));
        bigBannerPath.setDelay(Duration.seconds(2));
        smallWideDownPath.setDelay(Duration.seconds(2.5));
        tallThinDownPath.setDelay(Duration.seconds(2.5));
        brickDownPath.setDelay(Duration.seconds(2.5));
        squareDownPath.setDelay(Duration.seconds(2.5));
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
