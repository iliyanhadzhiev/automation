package Main;

public class H10_LargestArrayNumber {

    public static void main(String[] args) {

        int[] numbersArray = {4, 1, 12, 26, 7};
//        int counter = 1;
        int largestNumber = numbersArray[0];

        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] > largestNumber) {
                largestNumber = numbersArray[i];
            }
        }
        System.out.println("The largest number in the array is: " + largestNumber);
    }
}
