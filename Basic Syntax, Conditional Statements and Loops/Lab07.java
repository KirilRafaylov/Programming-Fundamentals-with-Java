package Lab;

import java.util.Scanner;

public class Lab07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String typeOfDay = scanner.nextLine ();
        int age = Integer.parseInt (scanner.nextLine ());

        boolean isNotValid = false;
        int pricePerTicket = 0;

        if (age >= 0 && age <= 18) {
               if (typeOfDay.equals ("Weekday")) {
                   pricePerTicket = 12;
               } else if (typeOfDay.equals ("Weekend")) {
                   pricePerTicket = 15;
               } else if (typeOfDay.equals ("Holiday")) {
                   pricePerTicket = 5;
               }
        } else if (age > 18 && age <= 64) {
            if (typeOfDay.equals ("Weekday")) {
                pricePerTicket = 18;
            } else if (typeOfDay.equals ("Weekend")) {
                pricePerTicket = 20;
            } else if (typeOfDay.equals ("Holiday")) {
                pricePerTicket = 12;
            }
        } else if (age > 64 && age <= 122) {
            if (typeOfDay.equals ("Weekday")) {
                pricePerTicket = 12;
            } else if (typeOfDay.equals ("Weekend")) {
                pricePerTicket = 15;
            } else if (typeOfDay.equals ("Holiday")) {
                pricePerTicket = 10;
            }
        } else {
            isNotValid = true;
                    }
        if (isNotValid) {
            System.out.println ("Error!");
        } else {
            System.out.printf ("%d$", pricePerTicket);
        }
    }
}
