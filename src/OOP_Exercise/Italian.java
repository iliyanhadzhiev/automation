package OOP_Exercise;

public class Italian extends Person {
    public Italian(String name, char sex, String religion, String job, String egn, String country) {
        super(name, sex, religion, "Italian", job, "Italian", egn, country);
    }

    @Override
    public void sayHello() {
        System.out.println("Ciao!");
    }
}
