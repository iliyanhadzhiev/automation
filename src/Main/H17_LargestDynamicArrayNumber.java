package Main;

import java.util.Scanner;

public class H17_LargestDynamicArrayNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide array length: ");
        int arrayLength = scanner.nextInt();
        int[] numbersArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Provide array element #" + i + ": ");
            numbersArray[i] = scanner.nextInt();
        }

        int largestNumber = numbersArray[0];

        for (int i = 0; i < arrayLength; i++) {
            if (numbersArray[i] > largestNumber) {
                largestNumber = numbersArray[i];
            }
        }
        System.out.println("The largest number in the array is: " + largestNumber);
    }
}
