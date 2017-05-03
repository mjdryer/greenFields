package GUI.Menu;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;


public class MenuGraphicContext {

    public static Canvas menuCanvasMain, menuCanvasSide, inGameCanvas;
    public static GraphicsContext menuTitle, menuSubtitle, beginGame, instructions, tallOne, wideOne, brick, square;
    public static Font titleFont, subtitleFont, beginFont, buttonFont;


    public static void configureGraphicContext(){

        congfigureCanvas();
        configureFonts();
        initializeMenuGraphicContext();
        configureMenuGraphicContext();

    }

    private static void configureMenuGraphicContext() {
        configureSingleGraphicContext(menuTitle, Paint.valueOf("white"), Paint.valueOf("black"), 2, titleFont, "Olivia's Fort", 280, 300);
        configureSingleGraphicContext(menuSubtitle, Paint.valueOf("white"), Paint.valueOf("black"), .5, subtitleFont, "a game for you", 420, 320);
        configureSingleGraphicContext(beginGame, Paint.valueOf("white"), Paint.valueOf("black"), .5, beginFont, "Play", 490, 500);
        configureSingleGraphicContext(instructions, Paint.valueOf("white"), Paint.valueOf("black"), .5, beginFont, "Settings", 430, 550);
        configureSingleGraphicContext(tallOne, Paint.valueOf("White"), Paint.valueOf("Black"), .5, buttonFont, "TALL ONE", 100, 10);



    }

    private static void configureFonts() {
        titleFont = new Font("Mistral", 58);
        subtitleFont = new Font("Mistral", 24);
        beginFont = new Font("Minstral", 32);
        buttonFont = new Font("Minstral", 22);
    }

    private static void congfigureCanvas() {
        menuCanvasMain = new Canvas(600, 600);
        menuCanvasSide = new Canvas(600, 600);
        inGameCanvas = new Canvas(600, 600);
    }

    private static void initializeMenuGraphicContext() {
        menuTitle = menuCanvasMain.getGraphicsContext2D();
        menuSubtitle = menuCanvasMain.getGraphicsContext2D();

        beginGame = menuCanvasSide.getGraphicsContext2D();
        instructions = menuCanvasSide.getGraphicsContext2D();

        square = inGameCanvas.getGraphicsContext2D();
        brick = inGameCanvas.getGraphicsContext2D();
        tallOne = inGameCanvas.getGraphicsContext2D();
        wideOne = inGameCanvas.getGraphicsContext2D();
    }


    public static void configureSingleGraphicContext(GraphicsContext gc, Paint fillColor, Paint strokeColor, double lineWidth, Font font, String text, double xPos, double yPos){

        gc.setFill(fillColor);
        gc.setStroke(strokeColor);
        gc.setLineWidth(lineWidth);
        gc.setFont(font);
        gc.fillText(text, xPos, yPos);
        gc.strokeText(text, xPos, yPos);

    }

}
