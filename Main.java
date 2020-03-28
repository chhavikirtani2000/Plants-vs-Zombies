package sample;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        System.out.println("heyy");
        Parent root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 605, 415));
        primaryStage.show();
        System.out.println("heyy");
        Node zombie = (Node) primaryStage.getScene().lookup("#zombiee");
        TranslateTransition translateTransitionn = new TranslateTransition();
        translateTransitionn.setDuration(Duration.millis(21000));
        translateTransitionn.setNode(zombie);
        translateTransitionn.setByX(-250);
        translateTransitionn.setCycleCount(500);
        translateTransitionn.setAutoReverse(false);
        translateTransitionn.play();
        if(zombie!=null)
        {
            System.out.println("hi");
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
