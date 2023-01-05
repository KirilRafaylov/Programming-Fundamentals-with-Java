package Lab;

import java.util.Scanner;

public class Lab04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int initHours = Integer.parseInt(scanner.nextLine());
        int initMin = Integer.parseInt(scanner.nextLine());

        int totalMin = (initHours * 60) + initMin + 30;
        int hours = totalMin / 60;
        int min = totalMin % 60;

        if (hours > 23) {
            hours = 0;
        }

        System.out.printf ("%d:%02d", hours, min);
    }
}
