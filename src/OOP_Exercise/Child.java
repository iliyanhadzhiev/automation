package OOP_Exercise;

public class Child extends Person {

    public Child(String name, char sex, String religion, String language, String nationality, String egn, String country) {
        super(name, sex, religion, language, "student", nationality, egn, country);
    }

    @Override
    public void setJob(String job) {
        throw new IllegalArgumentException("The child cannot have a job!");
    }

    @Override
    public boolean isAdult() {
        System.out.println("Not an adult!");
        return false;
    }

    @Override
    public boolean canTakeLoan() {
        System.out.println("A child cannot take a loan!");
        return false;
    }
}
