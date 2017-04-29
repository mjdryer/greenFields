package GUI.Menu;


import GUI.Main;
import javafx.scene.control.CheckBox;
import javafx.scene.input.MouseEvent;

import static GUI.Menu.MenuAnimations.*;
import static GUI.Menu.MenuImages.microsoftHillsPattern;
import static GUI.Menu.MenuImages.oceanSidePattern;
import static GUI.Menu.MenuImages.rollingHillsPattern;
import static GUI.Menu.MenuRectangles.menuSceneInnerBorder;

public class MenuCheckBoxes {

    public static CheckBox rollingHills, microsoftHills, oceanSide;

    public static void createMenuCheckBoxes(){
        initializeMenuCheckBoxes();
        configureMenuCheckBoxes();
    }

    private static void configureMenuCheckBoxes() {
        configureSingleCheckBox(rollingHills, -382, 350, "Rolling Hills");
        configureSingleCheckBox(oceanSide, -386, 395, "Oceanside");
        configureSingleCheckBox(microsoftHills, -375, 410, "Microsoft Hills");

        oceanSide.setOnMouseClicked(event -> configureGameBackground(event));
        rollingHills.setOnMouseClicked(event -> configureGameBackground(event));
        microsoftHills.setOnMouseClicked(event -> configureGameBackground(event));
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
    }

    private static void initializeMenuCheckBoxes() {
        rollingHills = new CheckBox();
        microsoftHills = new CheckBox();
        oceanSide = new CheckBox();
    }

    private static void configureSingleCheckBox(CheckBox checkBox, double xPos, double yPos, String text){
        checkBox.setLayoutX(xPos);
        checkBox.setLayoutY(yPos);
        checkBox.setText(text);

    }


}
