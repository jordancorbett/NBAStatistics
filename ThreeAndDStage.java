package PlayerClasses;

import java.io.IOException;

import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ThreeAndDStage extends App {
    public static Scene playerStage(Stage globalStage) {
        final TableView<threeandD> playerTable = new TableView<threeandD>();
        final HBox ghb = new HBox();
        final HBox hb = new HBox();
        TableColumn<threeandD, String> nameCol = new TableColumn<threeandD, String>("Name");
        nameCol.setCellValueFactory(new PropertyValueFactory<threeandD, String>("Name"));
        nameCol.setMinWidth(150);
        nameCol.setCellFactory(TextFieldTableCell.forTableColumn());
        nameCol.setOnEditCommit(new EventHandler<CellEditEvent<threeandD, String>>() {
            @Override
            public void handle(CellEditEvent<threeandD, String> t) {
                ((threeandD) t.getTableView().getItems().get(t.getTablePosition().getRow())).setName(t.getNewValue());
            }
        });

        TableColumn<threeandD, String> positionCol = new TableColumn<threeandD, String>("Position");
        positionCol.setCellValueFactory(new PropertyValueFactory<threeandD, String>("Position"));
        positionCol.setMinWidth(150);
        positionCol.setCellFactory(TextFieldTableCell.forTableColumn());
        positionCol.setOnEditCommit(new EventHandler<CellEditEvent<threeandD, String>>() {
            @Override
            public void handle(CellEditEvent<threeandD, String> t) {
                ((threeandD) t.getTableView().getItems().get(t.getTablePosition().getRow()))
                        .setPosition(t.getNewValue());

            }
        });
        TableColumn<threeandD, String> pointsCol = new TableColumn<threeandD, String>("Points");
        pointsCol.setCellValueFactory(new PropertyValueFactory<threeandD, String>("points"));
        pointsCol.setMinWidth(150);
        pointsCol.setCellFactory(TextFieldTableCell.forTableColumn());
        pointsCol.setOnEditCommit(new EventHandler<CellEditEvent<threeandD, String>>() {
            @Override
            public void handle(CellEditEvent<threeandD, String> t) {

                ((threeandD) t.getTableView().getItems().get(t.getTablePosition().getRow())).setPoints(t.getNewValue());
            }
        });
        TableColumn<threeandD, String> assistsCol = new TableColumn<threeandD, String>("Assists");
        assistsCol.setCellValueFactory(new PropertyValueFactory<threeandD, String>("assists"));
        assistsCol.setMinWidth(150);
        assistsCol.setCellFactory(TextFieldTableCell.forTableColumn());
        assistsCol.setOnEditCommit(new EventHandler<CellEditEvent<threeandD, String>>() {
            @Override
            public void handle(CellEditEvent<threeandD, String> t) {

                ((threeandD) t.getTableView().getItems().get(t.getTablePosition().getRow()))
                        .setAssists(t.getNewValue());

            }
        });
        TableColumn<threeandD, String> reboundsCol = new TableColumn<threeandD, String>("Rebounds");
        reboundsCol.setCellValueFactory(new PropertyValueFactory<threeandD, String>("rebounds"));
        reboundsCol.setMinWidth(150);
        reboundsCol.setCellFactory(TextFieldTableCell.forTableColumn());
        reboundsCol.setOnEditCommit(new EventHandler<CellEditEvent<threeandD, String>>() {
            @Override
            public void handle(CellEditEvent<threeandD, String> t) {

                ((threeandD) t.getTableView().getItems().get(t.getTablePosition().getRow()))
                        .setRebounds(t.getNewValue());

            }
        });

        TableColumn<threeandD, String> stealsCol = new TableColumn<threeandD, String>("Steals");
        stealsCol.setCellValueFactory(new PropertyValueFactory<threeandD, String>("steals"));
        stealsCol.setMinWidth(150);
        stealsCol.setCellFactory(TextFieldTableCell.forTableColumn());
        stealsCol.setOnEditCommit(new EventHandler<CellEditEvent<threeandD, String>>() {
            @Override
            public void handle(CellEditEvent<threeandD, String> t) {
                ((threeandD) t.getTableView().getItems().get(t.getTablePosition().getRow())).setSteals(t.getNewValue());
            }
        });
        TableColumn<threeandD, String> blocksCol = new TableColumn<threeandD, String>("Blocks");
        blocksCol.setCellValueFactory(new PropertyValueFactory<threeandD, String>("blocks"));
        blocksCol.setMinWidth(150);
        blocksCol.setCellFactory(TextFieldTableCell.forTableColumn());
        blocksCol.setOnEditCommit(new EventHandler<CellEditEvent<threeandD, String>>() {
            @Override
            public void handle(CellEditEvent<threeandD, String> t) {
                ((threeandD) t.getTableView().getItems().get(t.getTablePosition().getRow())).setBlocks(t.getNewValue());
            }
        });
        TableColumn<threeandD, String> deflections = new TableColumn<threeandD, String>("Deflections");
        deflections.setCellValueFactory(new PropertyValueFactory<threeandD, String>("Deflections"));
        deflections.setMinWidth(150);
        deflections.setCellFactory(TextFieldTableCell.forTableColumn());
        deflections.setOnEditCommit(new EventHandler<CellEditEvent<threeandD, String>>() {
            @Override
            public void handle(CellEditEvent<threeandD, String> t) {
                ((threeandD) t.getTableView().getItems().get(t.getTablePosition().getRow()))
                        .setDeflections(t.getNewValue());
            }
        });
        TableColumn<threeandD, String> catchAndShoot = new TableColumn<threeandD, String>("Catch and Shoot");
        catchAndShoot.setCellValueFactory(new PropertyValueFactory<threeandD, String>("CatchAndShoot"));
        catchAndShoot.setMinWidth(150);
        catchAndShoot.setCellFactory(TextFieldTableCell.forTableColumn());
        catchAndShoot.setOnEditCommit(new EventHandler<CellEditEvent<threeandD, String>>() {
            @Override
            public void handle(CellEditEvent<threeandD, String> t) {
                ((threeandD) t.getTableView().getItems().get(t.getTablePosition().getRow()))
                        .setCatchAndShoot(t.getNewValue());
            }
        });

        TableColumn<threeandD, String> offBallScreens = new TableColumn<threeandD, String>("Off-ball Screens");
        offBallScreens.setCellValueFactory(new PropertyValueFactory<threeandD, String>("OffBallScreens"));
        offBallScreens.setMinWidth(150);
        offBallScreens.setCellFactory(TextFieldTableCell.forTableColumn());
        offBallScreens.setOnEditCommit(new EventHandler<CellEditEvent<threeandD, String>>() {
            @Override
            public void handle(CellEditEvent<threeandD, String> t) {
                ((threeandD) t.getTableView().getItems().get(t.getTablePosition().getRow()))
                        .setOffBallScreens(t.getNewValue());
            }
        });

        FilteredList<threeandD> flPerson = new FilteredList(Read.threeAndD, p -> true);// Pass the data to a filtered
                                                                                       // list
        playerTable.setItems(flPerson);// Set the table's items using the filtered list
        playerTable.getColumns().addAll(nameCol, positionCol, pointsCol, assistsCol, reboundsCol, blocksCol,
                deflections, catchAndShoot, offBallScreens);
        // Adding ChoiceBox and TextField here!
        ChoiceBox<String> choiceBox = new ChoiceBox();
        choiceBox.getItems().addAll("Name", "Position", "Points", "Assists", "Rebounds", "Steals", "Blocks",
                "Deflections", "Catch and Shoot", "Off-ball Screens");
        choiceBox.setValue("Select Choice");

        TextField textField = new TextField();
        textField.setPromptText("Search here!");
        textField.textProperty().addListener((obs, oldValue, newValue) -> {
            switch (choiceBox.getValue())// Switch on choiceBox value
            {
            case "Name":
                flPerson.setPredicate(p -> p.getName().toLowerCase().contains(newValue.toLowerCase().trim()));
                break;
            case "Position":
                flPerson.setPredicate(p -> p.getPosition().toLowerCase().contains(newValue.toLowerCase().trim()));
                break;
            case "Points":
                flPerson.setPredicate(p -> p.getPoints().toLowerCase().contains(newValue.toLowerCase().trim()));
                break;
            case "Assists":
                flPerson.setPredicate(p -> p.getAssists().toLowerCase().contains(newValue.toLowerCase().trim()));
                break;
            case "Rebounds":
                flPerson.setPredicate(p -> p.getRebounds().toLowerCase().contains(newValue.toLowerCase().trim()));
                break;
            case "Steals":
                flPerson.setPredicate(p -> p.getSteals().toLowerCase().contains(newValue.toLowerCase().trim()));
                break;
            case "Blocks":
                flPerson.setPredicate(p -> p.getBlocks().toLowerCase().contains(newValue.toLowerCase().trim()));
                break;
            case "Deflections":
                flPerson.setPredicate(p -> p.getDeflections().toLowerCase().contains(newValue.toLowerCase().trim()));
                break;
            case "Catch and Shoot":
                flPerson.setPredicate(p -> p.getCatchAndShoot().toLowerCase().contains(newValue.toLowerCase().trim()));
                break;
            case "Off-ball Screens":
                flPerson.setPredicate(p -> p.getOffBallScreens().toLowerCase().contains(newValue.toLowerCase().trim()));
                break;
            }
        });

        choiceBox.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal != null) {
                textField.setText("");
            }
        });
        // text fields for adding a new contact
        final TextField addName = new TextField();
        addName.setFont(new Font("Times New Roman", 16));
        addName.setPromptText("Name");
        addName.setPrefWidth(125);

        final TextField addPosition = new TextField();
        addPosition.setFont(new Font("Times New Roman", 16));
        addPosition.setPromptText("Position");
        addPosition.setPrefWidth(125);

        final TextField addPoints = new TextField();
        addPoints.setFont(new Font("Times New Roman", 16));
        addPoints.setPromptText("Points");
        addPoints.setPrefWidth(125);

        final TextField addAssists = new TextField();
        addAssists.setFont(new Font("Times New Roman", 16));
        addAssists.setPromptText("Assists");
        addAssists.setPrefWidth(180);

        final TextField addRebounds = new TextField();
        addRebounds.setFont(new Font("Times New Roman", 16));
        addRebounds.setPromptText("Rebounds");
        addRebounds.setPrefWidth(180);

        final TextField addSteals = new TextField();
        addSteals.setFont(new Font("Times New Roman", 16));
        addSteals.setPromptText("Steals");
        addSteals.setPrefWidth(120);

        final TextField addBlocks = new TextField();
        addBlocks.setFont(new Font("Times New Roman", 16));
        addBlocks.setPromptText("Blocks");
        addBlocks.setPrefWidth(120);

        final TextField addDeflections = new TextField();
        addDeflections.setFont(new Font("Times New Roman", 16));
        addDeflections.setPromptText("Deflections");
        addDeflections.setPrefWidth(120);

        final TextField addCatchAndShoot = new TextField();
        addCatchAndShoot.setFont(new Font("Times New Roman", 16));
        addCatchAndShoot.setPromptText("Catch and Shoot");
        addCatchAndShoot.setPrefWidth(120);

        final TextField addOffBallScreens = new TextField();
        addOffBallScreens.setFont(new Font("Times New Roman", 16));
        addOffBallScreens.setPromptText("Off-Ball Screens");
        addOffBallScreens.setPrefWidth(120);

        final Button notValid = new Button("Please only enter numbers for phone number");
        // creates a new button that reads whats in those text boxes and then assigns it
        // to a new person, then adding it to the table. finally it clears the text
        // boxes so they can be used again
        final Button addButton = new Button("Add");
        addButton.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

                // // check to see if data is valid
                boolean points = DataChecker.onlyDigits(addPoints.getText());
                boolean assists = DataChecker.onlyDigits(addAssists.getText());
                boolean rebounds = DataChecker.onlyDigits(addRebounds.getText());
                boolean steals = DataChecker.onlyDigits(addSteals.getText());
                boolean blocks = DataChecker.onlyDigits(addBlocks.getText());
                boolean deflections = DataChecker.onlyDigits(addDeflections.getText());
                boolean catchandshoot = DataChecker.onlyDigits(addCatchAndShoot.getText());
                boolean offballscreens = DataChecker.onlyDigits(addOffBallScreens.getText());

                if (!points) {
                    addPoints.setPromptText("Only Numbers Allowed");
                    addPoints.clear();
                } else if (!assists) {
                    addAssists.setPromptText("Only Numbers Allowed");
                    addAssists.clear();
                } else if (!rebounds) {
                    addRebounds.setPromptText("Only Numbers Allowed");
                    addRebounds.clear();
                } else if (!steals) {
                    addSteals.setPromptText("Only Numbers Allowed");
                    addSteals.clear();
                } else if (!blocks) {
                    addBlocks.setPromptText("Only Numbers Allowed");
                    addBlocks.clear();
                } else if (!deflections) {
                    addDeflections.setPromptText("Only Numbers Allowed");
                    addDeflections.clear();
                } else if (!catchandshoot) {
                    addCatchAndShoot.setPromptText("Only Numbers Allowed");
                    addCatchAndShoot.clear();
                } else if (!offballscreens) {
                    addOffBallScreens.setPromptText("Only Numbers Allowed");
                    addOffBallScreens.clear();
                } else {
                    Read.threeAndD.add(new threeandD(addName.getText(), addPosition.getText(), addPoints.getText(),
                            addAssists.getText(), addRebounds.getText(), addSteals.getText(), addBlocks.getText(),
                            addDeflections.getText(), addCatchAndShoot.getText(), addOffBallScreens.getText()));
                    addName.clear();
                    addPosition.clear();
                    addPoints.clear();
                    addAssists.clear();
                    addRebounds.clear();
                    addSteals.clear();
                    addBlocks.clear();
                    addDeflections.clear();
                    addCatchAndShoot.clear();
                    addOffBallScreens.clear();
                    addPoints.setPromptText("Points");
                    addAssists.setPromptText("Assists");
                    addRebounds.setPromptText("Rebounds");
                    addSteals.setPromptText("Steals");
                    addBlocks.setPromptText("Blocks");
                    addDeflections.setPromptText("Deflections");
                    addCatchAndShoot.setPromptText("Catch and Shoot");
                    addOffBallScreens.setPromptText("Off-Ball Screens");
                }
                try {
                    Write.threeAndDWrite();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
        hb.getChildren().addAll(addName, addPosition, addPoints, addAssists, addRebounds, addSteals, addBlocks,
                addDeflections, addCatchAndShoot, addOffBallScreens, addButton);
        hb.setSpacing(3);
        // creating scene
        Scene slasherScene = new Scene(new Group());
        // creating label at the top of the scene
        final Label label = new Label("Three and D");
        label.setFont(new Font("Times New Roman", 20));
        label.setTranslateX(625);
        playerTable.setEditable(true);

        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));

        final Button cellButton = new Button("Back to Menu");
        cellButton.setTranslateX(1310);
        cellButton.setTranslateY(-35);
        cellButton.setOnAction(actionEvent -> {
            try {
                Write.threeAndDWrite();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            globalStage.setScene(scene);
        });
        final Button deleteButton = new Button("Delete");
        deleteButton.setOnAction(e -> {
            threeandD selectedItem = playerTable.getSelectionModel().getSelectedItem();
            if (selectedItem != null) {
                Read.threeAndD.remove(selectedItem);
                try {
                    Write.threeAndDWrite();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
        HBox hBox = new HBox(choiceBox, textField, deleteButton);// Add choiceBox and textField to hBox
        hBox.setTranslateY(-478);
        deleteButton.setTranslateX(1040);
        vbox.getChildren().addAll(label, playerTable, ghb, hb, hBox, cellButton);
        ((Group) slasherScene.getRoot()).getChildren().addAll(vbox);
        return slasherScene;
    }
}
