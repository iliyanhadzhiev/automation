package Main;

import java.util.Scanner;

public class H1_Name {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your first name? ");
        String firstName = scanner.nextLine();

        System.out.println("What is your middle name? ");
        String middleName = scanner.nextLine();

        System.out.println("What is your last name? ");
        String lastName = scanner.nextLine();

        String name = firstName + " " + middleName + " " + lastName;
        System.out.println("Your full name is: " + name);
    }
}
