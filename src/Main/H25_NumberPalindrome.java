package Main;

import java.util.Scanner;

public class H25_NumberPalindrome {

    public static void main(String[] args) {

// Takes as input a non-negative integer and returns true if the number is a palindrome

        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide a positive integer: ");
        String userInput = scanner.nextLine();
        int userNumber = Integer.parseInt(userInput);

        if (userNumber <= 0) {
            System.out.println("Not a positive number!");
        } else if (isPalindrome(userNumber)) {
            System.out.println(userNumber + " is a palindrome");
        } else {
            System.out.println(userNumber + " is not a palindrome");
        }

    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverse = 0;
        int lastDigit = 0;

        while (number != 0) {
            lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number = number / 10;
        }
        return reverse == originalNumber;
    }
}
