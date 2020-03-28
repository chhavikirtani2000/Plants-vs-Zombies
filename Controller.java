package sample;
import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.input.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
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
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller {
    @FXML
    private Slider sliderr;
    @FXML
    private ImageView normzombie, tryzombie, tryz2, tryz22, sunn2,sun3, sun4,sun5, vtry, icon1, icon2, icon3, icon4, icon5, icon6, normzombie2, newsz, wave1, wave2, wave3, lawnmowerr1, lawnmowerr2,lawnmowerr3, lawnmowerr4, lawnmowerr5;
    @FXML
    private Label score;
    @FXML
    private Circle pea1;
    @FXML
    private ImageView g1, placewhat;
    @FXML
    public AnchorPane gamee;
    @FXML
    public String name;
    @FXML
    public int suncount=75;
    @FXML
    Button ingame;
    //private int gametime=0;
    //@FXML Button button;
    @FXML
    public ArrayList<Node> allplants=new ArrayList<Node>();
    public ArrayList<Integer> plantpowers=new ArrayList<Integer>();
    public ArrayList<Node> allzombies=new ArrayList<Node>();
    public ArrayList<Integer> zombiepowers=new ArrayList<Integer>();
    public ArrayList<String> planttypes=new ArrayList<String>();
    public ArrayList<String> zombiestypes=new ArrayList<String>();
    public ArrayList<Node> lawnmowerlist=new ArrayList<Node>();


    public void initialize() throws FileNotFoundException {
        lawnmowerlist.add(lawnmowerr1);
        lawnmowerlist.add(lawnmowerr2);
        lawnmowerlist.add(lawnmowerr3);
        lawnmowerlist.add(lawnmowerr4);
        lawnmowerlist.add(lawnmowerr5);
        allplants.add(pea1);
        plantpowers.add(5);
        planttypes.add("pea");
        allplants.add(newsz);
        plantpowers.add(10);
        planttypes.add("shooter");
        TranslateTransition translateTransition23 = new TranslateTransition();
        translateTransition23.setDuration(Duration.millis(21000));
        translateTransition23.setNode(vtry);
        translateTransition23.setByX(-250);
        translateTransition23.setCycleCount(500);
        //translateTransition23.setAutoReverse(false);
        translateTransition23.play();
        TranslateTransition translateTransition3333 = new TranslateTransition();
        translateTransition3333.setDuration(Duration.millis(21000));
        translateTransition3333.setNode(tryzombie);
        translateTransition3333.setByX(-250);
        translateTransition3333.setCycleCount(500);
        //translateTransition3333.setAutoReverse(false);
        translateTransition3333.play();
        TranslateTransition translateTransition33333 = new TranslateTransition();
        translateTransition33333.setDuration(Duration.millis(21000));
        translateTransition33333.setNode(tryz2);
        translateTransition33333.setByX(-250);
        translateTransition33333.setCycleCount(500);
        //translateTransition33333.setAutoReverse(false);
        translateTransition33333.play();
        TranslateTransition translateTransition33332 = new TranslateTransition();
        translateTransition33332.setDuration(Duration.millis(21000));
        translateTransition33332.setNode(sunn2);
        translateTransition33332.setByY(250);
        translateTransition33332.setCycleCount(500);
        //translateTransition33332.setAutoReverse(false);
        translateTransition33332.play();
        TranslateTransition translateTransition34 = new TranslateTransition();
        translateTransition33332.setDuration(Duration.millis(21000));
        translateTransition33332.setNode(sun5);
        translateTransition33332.setByY(250);
        translateTransition33332.setCycleCount(500);
        //translateTransition33332.setAutoReverse(false);
        translateTransition33332.play();
        TranslateTransition translateTransition35 = new TranslateTransition();
        translateTransition33332.setDuration(Duration.millis(21000));
        translateTransition33332.setNode(sun3);
        translateTransition33332.setByY(250);
        translateTransition33332.setCycleCount(500);
        //translateTransition33332.setAutoReverse(false);
        translateTransition33332.play();
        TranslateTransition translateTransition36 = new TranslateTransition();
        translateTransition33332.setDuration(Duration.millis(21000));
        translateTransition33332.setNode(sun4);
        translateTransition33332.setByY(250);
        translateTransition33332.setCycleCount(500);
        //translateTransition33332.setAutoReverse(false);
        translateTransition33332.play();
        TranslateTransition translateTransition2 = new TranslateTransition();
        translateTransition2.setDuration(Duration.millis(21000));
        translateTransition2.setNode(pea1);
        translateTransition2.setByX(250);
        translateTransition2.setCycleCount(500);
        //translateTransition2.setAutoReverse(false);
        translateTransition2.play();
        TranslateTransition translateTransition33 = new TranslateTransition();
        translateTransition33.setDuration(Duration.millis(21000));
        translateTransition33.setNode(normzombie);
        translateTransition33.setByX(-250);
        translateTransition33.setCycleCount(500);
        //translateTransition33.setAutoReverse(false);
        translateTransition33.play();
        TranslateTransition translateTransitio1 = new TranslateTransition();
        translateTransitio1.setDuration(Duration.millis(21000));
        translateTransitio1.setNode(wave1);
        translateTransitio1.setByX(-250);
        translateTransitio1.setCycleCount(500);
        //translateTransitio1.setAutoReverse(false);
        translateTransitio1.play();
        TranslateTransition translateTransitio2 = new TranslateTransition();
        translateTransitio2.setDuration(Duration.millis(21000));
        translateTransitio2.setNode(wave2);
        translateTransitio2.setByX(-250);
        translateTransitio2.setCycleCount(500);
        //translateTransitio2.setAutoReverse(false);
        translateTransitio2.play();
        TranslateTransition translateTransitio3 = new TranslateTransition();
        translateTransitio3.setDuration(Duration.millis(21000));
        translateTransitio3.setNode(wave3);
        translateTransitio3.setByX(-250);
        translateTransitio3.setCycleCount(500);
        //translateTransitio3.setAutoReverse(false);
        translateTransitio3.play();

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
                //System.out.println("hiiyy");
                String newtext2=Integer.toString(suncount);
                //suncount=suncount+25;

                score.setText(newtext2);
                sliderr.setValue(sliderr.getValue()+0.02);
                if(sliderr.getValue()>15)
                {
                    sunn2.setVisible(true);
                    vtry.setVisible(true);

                    allzombies.add(vtry);
                    zombiepowers.add(80);
                    //vtry.setLayoutX();
                }
                if(sliderr.getValue()>30) {
                    normzombie.setVisible(true);
                    sun3.setVisible(true);
                    allzombies.add(normzombie);
                    zombiepowers.add(140);

                }
                if(sliderr.getValue()>50)
                {
                    tryz2.setVisible(true);
                    allzombies.add(tryz2);
                    zombiepowers.add(160);
                    //vtry.setVisible(true);
                }
                if(sliderr.getValue()>80)
                {
                    tryzombie.setVisible(true);
                    normzombie2.setVisible(true);
                    allzombies.add(tryzombie);
                    zombiepowers.add(100);
                    allzombies.add(normzombie2);
                    zombiepowers.add(130);
                    sun4.setVisible(true);
                }
                if(sliderr.getValue()>200)
                {
                    tryz22.setVisible(true);
                    allzombies.add(tryz22);
                    zombiepowers.add(170);
                    sun5.setVisible(true);
                }
                if(sliderr.getValue()>300)
                {
                    wave1.setVisible(true);
                    wave2.setVisible(true);
                    wave3.setVisible(true);
                    allzombies.add(wave1);
                    zombiepowers.add(150);
                    allzombies.add(wave2);
                    zombiepowers.add(200);
                    allzombies.add(wave3);
                    zombiepowers.add(180);
                }
                /*for (Node component : gamee.getChildren())
                {
                    for (Node component2 : gamee.getChildren())
                    {
                        if((component.getId().equals(pea1)) && (component2.getId().equals(vtry))){}
                    }
                }
                /*vtry.setLayoutX(vtry.getLayoutX()-0.003);
                pea1.setLayoutX(pea1.getLayoutX()+0.003);
                System.out.println(vtry.getLayoutX());
                System.out.println(pea1.getLayoutX());*/
                //System.out.println(pea1.getCenterY());
                //System.out.println(vtry.getY());

                //Shape intersect = Shape.intersect(vtry, pea1);
                if(vtry.getBoundsInParent().intersects(pea1.getBoundsInParent()))
                {
                    //System.out.println("Collision detected");
                }
                for(int i=0;i<allzombies.size();i++) {
                    if(zombiepowers.get(i)<0)
                    {
                        gamee.getChildren().remove(allzombies.get(i));
                    }
                }
                for(int j=0;j<allplants.size();j++)
                {
                    if(plantpowers.get(j)<0)
                    {
                        gamee.getChildren().remove(allplants.get(j));
                    }
                }
                for(int i=0;i<allzombies.size();i++) {
                    for (int j = 0; j < lawnmowerlist.size(); j++) {
                        if(allzombies.get(i).getBoundsInParent().intersects(lawnmowerlist.get(j).getBoundsInParent()))
                        {
                            TranslateTransition translateTransition2 = new TranslateTransition();
                            translateTransition2.setDuration(Duration.millis(2100));
                            lawnmowerlist.get(j).toFront();
                            translateTransition2.setNode(lawnmowerlist.get(j));
                            translateTransition2.setByX(250);
                            translateTransition2.setCycleCount(500);
                            //translateTransition2.setAutoReverse(false);
                            translateTransition2.play();
                            gamee.getChildren().remove(allzombies.get(i));
                        }

                    }
                }
                for(int i=0;i<allzombies.size();i++)
                {
                    for(int j=0;j<allplants.size();j++)
                    {
                        if(allzombies.get(i).getBoundsInParent().intersects(allplants.get(j).getBoundsInParent()))
                        {
                            //System.out.println("Collision between");
                            //System.out.println(allzombies.get(i).getId());

                            //System.out.println(allplants.get(j).getId());
                            ColorAdjust degrade1 = new ColorAdjust();
                            degrade1.setBrightness(zombiepowers.get(i)*0.006*(-1)+1);
                            ColorAdjust degrade2 = new ColorAdjust();
                            degrade2.setBrightness(plantpowers.get(j)*0.006*(-1)+1);
                            zombiepowers.set(i,zombiepowers.get(i)-1);

                            if(planttypes.get(j).equals("potato") || planttypes.get(j).equals("cherry"))
                            {
                                gamee.getChildren().remove(allplants.get(j));
                            }
                            allzombies.get(i).setEffect(degrade1);
                            if(!(allplants.get(j) instanceof Circle)) {
                                allplants.get(j).setEffect(degrade2);
                                plantpowers.set(j,plantpowers.get(j)-1);
                            }
                        }
                    }
                }
                /*if(tryzombie.getBoundsInLocal().intersects(pea1.getBoundsInLocal()))
                {
                    System.out.println("Collision detected");
                }
                if(normzombie.getBoundsInLocal().intersects(pea1.getBoundsInLocal()))
                {
                    System.out.println("Collision detected");
                }
                if(normzombie2.getBoundsInLocal().intersects(pea1.getBoundsInLocal()))
                {
                    System.out.println("Collision detected");
                }*/
                /*if(intersect.getBoundsInParent().getWidth() != -1)
                {
                    System.out.println("This object can overlap other the other object!");
                    //lblMain.setText("Collision detected!");
                }*/

                if(pea1.getLayoutX()==vtry.getLayoutX())
                {
                    //System.out.println("collision");
                }
                // UPDATE
                /*ballX += xSpeed;

                if (ballX + ballRadius >= WIDTH)
                {
                    ballX = WIDTH - ballRadius;
                    xSpeed *= -1;
                }
                else if (ballX - ballRadius < 0)
                {
                    ballX = 0 + ballRadius;
                    xSpeed *= -1;
                }

                // RENDER
                circle.setCenterX(ballX);*/

                //System.out.println("hiiyy222");
            }
        };

        animator.start();
        //File file = new File("/home/chhavi/IdeaProjects/javafxdemo/src/sample/Newspaper.gif");
        //Image image = new Image(file.toURI().toString());
        //newz.setImage(image);
        //FileInputStream input = new FileInputStream("/home/chhavi/IdeaProjects/javafxdemo/src/sample/Newspaper.gif");
        //Image image = new Image(input);
        //newz = new ImageView(image);
        //newz=new ImageView("sample/Newspaper.gif");
        //Slider slider = new Slider(0, 1, 0.5);


                /*zombiee.setVisible(true);
                conezombiee.setVisible(true);

                TranslateTransition translateTransition3 = new TranslateTransition();


                translateTransition3.setDuration(Duration.millis(21000));


                translateTransition3.setNode(conezombiee);

                //Setting the value of the transition along the x axis.
                translateTransition3.setByX(-250);


                translateTransition3.setCycleCount(500);


                translateTransition3.setAutoReverse(false);

                //Playing the animation
                translateTransition3.play();
                TranslateTransition translateTransitionn = new TranslateTransition();


                translateTransitionn.setDuration(Duration.millis(21000));


                translateTransitionn.setNode(zombiee);
                translateTransitionn.setByX(-250);
                translateTransitionn.setCycleCount(500);
                translateTransitionn.setAutoReverse(false);
                translateTransitionn.play();
                // Node zz = (Node) root.lookup("#sunn");
                TranslateTransition translateTransitionn2 = new TranslateTransition();


                translateTransitionn2.setDuration(Duration.millis(21000));


                translateTransitionn2.setNode(sunn);

                //Setting the value of the transition along the x axis.
                translateTransitionn2.setByY(250);


                translateTransitionn2.setCycleCount(500);


                translateTransitionn2.setAutoReverse(false);

                //Playing the animation
                translateTransitionn2.play();*/

    }

    /*@FXML
    void moveczombie(MouseEvent event) throws IOException {

        //Parent head = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //translateTransition2.play();
       // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
      //  Node z2 = (Node) root.lookup("#conezombiee");
        TranslateTransition translateTransition3 = new TranslateTransition();


        translateTransition3.setDuration(Duration.millis(21000));


        translateTransition3.setNode(conezombiee);

        //Setting the value of the transition along the x axis.
        translateTransition3.setByX(-250);


        translateTransition3.setCycleCount(500);


        translateTransition3.setAutoReverse(false);

        //Playing the animation
        translateTransition3.play();


    }*/
    public void GenerateRepeatPea(DragEvent event)
    {

        Circle cr = new Circle();
        Circle cr1 = new Circle();
        //  cr.setCenterX(event.getSceneX());
        // cr.setCenterY((float)event.getSceneY());

        cr.setRadius((double)10);

        cr.setFill(Color.GREEN);

        Node pea= (Node) cr;
        cr1.setRadius((double)10);

        cr1.setFill(Color.BLUE);

        Node pea1= (Node) cr1;
//        Pane temp1 = new Pane(pea);

        pea.setVisible(true);
        pea.setLayoutX(event.getSceneX()+67);
        pea.setLayoutY(event.getSceneY()+20);
        pea1.setVisible(true);
        pea1.setLayoutX(event.getSceneX()+67);
        pea1.setLayoutY(event.getSceneY()+20);


        gamee.getChildren().add(pea);
        gamee.getChildren().add(pea1);
        TranslateTransition translateTransition2 = new TranslateTransition();
        translateTransition2.setDuration(Duration.millis(2100));
        translateTransition2.setNode(pea);
        translateTransition2.setByX(250);
        translateTransition2.setCycleCount(500);
        translateTransition2.setAutoReverse(false);
        translateTransition2.play();

        TranslateTransition translateTransition1 = new TranslateTransition();
        translateTransition1.setDuration(Duration.millis(1100));
        translateTransition1.setNode(pea1);
        translateTransition1.setByX(150);
        translateTransition1.setCycleCount(500);
        translateTransition1.setAutoReverse(false);
        translateTransition1.play();

    }
    public void GeneratePea(DragEvent event)
    {

        Circle cr = new Circle();
        //  cr.setCenterX(event.getSceneX());
        // cr.setCenterY((float)event.getSceneY());

        cr.setRadius((double)10);
        cr.setFill(Color.GREEN);

        Node pea= (Node) cr;
        allplants.add(pea);
//        Pane temp1 = new Pane(pea);

        pea.setVisible(true);
        pea.setLayoutX(event.getSceneX()+67);
        pea.setLayoutY(event.getSceneY()+20);


        gamee.getChildren().add(pea);
        TranslateTransition translateTransition2 = new TranslateTransition();
        translateTransition2.setDuration(Duration.millis(2100));
        translateTransition2.setNode(pea);
        translateTransition2.setByX(250);
        translateTransition2.setCycleCount(500);
        translateTransition2.setAutoReverse(false);
        translateTransition2.play();

    }
    public void PlacePlant(MouseEvent event)
    {
        name="peashooter";
        //planttypes.add("shooter");
        Dragboard d = icon1.startDragAndDrop(TransferMode.ANY);
        ClipboardContent c = new ClipboardContent();
        System.out.println("i am here");
        placewhat = new ImageView(new Image(getClass().getResourceAsStream("/sample/peashooter.gif")));
        System.out.print("here 2");
        c.putImage(icon1.getImage());
        System.out.println("here 3");
        d.setContent(c);
        System.out.println("here 4");
        //     System.out.println("PP");

        event.consume();
        System.out.println("here 5");
    }

    public void PlaceSunflower(MouseEvent event)
    {
        name="sunflower";
        Dragboard d = icon5.startDragAndDrop(TransferMode.ANY);
        ClipboardContent c = new ClipboardContent();

        placewhat = new ImageView(new Image(getClass().getResourceAsStream("/sample/sunflower.gif")));
        c.putImage(icon5.getImage());
        d.setContent(c);
        //     System.out.println("PP");

        event.consume();
    }

    public void PlaceCherryBomb(MouseEvent event)
    {
        name="cherry";
        Dragboard d = icon3.startDragAndDrop(TransferMode.ANY);
        ClipboardContent c = new ClipboardContent();

        placewhat = new ImageView(new Image(getClass().getResourceAsStream("/sample/Cherrybomb.png")));
        c.putImage(icon3.getImage());
        d.setContent(c);
        //     System.out.println("PP");

        event.consume();
    }

    public void PlacePotato(MouseEvent event)
    {
        name="potato";
        Dragboard d = icon4.startDragAndDrop(TransferMode.ANY);
        ClipboardContent c = new ClipboardContent();

        placewhat = new ImageView(new Image(getClass().getResourceAsStream("/sample/potato.png")));
        c.putImage(icon4.getImage());
        d.setContent(c);
        //     System.out.println("PP");

        event.consume();
    }

    public void PlaceWalnut(MouseEvent event)
    {
        name="walnut";
        Dragboard d = icon6.startDragAndDrop(TransferMode.ANY);
        ClipboardContent c = new ClipboardContent();

        placewhat = new ImageView(new Image(getClass().getResourceAsStream("/sample/wallnut.jpg")));
        c.putImage(icon6.getImage());
        d.setContent(c);
        //     System.out.println("PP");

        event.consume();
    }

    public void PlaceRepeater(MouseEvent event)
    {
        name="repeater";
        Dragboard d =icon2.startDragAndDrop(TransferMode.ANY);
        ClipboardContent c = new ClipboardContent();

        placewhat = new ImageView(new Image(getClass().getResourceAsStream("/sample/repeaterI.png")));
        c.putImage(icon2.getImage());
        d.setContent(c);
        //     System.out.println("PP");

        event.consume();
    }



    public void Seeded(DragEvent event)
    {
        System.out.println("heree4");
        if(event.getDragboard().hasImage())
        {
            System.out.println("hereee6");
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    public void GrassPlant(DragEvent event)
    {
        System.out.println("i am heree");
        Image g = event.getDragboard().getImage();
        System.out.println("i am heree2");
        ImageView ap = placewhat;
        System.out.println("i am heree3");

        //Pane temp = new Pane(ap);
        Node temp= (Node) ap;
        allplants.add(temp);
        System.out.println("i am heree4");

        //  ap.setImage(placewhat.getImage());

        ap.setFitWidth(g1.getFitWidth());
        System.out.println("i am heree5");
        //temp.setMaxWidth(g1.getFitWidth());
        System.out.println("i am heree6");
        //temp.setMaxHeight(g1.getFitHeight());
        System.out.println("i am heree7");
        ap.setFitHeight(g1.getFitHeight());
        System.out.println("i am heree8");
        //  System.out.println(event.getX());
        // System.out.println(event.getY());
        temp.setLayoutX(event.getSceneX());
        System.out.println("i am heree9");
//        ap.setLayoutX(event.getSceneX());
        //    System.out.println("VV");
        temp.setLayoutY(event.getSceneY());
        System.out.println("i am heree10");

//        ap.setLayoutY(event.getSceneY());
        // System.out.println("AA");
        //  ap.toFront();
        ap.setVisible(true);
        System.out.println("i am heree11 ");
        System.out.println(gamee);
        System.out.println("i am heree12");
        // ap.toFront();
        gamee.getChildren().add(temp);
        planttypes.add(name);
        if(name.equals("peashooter"))
        {
            suncount=suncount-100;
            GeneratePea(event);

        }
        else if(name.equals("repeat"))
        {
            GenerateRepeatPea(event);
        }
        else if(name.equals("sunflower"))
        {
            GenerateSun(event);
        }

        System.out.println("i am heree13");
        System.out.println("FF");
        System.out.println("i am heree14");
        //  ap.setVisible(true);




        //gamee.getChildren().add(g1.getX(),);

        //  g1.setImage(ap);

    }
    @FXML
    void incrementsun(MouseEvent event) throws IOException
    {
        ImageView sn=(ImageView) event.getSource();
        //sn.setVisible(false);
        System.out.println(sn.getId());
        //System.out.println("here");

        if(sn.getId().equals(sunn2.getId()))
        {
            //System.out.println("touched");
            ColorAdjust activate = new ColorAdjust();
            activate.setBrightness(-0.4);
            sunn2.setEffect(activate);
            sunn2.setVisible(false);
            sunn2.setManaged(false);
            gamee.getChildren().remove(sunn2);
        }
        int sc= Integer.parseInt(score.getText());
        sc=sc+25;
        String newtext=Integer.toString(sc);
        suncount=suncount+25;

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
    @FXML
    public void GenerateSun(DragEvent event)
    {


        ImageView temp = new ImageView(new Image(getClass().getResourceAsStream("/sample/sun.png")));
        Node sn = (Node)temp;
//        Pane temp1 = new Pane(pea);

        temp.setVisible(true);
        //    temp.setFitHeight(event.getSceneX());
        //    temp.setFitWidth(event.getSceneY());
        sn.setVisible(true);
        sn.setLayoutX(event.getSceneX());
        sn.setLayoutY(event.getSceneY()-60);
        temp.setFitHeight(g1.getFitHeight()-20);
        temp.setFitWidth(g1.getFitWidth()-20);



        gamee.getChildren().add(sn);


    }
    @FXML
    void toingame(MouseEvent event) throws IOException
    {
        System.out.println("ingame");
        Parent head = FXMLLoader.load(getClass().getResource("IngameMenu.fxml"));
        Stage stage = (Stage) ingame.getScene().getWindow();
        stage.setScene(new Scene(head));
        stage.show();

    }
    public void main(TouchEvent event ) throws IOException {


    }
    /*private static final int COLUMNS  = 4;
    private static final int COUNT    = 12;
    private static final int OFFSET_X = 0;
    private static final int OFFSET_Y = 0;
    private static final int WIDTH    = 130;
    private static final int HEIGHT   = 130;
    @FXML private ImageView loginAnimationImageView;
    @FXML private TextField loginTextField;
    @FXML private PasswordField passwordTextField;
    @FXML private Button loginButton;

    @FXML protected void onEnterTextFieldAction(ActionEvent actionEvent) {
    }

    @FXML
    protected void onEnterPasswordFieldAction(ActionEvent actionEvent) {
    }

    @FXML protected void loginButtonAction(ActionEvent actionEvent) {
        final Animation animation = new SpriteAnimation(loginAnimationImageView, millis(400.0), COUNT, COLUMNS, OFFSET_X, OFFSET_Y, WIDTH, HEIGHT);

        animation.setCycleCount(1);
        animation.play();*/
        /*Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Circle circle = new Circle(20, Color.LIGHTCORAL);*/
    //root.getChildren().add(circle);
    /*@FXML
    public void initialize()
    {

    }*/
    public Controller() throws IOException {

    }

}
