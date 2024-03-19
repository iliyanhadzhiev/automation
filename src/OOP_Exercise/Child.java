package OOP_Exercise;

public class Child extends Person {

    public Child(String name, char sex, String religion, String language, String nationality, String egn, String country) {
        super(name, sex, religion, language, "job", nationality, egn, country);
    }

    @Override
    public void setJob(String job) {
        throw new IllegalArgumentException("The child cannot have a job!");
    }
}
