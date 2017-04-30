package GUI.Menu;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.ImagePattern;


public class MenuImages {

    public static Image microsoftHillsImage = new Image("file:rollingHills.jpeg");
    public static ImagePattern microsoftHillsPattern = new ImagePattern(microsoftHillsImage);

    public static Image rollingHillsImage = new Image("file:microsoftHills.gif");
    public static ImagePattern rollingHillsPattern = new ImagePattern(rollingHillsImage);

    public static Image oceanSideImage = new Image("file:oceanSide.jpeg");
    public static ImagePattern oceanSidePattern = new ImagePattern(oceanSideImage);

    public static Image bannerImage = new Image("file:greenFieldsBanner.gif");
    public static ImageView bannerPattern = new ImageView(bannerImage);

    public static Image bigBannerImage = new Image("file:bigBanner.gif");
    public static ImageView bigBannerPattern = new ImageView(bigBannerImage);

    public static void configureImages(){

        bannerPattern.setLayoutX(20);
        bannerPattern.setLayoutY(-110);

        bigBannerPattern.setLayoutX(50);
        bigBannerPattern.setLayoutY(-200);
    }
}
