package Ex;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[] firstArr = new int[n];
        int[] secondArr = new int[n];

        for (int row = 1; row <= n ; row++) {
            String numbers = scanner.nextLine (); // "1 5"
            int firstNumber = Integer.parseInt (numbers.split ("") [0]);
            int secondNumber = Integer.parseInt (numbers.split (" ") [1]);
            if (row % 2 == 0) {
            firstArr[row - 1] = secondNumber;
            secondArr[row - 1] = firstNumber;
            } else {
            firstArr[row - 1] = firstNumber;
            secondArr[row - 1] = secondNumber;
            }
        }
        for ( int numbers : firstArr ) {
            System.out.print (numbers + " ");
        }
        System.out.println ();
        for (int numbers : secondArr) {
            System.out.print (numbers + " ");
        }
    }

}

