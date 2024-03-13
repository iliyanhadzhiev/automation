package Main;

import java.util.Scanner;

public class H23_MiddleStringChar {
    public static void main(String[] args) {

/*
   Note:
a) If the length of the string is even there will be two middle characters.
b) If the length of the string is odd there will be one middle character.
     Write a Java method to count all words in a string.
*/

        Scanner scanner = new Scanner((System.in));
        System.out.println("Provide a string: ");
        String userInput = scanner.nextLine();

        System.out.println(getMiddleChar(userInput));

    }

    public static String getMiddleChar(String string1) {
        int stringLength = string1.length();
        int stringMiddle = stringLength / 2;
        String returnString;

        if (stringLength % 2 == 0) {
            returnString = "" + string1.charAt(stringMiddle - 1) + string1.charAt(stringMiddle);
        } else {
            returnString = "" + string1.charAt(stringMiddle);
        }
        return returnString;
    }
}
