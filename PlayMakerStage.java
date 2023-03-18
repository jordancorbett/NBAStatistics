package PlayerClasses;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class PlayMakerStage extends App {
    public static Scene playerStage(Stage globalStage) {

        final TableView<playmaker> playerTable = new TableView<playmaker>();
        final HBox ghb = new HBox();
        final HBox hb = new HBox();
        // String Position, String points, String assists, String rebounds, String
        // steals, String blocks, String drives, String fstbreak, String contlays
        TableColumn<playmaker, String> nameCol = new TableColumn<playmaker, String>("Name");
        nameCol.setCellValueFactory(new PropertyValueFactory<playmaker, String>("Name"));
        nameCol.setMinWidth(150);
        nameCol.setCellFactory(TextFieldTableCell.forTableColumn());
        nameCol.setOnEditCommit(new EventHandler<CellEditEvent<playmaker, String>>() {
            @Override
            public void handle(CellEditEvent<playmaker, String> t) {
                ((playmaker) t.getTableView().getItems().get(t.getTablePosition().getRow())).setName(t.getNewValue());
            }
        });

        TableColumn<playmaker, String> positionCol = new TableColumn<playmaker, String>("Position");
        positionCol.setCellValueFactory(new PropertyValueFactory<playmaker, String>("Position"));
        positionCol.setMinWidth(150);
        positionCol.setCellFactory(TextFieldTableCell.forTableColumn());
        positionCol.setOnEditCommit(new EventHandler<CellEditEvent<playmaker, String>>() {
            @Override
            public void handle(CellEditEvent<playmaker, String> t) {
                ((playmaker) t.getTableView().getItems().get(t.getTablePosition().getRow()))
                        .setPosition(t.getNewValue());
            }
        });

        TableColumn<playmaker, String> pointsCol = new TableColumn<playmaker, String>("Points");
        pointsCol.setCellValueFactory(new PropertyValueFactory<playmaker, String>("points"));
        pointsCol.setMinWidth(150);
        pointsCol.setCellFactory(TextFieldTableCell.forTableColumn());
        pointsCol.setOnEditCommit(new EventHandler<CellEditEvent<playmaker, String>>() {
            @Override
            public void handle(CellEditEvent<playmaker, String> t) {
                ((playmaker) t.getTableView().getItems().get(t.getTablePosition().getRow())).setPoints(t.getNewValue());
            }
        });
        TableColumn<playmaker, String> assistsCol = new TableColumn<playmaker, String>("Assists");
        assistsCol.setCellValueFactory(new PropertyValueFactory<playmaker, String>("assists"));
        assistsCol.setMinWidth(150);
        assistsCol.setCellFactory(TextFieldTableCell.forTableColumn());
        assistsCol.setOnEditCommit(new EventHandler<CellEditEvent<playmaker, String>>() {
            @Override
            public void handle(CellEditEvent<playmaker, String> t) {
                ((playmaker) t.getTableView().getItems().get(t.getTablePosition().getRow()))
                        .setAssists(t.getNewValue());
            }
        });
        TableColumn<playmaker, String> reboundsCol = new TableColumn<playmaker, String>("Rebounds");
        reboundsCol.setCellValueFactory(new PropertyValueFactory<playmaker, String>("rebounds"));
        reboundsCol.setMinWidth(150);
        reboundsCol.setCellFactory(TextFieldTableCell.forTableColumn());
        reboundsCol.setOnEditCommit(new EventHandler<CellEditEvent<playmaker, String>>() {
            @Override
            public void handle(CellEditEvent<playmaker, String> t) {
                ((playmaker) t.getTableView().getItems().get(t.getTablePosition().getRow()))
                        .setRebounds(t.getNewValue());
            }
        });
        TableColumn<playmaker, String> stealsCol = new TableColumn<playmaker, String>("Steals");
        stealsCol.setCellValueFactory(new PropertyValueFactory<playmaker, String>("steals"));
        stealsCol.setMinWidth(150);
        stealsCol.setCellFactory(TextFieldTableCell.forTableColumn());
        stealsCol.setOnEditCommit(new EventHandler<CellEditEvent<playmaker, String>>() {
            @Override
            public void handle(CellEditEvent<playmaker, String> t) {
                ((playmaker) t.getTableView().getItems().get(t.getTablePosition().getRow())).setSteals(t.getNewValue());
            }
        });
        TableColumn<playmaker, String> blocksCol = new TableColumn<playmaker, String>("Blocks");
        blocksCol.setCellValueFactory(new PropertyValueFactory<playmaker, String>("blocks"));
        blocksCol.setMinWidth(150);
        blocksCol.setCellFactory(TextFieldTableCell.forTableColumn());
        blocksCol.setOnEditCommit(new EventHandler<CellEditEvent<playmaker, String>>() {
            @Override
            public void handle(CellEditEvent<playmaker, String> t) {
                ((playmaker) t.getTableView().getItems().get(t.getTablePosition().getRow())).setBlocks(t.getNewValue());
            }
        });

        TableColumn<playmaker, String> passcol = new TableColumn<playmaker, String>("Pass To Assists");
        passcol.setCellValueFactory(new PropertyValueFactory<playmaker, String>("PassToAssists"));
        passcol.setMinWidth(150);
        passcol.setCellFactory(TextFieldTableCell.forTableColumn());
        passcol.setOnEditCommit(new EventHandler<CellEditEvent<playmaker, String>>() {
            @Override
            public void handle(CellEditEvent<playmaker, String> t) {
                ((playmaker) t.getTableView().getItems().get(t.getTablePosition().getRow()))
                        .setPassToAssists(t.getNewValue());
            }
        });
        TableColumn<playmaker, String> fastBreakAssist = new TableColumn<playmaker, String>("Fastbreak");
        fastBreakAssist.setCellValueFactory(new PropertyValueFactory<playmaker, String>("FastBreakAssists"));
        fastBreakAssist.setMinWidth(150);
        fastBreakAssist.setCellFactory(TextFieldTableCell.forTableColumn());
        fastBreakAssist.setOnEditCommit(new EventHandler<CellEditEvent<playmaker, String>>() {
            @Override
            public void handle(CellEditEvent<playmaker, String> t) {
                ((playmaker) t.getTableView().getItems().get(t.getTablePosition().getRow()))
                        .setFastBreakAssists(t.getNewValue());
            }
        });

        TableColumn<playmaker, String> floaters = new TableColumn<playmaker, String>("Floaters");
        floaters.setCellValueFactory(new PropertyValueFactory<playmaker, String>("Floaters"));
        floaters.setMinWidth(150);
        floaters.setCellFactory(TextFieldTableCell.forTableColumn());
        floaters.setOnEditCommit(new EventHandler<CellEditEvent<playmaker, String>>() {
            @Override
            public void handle(CellEditEvent<playmaker, String> t) {
                ((playmaker) t.getTableView().getItems().get(t.getTablePosition().getRow()))
                        .setFloaters(t.getNewValue());

            }
        });

        FilteredList<playmaker> flPerson = new FilteredList(Read.playMaker, p -> true);// Pass the data to a filtered
                                                                                       // list
        playerTable.setItems(flPerson);// Set the table's items using the filtered list
        playerTable.getColumns().addAll(nameCol, positionCol, pointsCol, assistsCol, reboundsCol, blocksCol, passcol,
                fastBreakAssist, floaters);
        // Adding ChoiceBox and TextField here!
        ChoiceBox<String> choiceBox = new ChoiceBox();
        choiceBox.getItems().addAll("Name", "Position", "Points", "Assists", "Rebounds", "Steals", "Blocks",
                "Pass To Assists", "Fast Break Assists", "Floaters");
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
            case "Pass To Assists":
                flPerson.setPredicate(p -> p.getPassToAssists().toLowerCase().contains(newValue.toLowerCase().trim()));
                break;
            case "Fast Break Assists":
                flPerson.setPredicate(
                        p -> p.getFastBreakAssists().toLowerCase().contains(newValue.toLowerCase().trim()));
                break;
            case "Floaters":
                flPerson.setPredicate(p -> p.getFloaters().toLowerCase().contains(newValue.toLowerCase().trim()));
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

        final TextField addPassToAssists = new TextField();
        addPassToAssists.setFont(new Font("Times New Roman", 16));
        addPassToAssists.setPromptText("Pass To Assists");
        addPassToAssists.setPrefWidth(120);

        final TextField addFastBreakAssists = new TextField();
        addFastBreakAssists.setFont(new Font("Times New Roman", 16));
        addFastBreakAssists.setPromptText("Fas Break Assists");
        addFastBreakAssists.setPrefWidth(120);

        final TextField addFloaters = new TextField();
        addFloaters.setFont(new Font("Times New Roman", 16));
        addFloaters.setPromptText("Floaters");
        addFloaters.setPrefWidth(120);

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
                boolean passtoassists = DataChecker.onlyDigits(addPassToAssists.getText());
                boolean fastbreakassists = DataChecker.onlyDigits(addFastBreakAssists.getText());
                boolean floaters = DataChecker.onlyDigits(addFloaters.getText());

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
                } else if (!passtoassists) {
                    addPassToAssists.setPromptText("Only Numbers Allowed");
                    addPassToAssists.clear();
                } else if (!fastbreakassists) {
                    addFastBreakAssists.setPromptText("Only Numbers Allowed");
                    addFastBreakAssists.clear();
                } else if (!floaters) {
                    addFloaters.setPromptText("Only Numbers Allowed");
                    addFloaters.clear();
                } else {
                    Read.playMaker.add(new playmaker(addName.getText(), addPosition.getText(), addPoints.getText(),
                            addAssists.getText(), addRebounds.getText(), addSteals.getText(), addBlocks.getText(),
                            addPassToAssists.getText(), addFastBreakAssists.getText(), addFloaters.getText()));
                    addName.clear();
                    addPosition.clear();
                    addPoints.clear();
                    addAssists.clear();
                    addRebounds.clear();
                    addSteals.clear();
                    addBlocks.clear();
                    addPassToAssists.clear();
                    addFastBreakAssists.clear();
                    addFloaters.clear();
                    addPoints.setPromptText("Points");
                    addAssists.setPromptText("Assists");
                    addRebounds.setPromptText("Rebounds");
                    addSteals.setPromptText("Steals");
                    addBlocks.setPromptText("Blocks");
                    addPassToAssists.setPromptText("Drives");
                    addFastBreakAssists.setPromptText("Fastbreaks");
                    addFloaters.setPromptText("Contested Layups");
                }
                try {
                    Write.playMakerWrite();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
        hb.getChildren().addAll(addName, addPosition, addPoints, addAssists, addRebounds, addSteals, addBlocks,
                addPassToAssists, addFastBreakAssists, addFloaters, addButton);
        hb.setSpacing(3);
        // creating scene
        Scene slasherScene = new Scene(new Group());
        // creating label at the top of the scene
        final Label label = new Label("Play Makers");
        label.setFont(new Font("Times New Roman", 20));
        label.setTranslateX(625);
        playerTable.setEditable(true);
        // Team selectedRecord = index;
        // final Label newLabel = new Label(index.getTeamName());
        // newLabel.setFont(new Font("Times New Roman", 20));
        // newLabel.setTranslateX(200);
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));

        final Button cellButton = new Button("Back to Menu");
        cellButton.setTranslateX(1310);
        cellButton.setTranslateY(-35);
        cellButton.setOnAction(actionEvent -> {
            try {
                Write.playMakerWrite();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            globalStage.setScene(scene);
        });
        final Button deleteButton = new Button("Delete");

        deleteButton.setOnAction(e -> {
            playmaker selectedItem = playerTable.getSelectionModel().getSelectedItem();
            if (selectedItem != null) {
                Read.playMaker.remove(selectedItem);
                try {
                    Write.playMakerWrite();
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
