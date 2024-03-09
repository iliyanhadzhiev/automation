package Main;

import java.util.Scanner;

public class H9_PurchaseDiscount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input unit price: ");
        String userInput1 = scanner.nextLine();
        double unitPrice = Double.parseDouble(userInput1);

        System.out.println("Input the purchase quantity: ");
        String userInput2 = scanner.nextLine();
        double orderQuantity = Double.parseDouble(userInput2);

        double orderDiscountRate = 1;
        double orderPrice = unitPrice * orderQuantity;
        double orderRevenue = 0;
        double orderDiscount = 0;

        if (unitPrice <= 0 || orderQuantity <= 0) {
            System.out.println("Unit price and ordered quantity should be a positive number");
        } else if (orderQuantity < 100) {
            orderRevenue = orderPrice * orderDiscountRate;
        } else if (orderQuantity < 120) {
            orderDiscountRate = 0.85;
            orderRevenue = orderPrice * orderDiscountRate;
            orderDiscount = orderPrice * 0.15;
        } else {
            orderDiscountRate = 0.80;
            orderRevenue = orderPrice * orderDiscountRate;
            orderDiscount = orderPrice * 0.20;
        }
        System.out.println("The revenue from sale: " + orderRevenue);
        System.out.println("Discount: " + orderDiscount);
    }
}
