package Lab;

import java.util.Scanner;

public class Lab13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 1;
        for (int i = 0; i <= n ; i++ ) {
            if (i % 2 !=0 ) {
                System.out.println (2*i + 1);
                sum += 2*i;
            }
        }
        System.out.printf ("Sum: %d%n", sum);
    }
}
