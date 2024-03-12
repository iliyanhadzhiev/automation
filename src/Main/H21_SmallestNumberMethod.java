package Main;

import java.util.Scanner;

public class H21_SmallestNumberMethod {

    public static void main(String[] args) {

//        Write a Java method to find the smallest number among three numbers



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

        System.out.println(getSmallestNumber(firstNumber, secondNumber, thirdNumber));

    }
        public static double getSmallestNumber(double number1, double number2, double number3) {
        double smallesNumber = number1;

        if (number2 < smallesNumber) {
            smallesNumber = number2;
        }

        if (number3 < smallesNumber) {
            smallesNumber = number3;
        }
        return smallesNumber;
        }
}
