package sample;
import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TouchEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.HLineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.HLineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.Animation.*;
import javafx.animation.*;
import javafx.scene.layout.StackPane;
import javafx.event.EventHandler;
import javafx.scene.Scene;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import static javafx.util.Duration.*;
import java.io.FileInputStream;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller2 {
    @FXML
    private Slider sliderr;
    @FXML
    private ImageView  sunn2, icon1, icon2, icon3, icon4, icon5, icon6, level1z1;
    @FXML
    private Label score;
    @FXML
    private Circle pea1;

    private double sliderpos;
    //private int gametime=0;
    //@FXML Button button;
    public void initialize() throws FileNotFoundException {

        TranslateTransition translateTransition23 = new TranslateTransition();
        translateTransition23.setDuration(Duration.millis(21000));
        translateTransition23.setNode(level1z1);
        translateTransition23.setByX(-250);
        translateTransition23.setCycleCount(500);
        translateTransition23.setAutoReverse(false);
        translateTransition23.play();
        TranslateTransition translateTransition2 = new TranslateTransition();
        translateTransition2.setDuration(Duration.millis(21000));
        translateTransition2.setNode(sunn2);
        translateTransition2.setByY(250);
        translateTransition2.setCycleCount(500);
        translateTransition2.setAutoReverse(false);
        translateTransition2.play();

        ColorAdjust blackout = new ColorAdjust();
        blackout.setBrightness(-0.4);

        icon1.setEffect(blackout);
        icon2.setEffect(blackout);
        icon3.setEffect(blackout);
        icon6.setEffect(blackout);
        icon5.setEffect(blackout);
        AnimationTimer animator = new AnimationTimer(){
            @Override
            public void handle(long arg0) {


                sliderr.setValue(sliderr.getValue()+0.02);

                if(sliderr.getValue()>=10) {

                    level1z1.setVisible(true);


                }
                if(sliderr.getValue()>=10)
                {
                    sunn2.setVisible(true);
                }



            }
        };

        animator.start();


    }


    @FXML
    void incrementsun(MouseEvent event) throws IOException
    {
        ImageView sn=(ImageView) event.getSource();
        System.out.println(sn.getId());
        System.out.println("here");

        if(sn.getId().equals(sunn2.getId()))
        {
            System.out.println("touched");
            ColorAdjust activate = new ColorAdjust();
            activate.setBrightness(-0.2);
            sunn2.setEffect(activate);
            sunn2.setVisible(false);
            sunn2.setManaged(false);
        }
        int sc= Integer.parseInt(score.getText());
        sc=sc+25;
        String newtext=Integer.toString(sc);

        score.setText(newtext);
        if(sc>=100)
        {
            ColorAdjust activate = new ColorAdjust();
            activate.setBrightness(0.2);

            icon1.setEffect(activate);
        }
        if(sc>=50)
        {
            ColorAdjust activate = new ColorAdjust();
            activate.setBrightness(0.2);

            icon5.setEffect(activate);
            icon6.setEffect(activate);
        }
        if(sc>=200)
        {
            ColorAdjust activate = new ColorAdjust();
            activate.setBrightness(0.2);

            icon2.setEffect(activate);
        }
        if(sc>=150)
        {
            ColorAdjust activate = new ColorAdjust();
            activate.setBrightness(0.2);

            icon3.setEffect(activate);
        }


    }
    public void main(TouchEvent event ) throws IOException {


    }

    public Controller2() throws IOException {

    }

}
