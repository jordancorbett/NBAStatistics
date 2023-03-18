package PlayerClasses;

import javafx.beans.property.SimpleStringProperty;

public class threeandD extends Player {
    public SimpleStringProperty deflections;
    public SimpleStringProperty catchandshoot;
    public SimpleStringProperty offballscreens;

    public threeandD(String Name, String Position, String points, String assists, String rebounds, String steals,
            String blocks, String deflects, String cands, String obs) {
        super(Name, Position, points, assists, rebounds, steals, blocks);
        deflections = new SimpleStringProperty(deflects);
        catchandshoot = new SimpleStringProperty(cands);
        offballscreens = new SimpleStringProperty(obs);
    }

    public String getDeflections() {
        return deflections.get();
    }

    public void setDeflections(String deflections) {
        this.deflections.set(deflections);
    }

    public String getCatchAndShoot() {
        return catchandshoot.get();
    }

    public void setCatchAndShoot(String cands) {
        catchandshoot.set(cands);
    }

    public String getOffBallScreens() {
        return offballscreens.get();
    }

    public void setOffBallScreens(String obs) {
        offballscreens.set(obs);
    }
}