package Main;

import java.util.Scanner;

public class H6_QuadraticEquation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is side A of the triangle? ");
        String firstEntry = scanner.nextLine();
        double a = Double.parseDouble(firstEntry);

        System.out.println("What is side B of the triangle? ");
        String secondEntry = scanner.nextLine();
        double b = Double.parseDouble(secondEntry);

        System.out.println("What is side C of the triangle? ");
        String thirdEntry = scanner.nextLine();
        double c = Double.parseDouble(thirdEntry);

        double d = b * b - 4.0 * a * c;

        if (d > 0) {
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("The roots are " + root1 + " and " + root2);
        } else if (d == 0) {
            double root1 = -b / (2 * a);
            System.out.println("There is one double real root: " + root1);
        } else {
            System.out.println("There are no real roots");
        }
    }
}
