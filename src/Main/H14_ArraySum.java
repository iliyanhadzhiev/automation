package Main;

import java.util.Scanner;

public class H14_ArraySum {

    public static void main(String[] args) {

//        int[] numbersArray = {12, 15, 32, 42, 55, 75, 120, 132, 150, 180, 200};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide array length: ");
        int arrayLength = scanner.nextInt();
        int arraySum = 0;

        int[] numbersArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Provide array element #" + i + ": ");
            numbersArray[i] = scanner.nextInt();
            arraySum += numbersArray[i];
        }

        System.out.println("The sum of the array numbers is: " + arraySum);
    }
}
