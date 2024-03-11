package Main;

import java.util.Scanner;

public class H11_VacationType {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide desired type (Beach or Mountain): ");
        String desiredType = scanner.nextLine();
        boolean isValidType = false;

        if (desiredType.equalsIgnoreCase("Beach") || desiredType.equalsIgnoreCase("Mountain")) {
            isValidType = true;
        } else {
            System.out.println("There is no information about this type of vacation");
        }

        if (isValidType) {
            System.out.println("Please provide budget per day: ");
            int budget = scanner.nextInt();

            if (budget <= 0) {
                System.out.println("Invalid budget value");
            } else {
                if (desiredType.equalsIgnoreCase("Beach")) {
                    if (budget < 50) {
                        System.out.println("Recommended destination: A beach in Bulgaria");
                    } else {
                        System.out.println("Recommended destination: A beach outside Bulgaria");
                    }
                } else {
                    if (budget < 30) {
                        System.out.println("Recommended destination: A mountain in Bulgaria");
                    } else {
                        System.out.println("Recommended destination: A mountain outside Bulgaria");
                    }
                }
            }
        }
    }
}
