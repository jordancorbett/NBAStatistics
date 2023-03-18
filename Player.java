package PlayerClasses;

import javafx.beans.property.SimpleStringProperty;

public class Player {
    private SimpleStringProperty name;
    private SimpleStringProperty position;
    private SimpleStringProperty points;
    private SimpleStringProperty assists;
    private SimpleStringProperty rebounds;
    private SimpleStringProperty steals;
    private SimpleStringProperty blocks;

    public Player(String name, String Position, String points, String assists, String rebounds, String steals,
            String blocks) {
        this.name = new SimpleStringProperty(name);
        this.position = new SimpleStringProperty(Position);
        this.points = new SimpleStringProperty(points);
        this.assists = new SimpleStringProperty(assists);
        this.rebounds = new SimpleStringProperty(rebounds);
        this.steals = new SimpleStringProperty(steals);
        this.blocks = new SimpleStringProperty(blocks);
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getPosition() {
        return position.get();
    }

    public void setPosition(String position) {
        this.position.set(position);
    }

    public String getPoints() {
        return points.get();
    }

    public void setPoints(String points) {
        this.points.set(points);
    }

    public String getAssists() {
        return assists.get();
    }

    public void setAssists(String assists) {
        this.assists.set(assists);
    }

    public String getRebounds() {
        return rebounds.get();
    }

    public void setRebounds(String rebounds) {
        this.rebounds.set(rebounds);
    }

    public String getSteals() {
        return steals.get();
    }

    public void setSteals(String steals) {
        this.steals.set(steals);
    }

    public String getBlocks() {
        return blocks.get();
    }

    public void setBlocks(String blocks) {
        this.blocks.set(blocks);
    }

}
