package Lab;

import java.util.Scanner;

public class Lab12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int num = Integer.parseInt (scanner.nextLine ());

        while (true) {
            if (num % 2 == 0) {
                System.out.printf ("The number is: %d", Math.abs (num));
                break;
            } else {
                System.out.println ("Please write an even number.");
                num = Integer.parseInt (scanner.nextLine ());
            }
        }
    }
}
