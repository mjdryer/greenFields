package GUI.Menu;

import javafx.scene.control.Button;

import static GUI.Menu.MenuAnimations.*;
import static GUI.Menu.MenuGraphicContext.menuCanvasSide;
import static GUI.Menu.MenuGraphicContext.subtitleFont;

public class MenuButtons {

    public static Button beginGame, instructions, tallThinOneButton, smallWideOneButton, brickOneButton, squareOneButton;
    public static int brickCounter, tallThinCounter, shortWideCounter, squareCounter;

    public static void createMenuButtons(){
        initializeCounters();
        initializeMenuButtons();
        configureMenuButtons();
        configureSetOnActions();
    }

    private static void initializeCounters() {
        brickCounter = 0;
        tallThinCounter = 0;
        shortWideCounter = 0;
        squareCounter = 0;
    }

    private static void configureMenuButtons() {

        configureSingleButton(beginGame, 50, 70, 480, 470);
        configureSingleButton(instructions, 50, 140, 410, 520);

        configureSingleButton(tallThinOneButton, 8, 150, 100, -57);
        configureSingleButton(smallWideOneButton, 8, 150, 200, -57);
        configureSingleButton(brickOneButton, 8, 150, 100, -93);
        configureSingleButton(squareOneButton, 8, 150, 200, -93);

    }


    private static void initializeMenuButtons() {
        beginGame = new Button();
        instructions = new Button();
        tallThinOneButton = new Button("TALL ONE");
        smallWideOneButton = new Button("WIDE ONE");
        brickOneButton = new Button("BRICK ONE");
        squareOneButton = new Button("SQUARE ONE");
        tallThinOneButton.setFont(subtitleFont);
        smallWideOneButton.setFont(subtitleFont);
        brickOneButton.setFont(subtitleFont);
        squareOneButton.setFont(subtitleFont);
    }


    private static void configureSetOnActions() {
        beginGame.setOnMouseClicked(event -> bringUpMusic());
        instructions.setOnMouseClicked(event -> dropDownMusic());
        tallThinOneButton.setOnAction(event ->  giveTallThinRectangleToPlayer());
        smallWideOneButton.setOnAction(event ->  giveShortWideRectangleToPlayer());
        brickOneButton.setOnAction(event ->  giveBrickRectangleToPlayer());
        squareOneButton.setOnAction(event ->  giveSquareRectangleToPlayer());
    }

    private static void giveSquareRectangleToPlayer() {
        if (squareCounter == 0)
            squareOnePath.play();
        if (squareCounter == 1)
            squareTwoPath.play();
        if (squareCounter == 2)
            squareThreePath.play();

        squareCounter++;
    }

    private static void giveShortWideRectangleToPlayer() {
        if (shortWideCounter == 0)
            shortWideOnePath.play();
        if (shortWideCounter == 1)
            shortWideTwoPath.play();
        if (shortWideCounter == 2)
            shortWideThreePath.play();

        shortWideCounter++;
    }

    private static void giveTallThinRectangleToPlayer() {
        if (tallThinCounter == 0)
            tallThinOnePath.play();
        if (tallThinCounter == 1)
            tallThinTwoPath.play();
        if (tallThinCounter == 2)
            tallThinThreePath.play();

        tallThinCounter++;
    }

    private static void giveBrickRectangleToPlayer() {
        if (brickCounter == 0)
            brickOnePath.play();
        if (brickCounter == 1)
            brickTwoPath.play();
        if (brickCounter == 2)
            brickThreePath.play();

        brickCounter++;
    }

    private static void dropDownMusic() {
        musicOffPath.play();
        musicOnPath.play();
        bannerDown.play();
        System.out.println("This works");
    }

    private static void bringUpMusic() {
        menuTitleLeave.play();
        menuTitleBounce.stop();
        menuCanvasSide.setVisible(false);
        checkboxOneEnter.play();
        checkboxTwoEnter.play();
        checkboxThreeEnter.play();
    }


    private static void configureSingleButton(Button button, double height, double width, double xPos, double yPos){

        button.setPrefSize(width, height);
        button.setLayoutY(yPos);
        button.setLayoutX(xPos);
        button.setStyle("-fx-background-color: transparent; -fx-border-color: transparent");
    }



}
