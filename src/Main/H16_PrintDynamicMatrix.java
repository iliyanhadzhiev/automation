package Main;

import java.util.Arrays;
import java.util.Scanner;

public class H16_PrintDynamicMatrix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Matrix rows: ");
        int arrayRows = scanner.nextInt();

        System.out.println("Matrix columns: ");
        int arrayColumns = scanner.nextInt();

        int[][] numbersArray = new int[arrayRows][arrayColumns];

        for (int i = 0; i < arrayRows; i++) {
            for (int j = 0; j < arrayColumns; j++) {
                System.out.println("Provide matrix element [" + i + "][" + j+"]: ");
                numbersArray[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < arrayRows; i++) {
            for (int j = 0; j < arrayColumns; j++) {
                System.out.println(numbersArray[i][j]);
            }
        }

        System.out.println();
        System.out.println(Arrays.deepToString(numbersArray));

        System.out.println();
        for (int[] row : numbersArray) {
            System.out.println(Arrays.toString(row));
        }
    }
}
