package homework6.task2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter date in yyyy-MM-dd format:");
            String input = scanner.nextLine();
            LocalDate testDate = LocalDate.parse(input);
            if (testDate.isBefore(LocalDate.now().minusDays(365))) {
                int counter = LocalDate.now().getYear() - LocalDate.parse(input).getYear();
                for (int i = 0; i < counter; i++) {
                    System.out.println(testDate.plusYears((long) i) + " " + testDate.plusYears((long) i).getDayOfWeek());
                }
            }
        }
    }
}
