package Main;

import java.util.Scanner;

public class H8_WorkAge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        String userInput = scanner.nextLine();
        double age = Double.parseDouble(userInput);

        if (age <= 0) {
            System.out.println("Invalid age!");
        } else if (age < 16) {
            System.out.println("You are not eligible to work");
        } else {
            System.out.println("You are eligible to work");
        }
    }
}
