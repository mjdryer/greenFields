package GUI.Menu;

import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.scene.Node;
import javafx.scene.shape.Line;
import javafx.scene.shape.Shape;
import javafx.util.Duration;

import static GUI.Menu.MenuCheckBoxes.*;
import static GUI.Menu.MenuGraphicContext.menuCanvasMain;
import static GUI.Menu.MenuImages.bannerPattern;
import static GUI.Menu.MenuImages.bigBannerPattern;
import static GUI.Menu.MenuRectangles.rectangles;


public class MenuAnimations {

    public static PathTransition menuTitleBounce, menuTitleLeave, checkboxOneEnter, checkboxOneLeave,
            checkboxTwoEnter, checkboxTwoLeave, checkboxThreeEnter, checkboxThreeLeave, musicOnPath,
            musicOffPath, musicOnUp, musicOffUp, bannerDown, bannerUp, groupInPath, bigBannerPath,
            squareDownPath, tallThinDownPath, smallWideDownPath, brickDownPath;

    public static Line titleBounceLine, titleLeaveLine, checkboxOneEnterLine, checkboxOneLeaveLine, checkboxTwoEnterLine, checkboxTwoLeaveLine,
    checkboxThreeEnterLine, checkboxThreeLeaveLine, musicOnLine, musicOffLine, bannerDownLine, bannerUpLine, musicOnUpLine, musicOffUpLine,
    groupInLine, bigBannerLine, squareDownLine, tallThinDownLine, smallWideDownLine, brickDownLine;


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
    }

    private static void initializeMenuPathTransition() {
        initializeMusicPaths();
        initializeCheckBoxPaths();
        initializeBannerTitlePaths();
    }

    private static void configureBannerTitlePaths() {
        configureSinglePathTransition(menuTitleLeave, 1, 3, menuCanvasMain, titleLeaveLine, false);
        configureSinglePathTransition(menuTitleBounce, Animation.INDEFINITE, 2, menuCanvasMain, titleBounceLine, true);
        configureSinglePathTransition(bannerDown, 1, .5, bannerPattern, bannerDownLine, false);
        configureSinglePathTransition(bannerUp, 1, .5, bannerPattern, bannerUpLine, false);
        configureSinglePathTransition(groupInPath, 1, 1, rectangles, groupInLine, false);
        configureSinglePathTransition(bigBannerPath, 1, 1, bigBannerPattern, bigBannerLine, false);
    }

    private static void configureCheckBoxPaths() {
        configureSinglePathTransition(checkboxOneEnter, 1, 2.5, oceanSide, checkboxOneEnterLine, false);
        configureSinglePathTransition(checkboxOneLeave, 1, 2, oceanSide, checkboxOneLeaveLine, false);
        configureSinglePathTransition(checkboxTwoEnter, 1, 2, rollingHills, checkboxTwoEnterLine, false);
        configureSinglePathTransition(checkboxTwoLeave, 1, 2, rollingHills, checkboxTwoLeaveLine, false);
        configureSinglePathTransition(checkboxThreeEnter, 1, 3, microsoftHills, checkboxThreeEnterLine, false);
        configureSinglePathTransition(checkboxThreeLeave, 1, 2, microsoftHills, checkboxThreeLeaveLine, false);
        configureSinglePathTransition(smallWideDownPath, 1, .5, smallWideOne, smallWideDownLine, false);
        configureSinglePathTransition(tallThinDownPath, 1, .5, tallThinOne, tallThinDownLine, false);
        configureSinglePathTransition(squareDownPath, 1, .5, squareOne, squareDownLine, false);
        configureSinglePathTransition(brickDownPath, 1, .5, brickOne, brickDownLine, false);
    }

    private static void configureMusicPaths() {
        configureSinglePathTransition(musicOnPath, 1, .5, musicOnCheck, musicOnLine, false);
        configureSinglePathTransition(musicOffPath, 1, .5, musicOffCheck, musicOffLine, false);
        configureSinglePathTransition(musicOnUp, 1, .5, musicOnCheck, musicOnUpLine, false);
        configureSinglePathTransition(musicOffUp, 1, .5, musicOffCheck, musicOffUpLine, false);
    }

    private static void configureTitleBannerLines() {
        configureSingleLine(titleBounceLine, 300, 300, 260, 270);
        configureSingleLine(titleLeaveLine, 300, 300, 265, -1000);
        configureSingleLine(bannerDownLine, 150, 150, -20, 150);
        configureSingleLine(bannerUpLine, 150, 150, 150, -20);
        configureSingleLine(groupInLine, 150, 300, 150, 150);
        configureSingleLine(bigBannerLine, 260, 260, -100, 270);
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
        configureSingleLine(smallWideDownLine, 128, 128, 0, 143);
        configureSingleLine(tallThinDownLine, 120, 120, 0, 95);
        configureSingleLine(squareDownLine, 90, 90, 0, 121);
        configureSingleLine(brickDownLine, 85, 85, 0, 75);
    }

    private static void initializeBannerTitlePaths() {
        menuTitleBounce = new PathTransition();
        menuTitleLeave = new PathTransition();
        bannerUp = new PathTransition();
        bannerDown = new PathTransition();
        groupInPath = new PathTransition();
        bigBannerPath = new PathTransition();
    }

    private static void initializeCheckBoxPaths() {
        checkboxOneEnter = new PathTransition();
        checkboxOneLeave = new PathTransition();
        checkboxTwoEnter = new PathTransition();
        checkboxTwoLeave = new PathTransition();
        checkboxThreeEnter = new PathTransition();
        checkboxThreeLeave = new PathTransition();
        tallThinDownPath = new PathTransition();
        smallWideDownPath = new PathTransition();
        squareDownPath = new PathTransition();
        brickDownPath = new PathTransition();
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
