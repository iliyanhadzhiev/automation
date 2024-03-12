package Main;

import java.util.Arrays;
import java.util.Scanner;

public class H20_PalindromeString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide a word: ");
        String userInput = scanner.nextLine();
        char[] arrayNormal = new char[userInput.length()];
        char[] arrayReversed = new char[userInput.length()];

        for (int i = 0; i < userInput.length(); i++) {
            arrayNormal[i] = userInput.charAt(i);
        }

        for (int i = 0; i < arrayReversed.length; i++) {
            arrayReversed[i] = arrayNormal[arrayNormal.length - i - 1];
        }

        System.out.println(Arrays.toString(arrayNormal));
        System.out.println(Arrays.toString(arrayReversed));
         if (Arrays.equals(arrayNormal, arrayReversed)) {
             System.out.println("The word \"" + userInput + "\" is a palindrome");
         } else {
             System.out.println("The word \"" + userInput + "\" is NOT a palindrome");
         }
    }
}
