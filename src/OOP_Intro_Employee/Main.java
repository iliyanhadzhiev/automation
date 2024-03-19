package OOP_Intro_Employee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "Tony", "Adams", 1234.50);
        System.out.println("The employee name is: " + employee1.getName());
        System.out.println("The employee annual salary is: " + employee1.getAnnualSalary());
        System.out.println(employee1);
        Employee employee2 = new Employee(2,"John", "Terry", 1000);
        System.out.println(employee2);

        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide employee salary raise percentage: ");
        String userInput = scanner.nextLine();
        double increasePercentage = Double.parseDouble(userInput);
        System.out.println("The updated monthly salary is: " + employee1.raiseSalary(increasePercentage));
        System.out.println("The updated yearly salary is: " + employee1.getAnnualSalary());

        System.out.println(employee1);
        System.out.println(employee2);
    }
}
