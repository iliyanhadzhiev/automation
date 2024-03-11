package Main;

public class H12_ArrayIterateNumbers {

    public static void main(String[] args) {

        int[] numbersArray = {12, 15, 32, 42, 55, 75, 120, 132, 150, 180, 200};

        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] > 150) {
                break;
            } else if (numbersArray[i] % 5 == 0) {
                System.out.println(numbersArray[i]);
            }
        }
    }
}
