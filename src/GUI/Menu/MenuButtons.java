package GUI.Menu;

import javafx.scene.control.Button;

import static GUI.Menu.MenuAnimations.*;
import static GUI.Menu.MenuGraphicContext.menuCanvasSide;

public class MenuButtons {

    public static Button beginGame, instructions;

    public static void createMenuButtons(){

        initializeMenuButtons();
        configureMenuButtons();
        configureSetOnActions();

    }

    private static void configureMenuButtons() {

        configureSingleButton(beginGame, 50, 70, 480, 470);
        configureSingleButton(instructions, 50, 140, 410, 520);
    }


    private static void initializeMenuButtons() {
        beginGame = new Button();
        instructions = new Button();
    }


    private static void configureSetOnActions() {
        beginGame.setOnMouseClicked(event -> bringUpMusic());
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
