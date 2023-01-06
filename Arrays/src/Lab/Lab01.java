package Lab;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String [] dayOfWeek = new String [7];
//        dayOfWeek[0] = "Monday";

        String [] daysOfWeek = {
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday",
            "Sunday",
                    };
        int n = Integer.parseInt(scanner.nextLine());

        if (n>=1 && n<=7) {
            System.out.println (daysOfWeek [n-1]);
                    } else {
            System.out.println ("Invalid day!");
        }
    }
}
