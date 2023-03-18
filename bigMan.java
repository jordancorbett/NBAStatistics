package PlayerClasses;

import javafx.beans.property.SimpleStringProperty;
// all player classes are identical... only this one will be fully commented
//extending player class
public class bigMan extends Player {
    //intializing bigMan specific properties
    public SimpleStringProperty postups;
    public SimpleStringProperty screensSet;
    public SimpleStringProperty offensiveRebounds;
// taking input.. then calling the super contstructor to intializing those first properties which are for all players
// initialiing the bigMan specific properties
    public bigMan(String Name, String Position, String points, String assists, String rebounds, String steals,
            String blocks, String postups, String screensSet, String offrebounds) {
        super(Name, Position, points, assists, rebounds, steals, blocks);
        this.postups = new SimpleStringProperty(postups);
        this.screensSet = new SimpleStringProperty(screensSet);
        this.offensiveRebounds = new SimpleStringProperty(offrebounds);
    }
//getters
    public String getPostUps() {
        return postups.get();
    }
//setters
    public void setPostUps(String postups) {
        this.postups.set(postups);
    }

    public String getScreensSet() {
        return screensSet.get();
    }

    public void setScreensSet(String screensSet) {
        this.screensSet.set(screensSet);
    }

    public String getOffensiveRebounds() {
        return offensiveRebounds.get();
    }

    public void setOffensiveRebounds(String offrebounds) {
        offensiveRebounds.set(offrebounds);
    }
}