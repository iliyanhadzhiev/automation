package Main;

import java.util.Arrays;

public class H13_ReverseArray {

    public static void main(String[] args) {

        int[] numbersArray = {10, 20, 30, 40, 50};

        for (int i = 0; i < numbersArray.length/2; i++) {
            int temp = numbersArray[i];
            numbersArray[i] = numbersArray[numbersArray.length - i -1];
            numbersArray[numbersArray.length - i -1] = temp;
        }

        System.out.println(Arrays.toString(numbersArray));
    }
}
