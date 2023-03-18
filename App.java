package PlayerClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class App extends Application {
    // intializing table and hbox
   
    final HBox hb = new HBox();
    Image image;
    ImageView raps;

    public static void main(String[] args) {
        launch(args);

        // try/catching all of the write methonds once the app is closed to save to file
        try {
            Write.bigManWrite();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        try {
            Write.slasherWrite();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        try {
            Write.threeAndDWrite();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        try {
            Write.playMakerWrite();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    public static Stage globalStage;
    public static Scene scene;

    @Override
    public void start(Stage stage) {
        // calling read class to read the text file
        Read.getSlasherInfo();
        Read.getBigManInfo();
        Read.getPlayMakerInfo();
        Read.getThreeAndDInfo();
        // creating scene
        globalStage = stage;

        Pane layout = new Pane();
        Scene localScene = new Scene(layout);
        scene = localScene;
        stage.setTitle("NBA Players Directory");
        stage.setMinWidth(805);
        stage.setMinHeight(450);

        // creating label at the top of the scene
        final Label label = new Label("Guide To All NBA Players");
        label.setFont(new Font("Times New Roman", 20));
        label.setTranslateX(300);
        //inserting label
        FileInputStream inputstream;
        try {
            inputstream = new FileInputStream(
                    "src/PlayerClasses/toronto-raptors-logo-transparent.png");
            image = new Image(inputstream);
            raps = new ImageView(image);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        raps.setX(0);
        raps.setY(50);
        raps.setFitWidth(800);
        raps.setFitHeight(750);
        raps.setPreserveRatio(true);

        // // setting button
        // setting font, location and size
        // setting that when clicked open respective stage
        Button bigManButton = new Button("Big Man Players");
        bigManButton.setStyle("-fx-font-size:50");
        bigManButton.wrapTextProperty().setValue(true);
        bigManButton.setLayoutX(50);
        bigManButton.setLayoutY(100);
        bigManButton.setMinWidth(300);
        bigManButton.setMaxWidth(300);
        bigManButton.setMaxHeight(300);
        bigManButton.setMinHeight(300);

        bigManButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                globalStage.setScene(bigManStage.playerStage(globalStage));
            }
        });
        // slasher button
        Button slasherButton = new Button("Slasher Players");
        slasherButton.setStyle("-fx-font-size:50");
        slasherButton.wrapTextProperty().setValue(true);
        slasherButton.setLayoutX(450);
        slasherButton.setLayoutY(100);
        slasherButton.setMinWidth(300);
        slasherButton.setMinHeight(300);
        slasherButton.setMaxWidth(300);
        slasherButton.setMaxHeight(300);
        slasherButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                globalStage.setScene(SlasherStage.playerStage(globalStage));
            }
        });
        // Three and D Button
        Button threeAndDButton = new Button("Three and D Players");
        threeAndDButton.setStyle("-fx-font-size:50");
        threeAndDButton.wrapTextProperty().setValue(true);
        threeAndDButton.setLayoutX(50);
        threeAndDButton.setLayoutY(450);
        threeAndDButton.setMinWidth(300);
        threeAndDButton.setMinHeight(300);
        threeAndDButton.setMaxWidth(300);
        threeAndDButton.setMaxHeight(300);
        threeAndDButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                globalStage.setScene(ThreeAndDStage.playerStage(globalStage));
            }
        });

        Button playMakerButton = new Button("Play Maker Players");
        playMakerButton.setStyle("-fx-font-size:50");
        playMakerButton.wrapTextProperty().setValue(true);
        playMakerButton.setLayoutX(450);
        playMakerButton.setLayoutY(450);
        playMakerButton.setMinWidth(300);
        playMakerButton.setMinHeight(300);
        playMakerButton.setMaxWidth(300);
        playMakerButton.setMaxHeight(300);
        playMakerButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                globalStage.setScene(PlayMakerStage.playerStage(globalStage));
            }
        });

        hb.setSpacing(3);
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, hb);
        layout.getChildren().addAll(raps, bigManButton, slasherButton, threeAndDButton, playMakerButton, vbox);
        stage.setScene(localScene);
        stage.sizeToScene();
        stage.show();

    }
}