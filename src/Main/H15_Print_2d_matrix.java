package Main;

public class H15_Print_2d_matrix {

    public static void main(String[] args) {


//        int[][] numbersArray = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        int[][] numbersArray = new int[4][3];
        numbersArray[0][0] = 1;
        numbersArray[0][1] = 2;
        numbersArray[0][2] = 3;
        numbersArray[1][0] = 4;
        numbersArray[1][1] = 5;
        numbersArray[1][2] = 6;
        numbersArray[2][0] = 7;
        numbersArray[2][1] = 8;
        numbersArray[2][2] = 9;
        numbersArray[3][0] = 10;
        numbersArray[3][1] = 11;
        numbersArray[3][2] = 12;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(numbersArray[i][j]);
            }
        }
    }
}
