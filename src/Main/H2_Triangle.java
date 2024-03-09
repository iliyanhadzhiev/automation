package Main;

import java.util.Scanner;

public class H2_Triangle {

    public static void main(String[] args) {

        //Covers Exercise 2, 3 and 5

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is side A of the triangle? ");
        String firstEntry = scanner.nextLine();
        double sideA = Double.parseDouble(firstEntry);

        System.out.println("What is side B of the triangle? ");
        String secondEntry = scanner.nextLine();
        double sideB = Double.parseDouble(secondEntry);

        System.out.println("What is side C of the triangle? ");
        String thirdEntry = scanner.nextLine();
        double sideC = Double.parseDouble(thirdEntry);

        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            System.out.println("The length of all sides should be a positive number");
        }

        if (sideA > sideB + sideC) {
            System.out.println("Side A should not be greater than the sum of side B and side C");
        }

        if (sideB > sideA + sideC) {
            System.out.println("Side B should not be greater than the sum of side A and side C");
        }

        if (sideC > sideA + sideB) {
            System.out.println("Side C should not be greater than the sum of side A and side B");
        }

        double trianglePerimeter = sideA + sideB + sideC;
        double s = (trianglePerimeter) / 2;
        double area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC)); // Heron's formula

        System.out.println("The perimeter of the triangle is " + trianglePerimeter);
        System.out.println("The area of the triangle is " + area);
        System.out.printf("Triangle's area is: %.2f",area);
    }
}
