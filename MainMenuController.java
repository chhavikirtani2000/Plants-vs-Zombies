package sample;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Properties;

public class MainMenuController
{
    @FXML
    private Button startgame;
    @FXML
    private TextArea pname;
    @FXML
    private String playername="chhavi";

    @FXML
    private Button chooselevel;

    @FXML
    private Button loadgame;

    @FXML
    private Button exit;

    @FXML
    void ExitGame(MouseEvent event) {

    }

    @FXML
    void ViewGamePage(MouseEvent event) throws IOException {

        Parent head = FXMLLoader.load(getClass().getResource("testingck.fxml"));
        Stage stage = (Stage) startgame.getScene().getWindow();
        stage.setScene(new Scene(head));
        stage.show();

    }

    @FXML
    void ViewLevels(MouseEvent event) {


    }

    @FXML
    void ViewSavedGames(MouseEvent event) {
        File f=new File(playername+".txt");
        String ff=playername+".txt";
        if(f.exists())
        {
            try {
                deserialize(ff);
            }
            catch(Exception e){
                System.out.println("Exception");
            }
        }

    }
    public AnchorPane deserialize(String s) throws IOException,ClassNotFoundException
    {
        FileInputStream f = new FileInputStream(s);
        ObjectInputStream o = null;
        AnchorPane gameP=null;
        try
        {
            o = new ObjectInputStream(f);
            gameP = (AnchorPane) o.readObject();
            if(gameP==null)
            {
                System.out.println("No Saved Game");
            }
        }
        finally
        {
            o.close();
            f.close();
            return gameP;
        }
    }
}