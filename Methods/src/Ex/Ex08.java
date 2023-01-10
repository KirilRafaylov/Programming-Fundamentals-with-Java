package Ex;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        long fact1 = calculateFactoriel (num1);
        long fact2 = calculateFactoriel (num2);
        double result = fact1 * 1.0 / fact2;
        System.out.printf ("%.2f", result);

            }
            private static long calculateFactoriel(int number) {
              long fact = 1;
                for (int i = 1; i <= number ; i++) {
                    fact = fact * i;
                }
                return fact;
            }
}
