package sample;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.util.Duration;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalTime;

public class LevelsController extends javafx.scene.Parent
{
    @FXML
    private Button playbutton;

    @FXML
    void ViewMainmenu(MouseEvent event) throws IOException
    {

        Parent head = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        Stage stage = (Stage) playbutton.getScene().getWindow();
        stage.setScene(new Scene(head));
        stage.show();

    }
    @FXML
    void StartGame2(MouseEvent event) throws IOException
    {
        Parent head = FXMLLoader.load(getClass().getResource("Level2.fxml"));
        Stage stage = (Stage) playbutton.getScene().getWindow();
        stage.setScene(new Scene(head));
        stage.show();
    }
    @FXML
    void StartGame3(MouseEvent event) throws IOException
    {
        Parent head = FXMLLoader.load(getClass().getResource("Level3.fxml"));
        Stage stage = (Stage) playbutton.getScene().getWindow();
        stage.setScene(new Scene(head));
        stage.show();
    }
    @FXML
    void StartGame4(MouseEvent event) throws IOException
    {
        Parent head = FXMLLoader.load(getClass().getResource("Level4.fxml"));
        Stage stage = (Stage) playbutton.getScene().getWindow();
        stage.setScene(new Scene(head));
        stage.show();
    }
    @FXML
    void StartGame5(MouseEvent event) throws IOException
    {
        Parent head = FXMLLoader.load(getClass().getResource("Sample.fxml"));
        Stage stage = (Stage) playbutton.getScene().getWindow();
        stage.setScene(new Scene(head));
        stage.show();
    }
    @FXML
    void StartGame(MouseEvent event) throws IOException
    {
        Parent head = FXMLLoader.load(getClass().getResource("Level1.fxml"));
        Stage stage = (Stage) playbutton.getScene().getWindow();
        stage.setScene(new Scene(head));
        stage.show();
        /*LocalTime startTime = LocalTime.now();
        Node zombie = (Node) head.lookup("#zombiee");
        Node conezombie = (Node) head.lookup("#conezombiee");
        Node sun= (Node) head.lookup("#sunn");*/
        //Slider slider= head.lookup("#sliderr");

        //System.out.println("hiiii");

        //head.getChildrenUnmodifiable().add(new ImageView("Newspaper.gif"));

            /*LocalTime currentTime = LocalTime.now();
            if (currentTime.getMinute() - startTime.getMinute() > 1) {
                //System.out.println("hi");
                Node newspaper = (Node) head.lookup("#newspaper");
                newspaper.setVisible(true);
            }*/
            /*TranslateTransition translateTransition3 = new TranslateTransition();
            translateTransition3.setDuration(Duration.millis(21000));
            translateTransition3.setNode(conezombie);
            //Setting the value of the transition along the x axis.
            translateTransition3.setByX(-250);
            translateTransition3.setCycleCount(500);
            translateTransition3.setAutoReverse(false);
            //Playing the animation
            translateTransition3.play();

            TranslateTransition translateTransitionn2 = new TranslateTransition();
            translateTransitionn2.setDuration(Duration.millis(21000));
            translateTransitionn2.setNode(sun);
            translateTransitionn2.setByY(250);
            translateTransitionn2.setCycleCount(500);
            translateTransitionn2.setAutoReverse(false);
            translateTransitionn2.play();*/

            /*TranslateTransition translateTransitionn = new TranslateTransition();
            translateTransitionn.setDuration(Duration.millis(21000));
            translateTransitionn.setNode(zombie);
            translateTransitionn.setByX(-250);
            translateTransitionn.setCycleCount(500);
            translateTransitionn.setAutoReverse(false);
            translateTransitionn.play();*/
            System.out.println("hiiii22");

    }


    @FXML
    void Viewgamepage(MouseEvent event) {

    }
}