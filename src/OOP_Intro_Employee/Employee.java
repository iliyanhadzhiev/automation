package OOP_Intro_Employee;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private double salaryPerMonth;

    public Employee(int id, String firstName, String lastName, double salaryPerMonth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salaryPerMonth = salaryPerMonth;
    }

    public String getName() {
        String fullName = firstName + " " + lastName;
        return fullName;
    }

    public double getAnnualSalary() {
        double annualSalary = salaryPerMonth * 12;
        return annualSalary;
    }

    public double raiseSalary(double number) {
        double salaryIncreasePercentage = number / 100;
        double salaryIncreaseAmount = salaryPerMonth * salaryIncreasePercentage;
        double updatedSalary = salaryPerMonth + salaryIncreaseAmount;
        salaryPerMonth += salaryIncreaseAmount;
        return updatedSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salaryPerMonth=" + salaryPerMonth +
                '}';
    }
}
