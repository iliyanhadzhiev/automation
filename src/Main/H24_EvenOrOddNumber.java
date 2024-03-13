package Main;

import java.util.Scanner;

public class H24_EvenOrOddNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide an integer: ");
        String userInput = scanner.nextLine();
        int userInputInt = Integer.parseInt(userInput);

        if (isEven(userInputInt)) {
            System.out.println("It is an even number");
        } else {
            System.out.println("It is an odd number");
        }
    }

    public static boolean isEven(int number) {
        return (number % 2 == 0);
    }
}
