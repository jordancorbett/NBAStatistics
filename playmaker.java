package PlayerClasses;

import javax.swing.text.Position;
import javafx.beans.property.SimpleStringProperty;

public class playmaker extends Player {
    private SimpleStringProperty PassToAssists;
    private SimpleStringProperty fastBreakAssists;
    private SimpleStringProperty floaters;

    public playmaker(String Name, String Position, String points, String assists, String rebounds, String steals,
            String blocks, String PassToAssists, String fastBreakAssists, String floaters) {
        super(Name, Position, points, assists, rebounds, steals, blocks);
        this.PassToAssists = new SimpleStringProperty(PassToAssists);
        this.fastBreakAssists = new SimpleStringProperty(fastBreakAssists);
        this.floaters = new SimpleStringProperty(floaters);
    }

    public String getPassToAssists() {
        return PassToAssists.get();
    }

    public void setPassToAssists(String PassToAssists) {
        this.PassToAssists.set(PassToAssists);
    }

    public String getFastBreakAssists() {
        return fastBreakAssists.get();
    }

    public void setFastBreakAssists(String fastBreakAssists) {
        this.fastBreakAssists.set(fastBreakAssists);
    }

    public String getFloaters() {
        return floaters.get();
    }

    public void setFloaters(String floaters) {
        this.floaters.set(floaters);
    }
}
