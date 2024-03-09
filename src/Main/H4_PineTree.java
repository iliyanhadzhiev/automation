package Main;

import java.util.Scanner;

public class H4_PineTree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pine tree height: ");
        String heightEntry = scanner.nextLine();
        int height = Integer.parseInt(heightEntry);

        for(int i = 1; i <= height; i++) {
            for(int j = height - i; j > 0; j--) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
