package Ex;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] firstArray = new int[n];
        int[] secondArray = new int[n];

        for (int row = 1; row <= n ; row++) {
            String numbers = scanner.nextLine ();
            int firstNumber = Integer.parseInt (numbers.split(" ")[0]);
            int secondNumber = Integer.parseInt (numbers.split(" ")[1]);

            if (row % 2 ==0) {
//          четен ред => първото число /втори масив/; второто число /първи масив/
                firstArray[row - 1] = secondNumber;
                secondArray[row - 1] = firstNumber;

            } else {
//            нечетен ред => първото число / първи масив/; второто число/втори масив/
                firstArray[row - 1] = firstNumber;
                secondArray[row - 1] = secondNumber;
            }
        }
        for (int number : firstArray) {
            System.out.print (number + " ");
        }
        System.out.println ();
        for (int number : secondArray) {
            System.out.print (number + " ");
        }
    }
}
