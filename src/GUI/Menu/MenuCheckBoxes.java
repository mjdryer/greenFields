package GUI.Menu;


import GUI.Main;
import javafx.scene.control.CheckBox;
import javafx.scene.input.MouseEvent;

import static GUI.Menu.MenuAnimations.*;
import static GUI.Menu.MenuImages.microsoftHillsPattern;
import static GUI.Menu.MenuImages.oceanSidePattern;
import static GUI.Menu.MenuImages.rollingHillsPattern;
import static GUI.Menu.MenuMusic.menuMusicPlayer;
import static GUI.Menu.MenuRectangles.menuSceneInnerBorder;

public class MenuCheckBoxes {

    public static CheckBox rollingHills, microsoftHills, oceanSide, musicOffCheck, musicOnCheck,
            smallWideOne, tallThinOne, squareOne, brickOne;

    public static void createMenuCheckBoxes(){
        initializeMenuCheckBoxes();
        configureMenuCheckBoxes();
    }

    private static void configureMenuCheckBoxes() {
        configureSingleCheckBox(rollingHills, -382, 350, "Green Escape");
        configureSingleCheckBox(oceanSide, -390, 395, "Oceanside");
        configureSingleCheckBox(microsoftHills, -386, 410, "Rolling Hills");
        configureSingleCheckBox(musicOffCheck, 20, -50, "No, I like it quiet!");
        configureSingleCheckBox(musicOnCheck, 200, -50, "Gimme some sound!");
        configureSingleCheckBox(tallThinOne, 100, -50, "A tall, thin one.");
        configureSingleCheckBox(smallWideOne, 100, -70, "A small, wide one.");
        configureSingleCheckBox(squareOne, 300, -50, "A square lookin' one.");
        configureSingleCheckBox(brickOne, 300, -30, "Just gimme a brick.");

        oceanSide.setOnMouseClicked(event -> configureGameBackground(event));
        rollingHills.setOnMouseClicked(event -> configureGameBackground(event));
        microsoftHills.setOnMouseClicked(event -> configureGameBackground(event));

        musicOnCheck.setOnMouseClicked(event ->  moveUpSettings());
        musicOffCheck.setOnMouseClicked(event -> moveUpSettings());
    }

    private static void moveUpSettings() {
        bannerUp.play();
        musicOnUp.play();
        musicOffUp.play();
    }

    private static void configureGameBackground(MouseEvent event) {

        if (event.getSource()==oceanSide)
            menuSceneInnerBorder.setFill(oceanSidePattern);
        else if (event.getSource()==rollingHills)
            menuSceneInnerBorder.setFill(rollingHillsPattern);
        else if (event.getSource()==microsoftHills)
            menuSceneInnerBorder.setFill(microsoftHillsPattern);

        checkboxOneLeave.play();
        checkboxTwoLeave.play();
        checkboxThreeLeave.play();
        bigBannerPath.play();
        smallWideDownPath.play();
        tallThinDownPath.play();
        brickDownPath.play();
        squareDownPath.play();
    }

    private static void initializeMenuCheckBoxes() {
        rollingHills = new CheckBox();
        microsoftHills = new CheckBox();
        oceanSide = new CheckBox();
        musicOffCheck = new CheckBox();
        musicOnCheck = new CheckBox();
        smallWideOne = new CheckBox();
        tallThinOne = new CheckBox();
        squareOne = new CheckBox();
        brickOne = new CheckBox();
    }

    private static void configureSingleCheckBox(CheckBox checkBox, double xPos, double yPos, String text){
        checkBox.setLayoutX(xPos);
        checkBox.setLayoutY(yPos);
        checkBox.setText(text);

    }


}
