package sample;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

import java.io.IOException;
import java.util.Properties;

public class IngameController
{
    @FXML
    private Button ViewMainMenu;

    @FXML
    private Button InBackToGame;

    @FXML
    private Button InSaveGame;

    @FXML
    private Button InExit;

    @FXML
    void ExitGame(MouseEvent event) {

    }

    @FXML
    void SaveGamePage(MouseEvent event)
    {

        //serialize();
    }

    @FXML
    void ViewGamePage(MouseEvent event) {

    }

    @FXML
    void ViewMainMenu(MouseEvent event) throws IOException {

        Parent head = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        Stage stage = (Stage) ViewMainMenu.getScene().getWindow();
        stage.setScene(new Scene(head));
        stage.show();


    }
}