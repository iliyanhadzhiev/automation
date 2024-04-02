package OOP_Exercise;

public class American extends Person {
    public American(String name, char sex, String religion, String job, String egn, String country) {
        super(name, sex, religion, "English", job, "American", egn, country);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello!");
    }

    public void eatsBurger() {
        System.out.println("Love BURGER!!!");
    }
}
