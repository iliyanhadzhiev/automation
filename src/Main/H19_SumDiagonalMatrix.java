package Main;

import java.util.Scanner;

public class H19_SumDiagonalMatrix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
/*
        int[][] numbersArray = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Provide matrix element [" + i + "][" + j+ "]: ");
                numbersArray[i][j] = scanner.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(numbersArray));

        int sumDiagonal = numbersArray[0][0] + numbersArray[1][1] + numbersArray[2][2] + numbersArray[3][3];
                System.out.println("The sum of the diagonal values is: "+ sumDiagonal);
*/
        System.out.println("Enter square matrix dimensions: ");
        int arraySize = scanner.nextInt();
        int[][] numbersArray = new int[arraySize][arraySize];
        int sumDiagonal = 0;

        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                System.out.println("Provide matrix element [" + i + "][" + j+ "]: ");
                numbersArray[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0, j = 0; i < arraySize; i++, j++) {
            sumDiagonal += numbersArray[i][j];
        }

        System.out.println("The sum of the diagonal values is: "+ sumDiagonal);
    }
}
