package Main;

import java.util.Scanner;

public class H22_AverageNumberMethod {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide the first number: ");
        String userInput1 = scanner.nextLine();
        double firstNumber = Double.parseDouble(userInput1);

        System.out.println("Please provide the second number: ");
        String userInput2 = scanner.nextLine();
        double secondNumber = Double.parseDouble(userInput2);

        System.out.println("Please provide the third number: ");
        String userInput3 = scanner.nextLine();
        double thirdNumber = Double.parseDouble(userInput3);

        System.out.println("The average of the three numbers is: " + getAverageNumber(firstNumber, secondNumber, thirdNumber));
    }
        public static double getAverageNumber(double number1, double number2, double number3) {
            return (number1 + number2 + number3)/3;
        }
}
