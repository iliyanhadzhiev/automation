package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Provide the first number: ");
            int num1 = scanner.nextInt();

            System.out.println("Provide the second number: ");
            int num2 = scanner.nextInt();

            if (num2 == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }

            double numResult = (double) num1 / num2;
            System.out.println("The result is: " + numResult);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please provide an integer.");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
