package Main;

import java.util.Scanner;

public class H7_Weekdays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide a number for a weekday");
        String userInput = scanner.nextLine();
        int weekDay = Integer.parseInt(userInput);
        String dayOfWeek = switch (weekDay) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };

        String weekDaySuffix = switch (weekDay) {
            case 1 -> "st";
            case 2 -> "nd";
            case 3 -> "rd";
            case 4, 5, 6, 7 -> "th";
            default -> "Invalid day";
        };
        if (weekDay <= 0 || weekDay > 7) {
            System.out.println("Incorrect value for a day of the week");
        } else {
            System.out.println(dayOfWeek + " is the " + weekDay + weekDaySuffix + " day of the week");
        }
    }
}
