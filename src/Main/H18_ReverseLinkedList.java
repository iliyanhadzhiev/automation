package Main;

import java.util.Collections;
import java.util.LinkedList;

public class H18_ReverseLinkedList {

    public static void main(String[] args) {

        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println("LinkedList: " + cars);
        System.out.println(cars.get(0));

        Collections.reverse(cars);
        System.out.println("Reversed LinkedList: " + cars);
    }
}
