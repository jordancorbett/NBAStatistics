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

public class SlasherStage extends App {
    public static Scene playerStage(Stage globalStage) {

        final TableView<Slasher> playerTable = new TableView<Slasher>();
        final HBox ghb = new HBox();
        final HBox hb = new HBox();
        // String Position, String points, String assists, String rebounds, String
        // steals, String blocks, String drives, String fstbreak, String contlays
        TableColumn<Slasher, String> nameCol = new TableColumn<Slasher, String>("Name");
        nameCol.setCellValueFactory(new PropertyValueFactory<Slasher, String>("name"));
        nameCol.setMinWidth(150);
        nameCol.setCellFactory(TextFieldTableCell.forTableColumn());
        nameCol.setOnEditCommit(new EventHandler<CellEditEvent<Slasher, String>>() {
            @Override
            public void handle(CellEditEvent<Slasher, String> t) {
                ((Slasher) t.getTableView().getItems().get(t.getTablePosition().getRow())).setName(t.getNewValue());
            }
        });
        TableColumn<Slasher, String> positionCol = new TableColumn<Slasher, String>("Position");
        positionCol.setCellValueFactory(new PropertyValueFactory<Slasher, String>("Position"));
        positionCol.setMinWidth(150);
        positionCol.setCellFactory(TextFieldTableCell.forTableColumn());
        positionCol.setOnEditCommit(new EventHandler<CellEditEvent<Slasher, String>>() {
            @Override
            public void handle(CellEditEvent<Slasher, String> t) {
                ((Slasher) t.getTableView().getItems().get(t.getTablePosition().getRow())).setPosition(t.getNewValue());
            }
        });
        TableColumn<Slasher, String> pointsCol = new TableColumn<Slasher, String>("Points");
        pointsCol.setCellValueFactory(new PropertyValueFactory<Slasher, String>("points"));
        pointsCol.setMinWidth(150);
        pointsCol.setCellFactory(TextFieldTableCell.forTableColumn());
        pointsCol.setOnEditCommit(new EventHandler<CellEditEvent<Slasher, String>>() {
            @Override
            public void handle(CellEditEvent<Slasher, String> t) {
                ((Slasher) t.getTableView().getItems().get(t.getTablePosition().getRow())).setPoints(t.getNewValue());
            }
        });
        TableColumn<Slasher, String> assistsCol = new TableColumn<Slasher, String>("Assists");
        assistsCol.setCellValueFactory(new PropertyValueFactory<Slasher, String>("assists"));
        assistsCol.setMinWidth(150);
        assistsCol.setCellFactory(TextFieldTableCell.forTableColumn());
        assistsCol.setOnEditCommit(new EventHandler<CellEditEvent<Slasher, String>>() {
            @Override
            public void handle(CellEditEvent<Slasher, String> t) {
                ((Slasher) t.getTableView().getItems().get(t.getTablePosition().getRow())).setAssists(t.getNewValue());
            }
        });
        TableColumn<Slasher, String> reboundsCol = new TableColumn<Slasher, String>("Rebounds");
        reboundsCol.setCellValueFactory(new PropertyValueFactory<Slasher, String>("rebounds"));
        reboundsCol.setMinWidth(150);
        reboundsCol.setCellFactory(TextFieldTableCell.forTableColumn());
        reboundsCol.setOnEditCommit(new EventHandler<CellEditEvent<Slasher, String>>() {
            @Override
            public void handle(CellEditEvent<Slasher, String> t) {
                ((Slasher) t.getTableView().getItems().get(t.getTablePosition().getRow())).setRebounds(t.getNewValue());
            }
        });
        TableColumn<Slasher, String> stealsCol = new TableColumn<Slasher, String>("Steals");
        stealsCol.setCellValueFactory(new PropertyValueFactory<Slasher, String>("steals"));
        stealsCol.setMinWidth(200);
        stealsCol.setCellFactory(TextFieldTableCell.forTableColumn());
        stealsCol.setOnEditCommit(new EventHandler<CellEditEvent<Slasher, String>>() {
            @Override
            public void handle(CellEditEvent<Slasher, String> t) {
                ((Slasher) t.getTableView().getItems().get(t.getTablePosition().getRow())).setSteals(t.getNewValue());
            }
        });
        TableColumn<Slasher, String> blocksCol = new TableColumn<Slasher, String>("Blocks");
        blocksCol.setCellValueFactory(new PropertyValueFactory<Slasher, String>("blocks"));
        blocksCol.setMinWidth(150);
        blocksCol.setCellFactory(TextFieldTableCell.forTableColumn());
        blocksCol.setOnEditCommit(new EventHandler<CellEditEvent<Slasher, String>>() {
            @Override
            public void handle(CellEditEvent<Slasher, String> t) {
                ((Slasher) t.getTableView().getItems().get(t.getTablePosition().getRow())).setBlocks(t.getNewValue());
            }
        });
        TableColumn<Slasher, String> drivesCol = new TableColumn<Slasher, String>("Drives");
        drivesCol.setCellValueFactory(new PropertyValueFactory<Slasher, String>("drives"));
        drivesCol.setMinWidth(150);
        drivesCol.setCellFactory(TextFieldTableCell.forTableColumn());
        drivesCol.setOnEditCommit(new EventHandler<CellEditEvent<Slasher, String>>() {
            @Override
            public void handle(CellEditEvent<Slasher, String> t) {
                ((Slasher) t.getTableView().getItems().get(t.getTablePosition().getRow())).setDrives(t.getNewValue());
            }
        });
        TableColumn<Slasher, String> contestCol = new TableColumn<Slasher, String>("Contested Layups");
        contestCol.setCellValueFactory(new PropertyValueFactory<Slasher, String>("contestedLayups"));
        contestCol.setMinWidth(150);
        contestCol.setCellFactory(TextFieldTableCell.forTableColumn());
        contestCol.setOnEditCommit(new EventHandler<CellEditEvent<Slasher, String>>() {
            @Override
            public void handle(CellEditEvent<Slasher, String> t) {
                ((Slasher) t.getTableView().getItems().get(t.getTablePosition().getRow()))
                        .setContestedLayups(t.getNewValue());
            }
        });
        TableColumn<Slasher, String> fstBreakCol = new TableColumn<Slasher, String>("Fast Breaks");
        fstBreakCol.setCellValueFactory(new PropertyValueFactory<Slasher, String>("fastBreak"));
        fstBreakCol.setMinWidth(150);
        fstBreakCol.setCellFactory(TextFieldTableCell.forTableColumn());
        fstBreakCol.setOnEditCommit(new EventHandler<CellEditEvent<Slasher, String>>() {
            @Override
            public void handle(CellEditEvent<Slasher, String> t) {
                ((Slasher) t.getTableView().getItems().get(t.getTablePosition().getRow()))
                        .setFastBreak(t.getNewValue());
            }
        });
        FilteredList<Slasher> flPerson = new FilteredList(Read.slasher, p -> true);// Pass the data to a filtered list
        playerTable.setItems(flPerson);// Set the table's items using the filtered list
        playerTable.getColumns().addAll(nameCol, positionCol, pointsCol, assistsCol, reboundsCol, blocksCol, drivesCol,
                fstBreakCol, contestCol);
        // Adding ChoiceBox and TextField here!
        ChoiceBox<String> choiceBox = new ChoiceBox();
        choiceBox.getItems().addAll("Name", "Position", "Points", "Assists", "Rebounds", "Steals", "Blocks", "Drives",
                "Fast Breaks", "Contested Layups");
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
            case "Drives":
                flPerson.setPredicate(p -> p.getDrives().toLowerCase().contains(newValue.toLowerCase().trim()));
                break;
            case "Fast Breaks":
                flPerson.setPredicate(p -> p.getFastBreak().toLowerCase().contains(newValue.toLowerCase().trim()));

                break;
            case "Contested Layups":
                flPerson.setPredicate(
                        p -> p.getContestedLayups().toLowerCase().contains(newValue.toLowerCase().trim()));
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

        final TextField addDrives = new TextField();
        addDrives.setFont(new Font("Times New Roman", 16));
        addDrives.setPromptText("Drives");
        addDrives.setPrefWidth(120);

        final TextField addFastBreaks = new TextField();
        addFastBreaks.setFont(new Font("Times New Roman", 16));
        addFastBreaks.setPromptText("Fast Breaks");
        addFastBreaks.setPrefWidth(120);

        final TextField addContestedLayups = new TextField();
        addContestedLayups.setFont(new Font("Times New Roman", 16));
        addContestedLayups.setPromptText("Contested Layups");
        addContestedLayups.setPrefWidth(120);

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
                boolean drives = DataChecker.onlyDigits(addDrives.getText());
                boolean fastbreaks = DataChecker.onlyDigits(addFastBreaks.getText());
                boolean contestedlayups = DataChecker.onlyDigits(addContestedLayups.getText());

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
                } else if (!drives) {
                    addDrives.setPromptText("Only Numbers Allowed");
                    addDrives.clear();
                } else if (!fastbreaks) {
                    addFastBreaks.setPromptText("Only Numbers Allowed");
                    addFastBreaks.clear();
                } else if (!contestedlayups) {
                    addContestedLayups.setPromptText("Only Numbers Allowed");
                    addContestedLayups.clear();
                } else {
                    Read.slasher.add(new Slasher(addName.getText(), addPosition.getText(), addPoints.getText(),
                            addAssists.getText(), addRebounds.getText(), addSteals.getText(), addBlocks.getText(),
                            addDrives.getText(), addFastBreaks.getText(), addContestedLayups.getText()));
                    addName.clear();
                    addPosition.clear();
                    addPoints.clear();
                    addAssists.clear();
                    addRebounds.clear();
                    addSteals.clear();
                    addBlocks.clear();
                    addDrives.clear();
                    addFastBreaks.clear();
                    addContestedLayups.clear();
                    addPoints.setPromptText("Points");
                    addAssists.setPromptText("Assists");
                    addRebounds.setPromptText("Rebounds");
                    addSteals.setPromptText("Steals");
                    addBlocks.setPromptText("Blocks");
                    addDrives.setPromptText("Drives");
                    addFastBreaks.setPromptText("Fastbreaks");
                    addContestedLayups.setPromptText("Contested Layups");
                }
                try {
                    Write.slasherWrite();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });

        hb.getChildren().addAll(addName, addPosition, addPoints, addAssists, addRebounds, addSteals, addBlocks,
                addDrives, addFastBreaks, addContestedLayups, addButton);
        hb.setSpacing(3);
        // creating scene
        Scene slasherScene = new Scene(new Group());
        // creating label at the top of the scene
        final Label label = new Label("Slashers");
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
                Write.slasherWrite();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            globalStage.setScene(scene);
        });

        final Button deleteButton = new Button("Delete");

        deleteButton.setOnAction(e -> {
            Slasher selectedItem = playerTable.getSelectionModel().getSelectedItem();
            if (selectedItem != null) {
                Read.slasher.remove(selectedItem);
                try {
                    Write.slasherWrite();
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
