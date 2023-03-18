package PlayerClasses;

class DataChecker {
    //this method checks to see if the given string has any characters in it and returning false if so.
    //it takes in the string, and assigns a boolean variable to true.. taking the assumtion there is no numbers
    //it looks through the length of the String... for every value it takes the char of the charcter in that location 
    //checks to see if its outside of the char range where numbers should be found meaning its a charcter
    //making check false and returning if a charcter is foubnd
    public static boolean onlyDigits(String str) {
        boolean check = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) <= '0' || str.charAt(i) >= '9') {
                check = false;
            }
        }
        return check;
    }
}