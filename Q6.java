// Using java 8 date/time api: 1. WAP to get two dates from user and print if the first date occurs bfore or after the second date supplied by the user. 2. WAP to print current date and time in 3 different time zones.

import java.time.LocalDate;
import java.util.Scanner;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public class FlatMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first date (yyyy-mm-dd): ");
        String date1Str = scanner.nextLine();
        LocalDate date1 = LocalDate.parse(date1Str);

        System.out.println("Enter second date (yyyy-mm-dd): ");
        String date2Str = scanner.nextLine();
        LocalDate date2 = LocalDate.parse(date2Str);

        if (date1.isBefore(date2)) {
            System.out.println("First date occurs before second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("First date occurs after second date.");
        } else {
            System.out.println("Both dates are the same.");
        }


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime usTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime japanTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

        System.out.println("India Time: " + indiaTime.format(formatter));
        System.out.println("US (New York) Time: " + usTime.format(formatter));
        System.out.println("Japan Time: " + japanTime.format(formatter));
    }
}
