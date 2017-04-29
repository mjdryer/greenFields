package GUI.Menu;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;


public class MenuGraphicContext {

    public static Canvas menuCanvasMain, menuCanvasSide;
    public static GraphicsContext menuTitle, menuSubtitle, beginGame, instructions;
    public static Font titleFont, subtitleFont, beginFont;


    public static void configureGraphicContext(){

        congfigureCanvas();
        configureFonts();
        initializeMenuGraphicContext();
        configureMenuGraphicContext();

    }

    private static void configureMenuGraphicContext() {
        configureSingleGraphicContext(menuTitle, Paint.valueOf("white"), Paint.valueOf("black"), 2, titleFont, "GRASSY FIELDS", 260, 300);
        configureSingleGraphicContext(menuSubtitle, Paint.valueOf("white"), Paint.valueOf("black"), .5, subtitleFont, "a game for you", 440, 320);
        configureSingleGraphicContext(beginGame, Paint.valueOf("white"), Paint.valueOf("black"), .5, beginFont, "Play", 490, 500);
        configureSingleGraphicContext(instructions, Paint.valueOf("white"), Paint.valueOf("black"), .5, beginFont, "Settings", 430, 550);
    }

    private static void configureFonts() {
        titleFont = new Font("Mistral", 58);
        subtitleFont = new Font("Mistral", 22);
        beginFont = new Font("Minstral", 32);
    }

    private static void congfigureCanvas() {
        menuCanvasMain = new Canvas(600, 600);
        menuCanvasSide = new Canvas(600, 600);
    }

    private static void initializeMenuGraphicContext() {
        menuTitle = menuCanvasMain.getGraphicsContext2D();
        menuSubtitle = menuCanvasMain.getGraphicsContext2D();
        beginGame = menuCanvasSide.getGraphicsContext2D();
        instructions = menuCanvasSide.getGraphicsContext2D();
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
