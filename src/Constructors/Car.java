package Constructors;

public class Car {

    private String name;
    private String color;
    private int releaseYear;
    private int horsePower;
    private boolean secondHand;

//Constructors

    public Car(String name, String color, int releaseYear, int horsePower, boolean secondHand) {
        this.name = name;
        this.color = color;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.secondHand = secondHand;
    }

    public Car(String name, String color, boolean secondHand) {
        this(name, color, -1, -1, secondHand);
    }

    public Car(String name, String color, int releaseYear, int horsePower) {
        this(name, color, releaseYear, horsePower, false);
    }

    public Car(String name, int releaseYear, int horsePower, boolean secondHand) {
        this(name, "N/A", releaseYear, horsePower, secondHand);
    }

    public Car() {
        this("N/A", "N/A", -1, -1, false);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", releaseYear=" + releaseYear +
                ", horsePower=" + horsePower +
                ", secondHand=" + secondHand +
                '}';
    }
}
