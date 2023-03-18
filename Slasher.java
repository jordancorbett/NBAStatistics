package PlayerClasses;

import javafx.beans.property.SimpleStringProperty;

public class Slasher extends Player {
    private SimpleStringProperty drives; // drives per game
    private SimpleStringProperty fastBreaks;
    private SimpleStringProperty contestedLayups;

    public Slasher(String Name, String Position, String points, String assists, String rebounds, String steals,
            String blocks, String drives, String fastBreaks, String contestLayups) {
        super(Name, Position, points, assists, rebounds, steals, blocks);
        this.drives = new SimpleStringProperty(drives);
        this.fastBreaks = new SimpleStringProperty(fastBreaks);
        this.contestedLayups = new SimpleStringProperty(contestLayups);
    }

    public String getDrives() {
        return drives.get();
    }

    public void setDrives(String drives) {
        this.drives.set(drives);
    }

    public String getFastBreak() {
        return fastBreaks.get();
    }

    public void setFastBreak(String fastBreaks) {
        this.fastBreaks.set(fastBreaks);
    }

    public String getContestedLayups() {
        return contestedLayups.get();
    }

    public void setContestedLayups(String contestedLayups) {
        this.contestedLayups.set(contestedLayups);
    }
}
