package PlayerClasses;

// all stage files are the same with the exception of the special attributes, only this file will be fully commented due to repitition
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

public class bigManStage extends App {
    public static Scene playerStage(Stage globalStage) {
        // intializing tablview, and hBox's
        final TableView<bigMan> playerTable = new TableView<bigMan>();
        final HBox ghb = new HBox();
        final HBox hb = new HBox();
        // creating tablview collums and assigning them to their respective properties
        // setCellValueFactory assigns the value for the column based off of the Person
        // object
        // setCellFactory creates a text field inside the table column
        // setonEditCommit creates an eventhandler that allows you to change the value
        // inside the column, and that value is updated inside of the data set

        TableColumn<bigMan, String> nameCol = new TableColumn<bigMan, String>("Name");
        nameCol.setCellValueFactory(new PropertyValueFactory<bigMan, String>("Name"));
        nameCol.setMinWidth(150);
        nameCol.setCellFactory(TextFieldTableCell.forTableColumn());
        nameCol.setOnEditCommit(new EventHandler<CellEditEvent<bigMan, String>>() {
            @Override
            public void handle(CellEditEvent<bigMan, String> t) {
                ((bigMan) t.getTableView().getItems().get(t.getTablePosition().getRow())).setName(t.getNewValue());
            }
        });

        TableColumn<bigMan, String> positionCol = new TableColumn<bigMan, String>("Position");
        positionCol.setCellValueFactory(new PropertyValueFactory<bigMan, String>("Position"));
        positionCol.setMinWidth(150);
        positionCol.setCellFactory(TextFieldTableCell.forTableColumn());
        positionCol.setOnEditCommit(new EventHandler<CellEditEvent<bigMan, String>>() {
            @Override
            public void handle(CellEditEvent<bigMan, String> t) {
                ((bigMan) t.getTableView().getItems().get(t.getTablePosition().getRow())).setPosition(t.getNewValue());
            }
        });
        TableColumn<bigMan, String> pointsCol = new TableColumn<bigMan, String>("Points");
        pointsCol.setCellValueFactory(new PropertyValueFactory<bigMan, String>("points"));
        pointsCol.setMinWidth(150);
        pointsCol.setCellFactory(TextFieldTableCell.forTableColumn());
        pointsCol.setOnEditCommit(new EventHandler<CellEditEvent<bigMan, String>>() {
            @Override
            public void handle(CellEditEvent<bigMan, String> t) {
                ((bigMan) t.getTableView().getItems().get(t.getTablePosition().getRow())).setPoints(t.getNewValue());
            }
        });
        TableColumn<bigMan, String> assistsCol = new TableColumn<bigMan, String>("Assists");
        assistsCol.setCellValueFactory(new PropertyValueFactory<bigMan, String>("assists"));
        assistsCol.setMinWidth(150);
        assistsCol.setCellFactory(TextFieldTableCell.forTableColumn());
        assistsCol.setOnEditCommit(new EventHandler<CellEditEvent<bigMan, String>>() {
            @Override
            public void handle(CellEditEvent<bigMan, String> t) {
                ((bigMan) t.getTableView().getItems().get(t.getTablePosition().getRow())).setAssists(t.getNewValue());
            }
        });
        TableColumn<bigMan, String> reboundsCol = new TableColumn<bigMan, String>("Rebounds");
        reboundsCol.setCellValueFactory(new PropertyValueFactory<bigMan, String>("rebounds"));
        reboundsCol.setMinWidth(150);
        reboundsCol.setCellFactory(TextFieldTableCell.forTableColumn());
        reboundsCol.setOnEditCommit(new EventHandler<CellEditEvent<bigMan, String>>() {
            @Override
            public void handle(CellEditEvent<bigMan, String> t) {
                ((bigMan) t.getTableView().getItems().get(t.getTablePosition().getRow())).setRebounds(t.getNewValue());
            }
        });
        TableColumn<bigMan, String> stealsCol = new TableColumn<bigMan, String>("Steals");
        stealsCol.setCellValueFactory(new PropertyValueFactory<bigMan, String>("steals"));
        stealsCol.setMinWidth(150);
        stealsCol.setCellFactory(TextFieldTableCell.forTableColumn());
        stealsCol.setOnEditCommit(new EventHandler<CellEditEvent<bigMan, String>>() {
            @Override
            public void handle(CellEditEvent<bigMan, String> t) {
                ((bigMan) t.getTableView().getItems().get(t.getTablePosition().getRow())).setSteals(t.getNewValue());
            }
        });
        TableColumn<bigMan, String> blocksCol = new TableColumn<bigMan, String>("Blocks");
        blocksCol.setCellValueFactory(new PropertyValueFactory<bigMan, String>("blocks"));
        blocksCol.setMinWidth(150);
        blocksCol.setCellFactory(TextFieldTableCell.forTableColumn());
        blocksCol.setOnEditCommit(new EventHandler<CellEditEvent<bigMan, String>>() {
            @Override
            public void handle(CellEditEvent<bigMan, String> t) {
                ((bigMan) t.getTableView().getItems().get(t.getTablePosition().getRow())).setBlocks(t.getNewValue());
            }
        });
        TableColumn<bigMan, String> postUps = new TableColumn<bigMan, String>("Postups");
        postUps.setCellValueFactory(new PropertyValueFactory<bigMan, String>("PostUps"));
        postUps.setMinWidth(150);
        postUps.setCellFactory(TextFieldTableCell.forTableColumn());
        postUps.setOnEditCommit(new EventHandler<CellEditEvent<bigMan, String>>() {
            @Override
            public void handle(CellEditEvent<bigMan, String> t) {
                ((bigMan) t.getTableView().getItems().get(t.getTablePosition().getRow())).setPostUps(t.getNewValue());
            }
        });
        TableColumn<bigMan, String> screensSet = new TableColumn<bigMan, String>("Screens Set");
        screensSet.setCellValueFactory(new PropertyValueFactory<bigMan, String>("ScreensSet"));
        screensSet.setMinWidth(150);
        screensSet.setCellFactory(TextFieldTableCell.forTableColumn());
        screensSet.setOnEditCommit(new EventHandler<CellEditEvent<bigMan, String>>() {
            @Override
            public void handle(CellEditEvent<bigMan, String> t) {
                ((bigMan) t.getTableView().getItems().get(t.getTablePosition().getRow()))
                        .setScreensSet(t.getNewValue());
            }
        });

        TableColumn<bigMan, String> offensiveRebounds = new TableColumn<bigMan, String>("Offensive Rebounds");
        offensiveRebounds.setCellValueFactory(new PropertyValueFactory<bigMan, String>("OffensiveRebounds"));
        offensiveRebounds.setMinWidth(150);
        offensiveRebounds.setCellFactory(TextFieldTableCell.forTableColumn());
        offensiveRebounds.setOnEditCommit(new EventHandler<CellEditEvent<bigMan, String>>() {
            @Override
            public void handle(CellEditEvent<bigMan, String> t) {
                ((bigMan) t.getTableView().getItems().get(t.getTablePosition().getRow()))
                        .setOffensiveRebounds(t.getNewValue());
            }
        });
        // created a filtered list, this is used so that we can search for items inside
        // of this list
        FilteredList<bigMan> flPerson = new FilteredList(Read.bigMan, p -> true);// Pass the data to a filtered list
        playerTable.setItems(flPerson);// Set the table's items using the filtered list
        playerTable.getColumns().addAll(nameCol, positionCol, pointsCol, assistsCol, reboundsCol, blocksCol, postUps,
                screensSet, offensiveRebounds);
        // Adding ChoiceBox and TextField here
        ChoiceBox<String> choiceBox = new ChoiceBox();
        choiceBox.getItems().addAll("Name", "Position", "Points", "Assists", "Rebounds", "Steals", "Blocks", "Post-Ups",
                "Screens Set", "Offensive Rebounds");
        choiceBox.setValue("Select Choice");

        TextField textField = new TextField();
        textField.setPromptText("Search here!");
        textField.textProperty().addListener((obs, oldValue, newValue) -> {
            switch (choiceBox.getValue())// Switch on choiceBox value to see input, depending on what you select this
                                         // allowes you to search for thr respective collum
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
            case "Post-Ups":
                flPerson.setPredicate(p -> p.getPostUps().toLowerCase().contains(newValue.toLowerCase().trim()));
                break;
            case "Screens Set":
                flPerson.setPredicate(p -> p.getScreensSet().toLowerCase().contains(newValue.toLowerCase().trim()));
                break;
            case "Offensive Rebounds":
                flPerson.setPredicate(
                        p -> p.getOffensiveRebounds().toLowerCase().contains(newValue.toLowerCase().trim()));
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

        final TextField addPostUps = new TextField();
        addPostUps.setFont(new Font("Times New Roman", 16));
        addPostUps.setPromptText("Postups");
        addPostUps.setPrefWidth(120);

        final TextField addScreensSet = new TextField();
        addScreensSet.setFont(new Font("Times New Roman", 16));
        addScreensSet.setPromptText("Screens Set");
        addScreensSet.setPrefWidth(120);

        final TextField addOffensiveRebounds = new TextField();
        addOffensiveRebounds.setFont(new Font("Times New Roman", 16));
        addOffensiveRebounds.setPromptText("Offensive Rebounds");
        addOffensiveRebounds.setPrefWidth(120);

        final Button notValid = new Button("Please only enter numbers for phone number");
        // creates a new button that reads whats in those text boxes and then assigns it
        // to a new person, then adding it to the table. finally it clears the text
        // boxes so they can be used again
        final Button addButton = new Button("Add");
        addButton.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

                boolean points = DataChecker.onlyDigits(addPoints.getText());
                boolean assists = DataChecker.onlyDigits(addAssists.getText());
                boolean rebounds = DataChecker.onlyDigits(addRebounds.getText());
                boolean steals = DataChecker.onlyDigits(addSteals.getText());
                boolean blocks = DataChecker.onlyDigits(addBlocks.getText());
                boolean postUps = DataChecker.onlyDigits(addPostUps.getText());
                boolean screensSet = DataChecker.onlyDigits(addScreensSet.getText());
                boolean offensiveRebounds = DataChecker.onlyDigits(addOffensiveRebounds.getText());
                // these if statemets are to check the data.. making sure the data entered into
                // the box meets the condition of being a number and only adding if it is a
                // numebr
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
                } else if (!postUps) {
                    addPostUps.setPromptText("Only Numbers Allowed");
                    addPostUps.clear();
                } else if (!screensSet) {
                    addScreensSet.setPromptText("Only Numbers Allowed");
                    addScreensSet.clear();
                } else if (!offensiveRebounds) {
                    addOffensiveRebounds.setPromptText("Only Numbers Allowed");
                    addOffensiveRebounds.clear();
                } else {
                    Read.bigMan.add(new bigMan(addName.getText(), addPosition.getText(), addPoints.getText(),
                            addAssists.getText(), addRebounds.getText(), addSteals.getText(), addBlocks.getText(),
                            addPostUps.getText(), addScreensSet.getText(), addOffensiveRebounds.getText()));
                    addName.clear();
                    addPosition.clear();
                    addPoints.clear();
                    addAssists.clear();
                    addRebounds.clear();
                    addSteals.clear();
                    addBlocks.clear();
                    addPostUps.clear();
                    addScreensSet.clear();
                    addOffensiveRebounds.clear();
                    addPoints.setPromptText("Points");
                    addAssists.setPromptText("Assists");
                    addRebounds.setPromptText("Rebounds");
                    addSteals.setPromptText("Steals");
                    addBlocks.setPromptText("Blocks");
                    addPostUps.setPromptText("Drives");
                    addScreensSet.setPromptText("Fastbreaks");
                    addOffensiveRebounds.setPromptText("Contested Layups");
                }
                // try catch to write the new player to the file
                try {
                    Write.bigManWrite();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
        // adding all text boxs to hBox
        hb.getChildren().addAll(addName, addPosition, addPoints, addAssists, addRebounds, addSteals, addBlocks,
                addPostUps, addScreensSet, addOffensiveRebounds, addButton);
        hb.setSpacing(3);
        // creating scene
        Scene bigManScene = new Scene(new Group());
        // creating label at the top of the scene
        final Label label = new Label("Big Men");
        label.setFont(new Font("Times New Roman", 20));
        label.setTranslateX(625);
        playerTable.setEditable(true);
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        // button to return to main scene... writing to file aswell
        final Button cellButton = new Button("Back to Menu");
        cellButton.setTranslateX(1310);
        cellButton.setTranslateY(-35);
        cellButton.setOnAction(actionEvent -> {
            try {
                Write.bigManWrite();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            globalStage.setScene(scene);
        });
        // intializing button to delete things
        final Button deleteButton = new Button("Delete");
        // setting button to remove the selected item from the observerable list
        // writing to file after
        deleteButton.setOnAction(e -> {
            bigMan selectedItem = playerTable.getSelectionModel().getSelectedItem();
            if (selectedItem != null) {
                Read.bigMan.remove(selectedItem);
                try {
                    Write.bigManWrite();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
        // creating new hbox
        HBox hBox = new HBox(choiceBox, textField, deleteButton);
        // translating hBox
        hBox.setTranslateY(-478);
        deleteButton.setTranslateX(1040);
        vbox.getChildren().addAll(label, playerTable, hb, ghb, hBox, cellButton);
        ((Group) bigManScene.getRoot()).getChildren().addAll(vbox);
        return bigManScene;
    }
}