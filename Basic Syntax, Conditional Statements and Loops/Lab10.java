package Lab;

import java.util.Scanner;

public class Lab10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= 10 ; i++) {
            int product = n * i ;
            System.out.printf ("%d X %d = %d%n", n, i, product);
        }
    }
}
