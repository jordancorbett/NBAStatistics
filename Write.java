package PlayerClasses;

import java.io.FileWriter;
import java.io.IOException;

public class Write {
//all methods are the same just different variable names
    public static void slasherWrite() throws IOException {
        // intializing file writier
        FileWriter fr = new FileWriter("src/PlayerClasses/Slasher.txt");
        // intialzing int rows which is the number of lines needed to be written to file
        int rows = Read.slasher.size();
        //loops through every person obeject in the obserable list.
        //uses the get accesor method for each data poitn of a contact then writes it
        // to the file split by ~
        // the if statements are used to check if the string is empty... errors arise in the read methods if they are empty
        // so i add a space if they are empty
        for (int i = 0; i < rows; i++) {
            Slasher current = Read.slasher.get(i);
            String line = "";
            if (current.getName() == "") {
                line += " " + "~";
            } else {
                line += current.getName() + "~";
            }
            if (current.getPosition() == "") {
                line += " " + "~";
            } else {
                line += current.getPosition() + "~";
            }
            if (current.getPoints() == "") {
                line += " " + "~";
            } else {
                line += current.getPoints() + "~";
            }
            if (current.getAssists() == "") {
                line += " " + "~";
            } else {
                line += current.getAssists() + "~";
            }
            if (current.getRebounds() == "") {
                line += " " + "~";
            } else {
                line += current.getRebounds() + "~";
            }
            if (current.getSteals() == "") {
                line += " " + "~";
            } else {
                line += current.getSteals() + "~";
            }
            if (current.getBlocks() == "") {
                line += " " + "~";
            } else {
                line += current.getBlocks() + "~";
            }
            if (current.getDrives() == "") {
                line += " " + "~";
            } else {
                line += current.getDrives() + "~";
            }
            if (current.getFastBreak() == "") {
                line += " " + "~";
            } else {
                line += current.getFastBreak() + "~";
            }
            if (current.getContestedLayups() == "") {
                line += " " + "\n";
            } else {
                line += current.getContestedLayups() + "\n";
            }
            fr.write(line);
        }

        fr.close();
    }

    public static void bigManWrite() throws IOException {
        // intializing file writier
        FileWriter fr = new FileWriter("src/PlayerClasses/BigMan.txt");
        // intialzing int rows which is the number of lines needed to be written to file
        int rows = Read.bigMan.size();
        // //loops through every person obeject in the obserable list.
        // //uses the get accesor method for each data poitn of a contact then writes it
        // to the file split by ~
        for (int i = 0; i < rows; i++) {
            bigMan current = Read.bigMan.get(i);
            String line = "";
            if (current.getName() == "") {
                line += " " + "~";
            } else {
                line += current.getName() + "~";
            }
            if (current.getPosition() == "") {
                line += " " + "~";
            } else {
                line += current.getPosition() + "~";
            }
            if (current.getPoints() == "") {
                line += " " + "~";
            } else {
                line += current.getPoints() + "~";
            }
            if (current.getAssists() == "") {
                line += " " + "~";
            } else {
                line += current.getAssists() + "~";
            }
            if (current.getRebounds() == "") {
                line += " " + "~";
            } else {
                line += current.getRebounds() + "~";
            }
            if (current.getSteals() == "") {
                line += " " + "~";
            } else {
                line += current.getSteals() + "~";
            }
            if (current.getBlocks() == "") {
                line += " " + "~";
            } else {
                line += current.getBlocks() + "~";
            }
            if (current.getPostUps() == "") {
                line += " " + "~";
            } else {
                line += current.getPostUps() + "~";
            }
            if (current.getScreensSet() == "") {
                line += " " + "~";
            } else {
                line += current.getScreensSet() + "~";
            }
            if (current.getOffensiveRebounds() == "") {
                line += " " + "\n";
            } else {
                line += current.getOffensiveRebounds() + "\n";
            }
            fr.write(line);
        }

        fr.close();
    }

    public static void playMakerWrite() throws IOException {
        // intializing file writier
        FileWriter fr = new FileWriter("src/PlayerClasses/Playmaker.txt");
        // intialzing int rows which is the number of lines needed to be written to file
        int rows = Read.playMaker.size();
        // //loops through every person obeject in the obserable list.
        // //uses the get accesor method for each data poitn of a contact then writes it
        // to the file split by ~
        for (int i = 0; i < rows; i++) {
            playmaker current = Read.playMaker.get(i);
            String line = "";
            if (current.getName() == "") {
                line += " " + "~";
            } else {
                line += current.getName() + "~";
            }
            if (current.getPosition() == "") {
                line += " " + "~";
            } else {
                line += current.getPosition() + "~";
            }
            if (current.getPoints() == "") {
                line += " " + "~";
            } else {
                line += current.getPoints() + "~";
            }
            if (current.getAssists() == "") {
                line += " " + "~";
            } else {
                line += current.getAssists() + "~";
            }
            if (current.getRebounds() == "") {
                line += " " + "~";
            } else {
                line += current.getRebounds() + "~";
            }
            if (current.getSteals() == "") {
                line += " " + "~";
            } else {
                line += current.getSteals() + "~";
            }
            if (current.getBlocks() == "") {
                line += " " + "~";
            } else {
                line += current.getBlocks() + "~";
            }
            if (current.getPassToAssists() == "") {
                line += " " + "~";
            } else {
                line += current.getPassToAssists() + "~";
            }
            if (current.getFastBreakAssists() == "") {
                line += " " + "~";
            } else {
                line += current.getFastBreakAssists() + "~";
            }
            if (current.getFloaters() == "") {
                line += " " + "\n";
            } else {
                line += current.getFloaters() + "\n";
            }
            fr.write(line);
        }

        fr.close();
    }

    public static void threeAndDWrite() throws IOException {
        // intializing file writier
        FileWriter fr = new FileWriter("src/PlayerClasses/ThreeAndD.txt");
        // intialzing int rows which is the number of lines needed to be written to file
        int rows = Read.threeAndD.size();
        // //loops through every person obeject in the obserable list.
        // //uses the get accesor method for each data poitn of a contact then writes it
        // to the file split by ~
        for (int i = 0; i < rows; i++) {
            threeandD current = Read.threeAndD.get(i);
            String line = "";
            if (current.getName() == "") {
                line += " " + "~";
            } else {
                line += current.getName() + "~";
            }
            if (current.getPosition() == "") {
                line += " " + "~";
            } else {
                line += current.getPosition() + "~";
            }
            if (current.getPoints() == "") {
                line += " " + "~";
            } else {
                line += current.getPoints() + "~";
            }
            if (current.getAssists() == "") {
                line += " " + "~";
            } else {
                line += current.getAssists() + "~";
            }
            if (current.getRebounds() == "") {
                line += " " + "~";
            } else {
                line += current.getRebounds() + "~";
            }
            if (current.getSteals() == "") {
                line += " " + "~";
            } else {
                line += current.getSteals() + "~";
            }
            if (current.getBlocks() == "") {
                line += " " + "~";
            } else {
                line += current.getBlocks() + "~";
            }
            if (current.getDeflections() == "") {
                line += " " + "~";
            } else {
                line += current.getDeflections() + "~";
            }
            if (current.getCatchAndShoot() == "") {
                line += " " + "~";
            } else {
                line += current.getCatchAndShoot() + "~";
            }
            if (current.getOffBallScreens() == "") {
                line += " " + "\n";
            } else {
                line += current.getOffBallScreens() + "\n";
            }
            fr.write(line);
        }

        fr.close();
    }
}
