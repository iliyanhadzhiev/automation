package Constructors;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Mercedes", "S500", 2024, 540, false);
        Car car2 = new Car("BMW", "Grey", true);
        Car car3 = new Car("Porsche", "Black", 2021, 370);
        Car car4 = new Car("Audi", 2019, 180, true);
        Car car5 = new Car();

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}
