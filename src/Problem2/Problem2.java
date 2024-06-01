package Problem2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your first name: ");
        String firstName = scanner.nextLine();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please, enter your last name: ");
        String lastName = scanner1.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please, enter your birth day in the format-(yyyy-mm-dd)-Example 1989-4-14: ");
        String dob = scanner2.nextLine();
        LocalDate localDate = LocalDate.parse(dob, DateTimeFormatter.ISO_LOCAL_DATE);

        HeartRates hr = new HeartRates(firstName, lastName, localDate);
        hr.calTargetHeartRange();
        System.out.println(hr.toString());
    }
}