package PlayerClasses;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Read {
    // intiailing obsevable list of person object
    public static ObservableList<Slasher> slasher = FXCollections.observableArrayList();
    public static ObservableList<bigMan> bigMan = FXCollections.observableArrayList();
    public static ObservableList<threeandD> threeAndD = FXCollections.observableArrayList();
    public static ObservableList<playmaker> playMaker = FXCollections.observableArrayList();;
    // try/catch is the same for all expcept variable names
    // method is void, does not need to return anything
    public static void getSlasherInfo() {
        // try catch to avoid erros
        try {
            // intialiing filereader
            FileReader fr = new FileReader(new File("src/PlayerClasses/Slasher.txt"));
            BufferedReader br = new BufferedReader(fr);
            // initlaizing string, this will be used to read lines of the file
            String line;
            // loops through all lines untill it finds a null line
            // splits the line when ~ is found, then is intialized into array, this array is
            // then assigned to a person object which is then added into the observeable list
            while ((line = br.readLine()) != null) {
                String[] temp = line.split("~");
                Slasher slashers = new Slasher(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7],
                        temp[8], temp[9]);
                slasher.add(slashers);
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void getBigManInfo() {
        try {
            FileReader fr = new FileReader(new File("src/PlayerClasses/BigMan.txt"));
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split("~");
                bigMan bigMen = new bigMan(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7],
                        temp[8], temp[9]);
                bigMan.add(bigMen);
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void getThreeAndDInfo() {
        try {
            FileReader fr = new FileReader(new File("src/PlayerClasses/ThreeAndD.txt"));
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split("~");
                threeandD threeAndDs = new threeandD(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6],
                        temp[7], temp[8], temp[9]);
                threeAndD.add(threeAndDs);
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void getPlayMakerInfo() {
        try {
            FileReader fr = new FileReader(new File("src/PlayerClasses/PlayMaker.txt"));
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split("~");
                playmaker playMakers = new playmaker(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6],
                        temp[7], temp[8], temp[9]);
                playMaker.add(playMakers);
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
