package Ex;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstRow = scanner.nextLine ();
        String secondRow = scanner.nextLine ();

        String [] firstArray = firstRow.split(" ");
        String [] secondArray = secondRow.split(" ");

        for (String secondElement : secondArray) {
            for ( String firstElement  : firstArray) {
                if (firstElement.equals(secondElement)) {
                    System.out.print (firstElement + " ");
                }
            }
        }
    }
}
