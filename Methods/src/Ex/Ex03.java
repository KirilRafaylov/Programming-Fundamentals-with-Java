package Ex;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol1 = scanner.nextLine().charAt(0);
        char symbol2 = scanner.nextLine().charAt(0);
        //метод, който отпечатва ред с всички символи от по-малкия (< аски код)
        printSequenceOfChars(symbol1, symbol2);
    }

    private static void printSequenceOfChars(char symbol1, char symbol2) {
        //проверка от кой символ да започнем
        if (symbol1 < symbol2) {
            //започваме от symbol1 до symbol2
            //a до d -> b c
            for (char symbol = (char)(symbol1 + 1); symbol < symbol2; symbol++) {
                System.out.print(symbol + " ");
            }
        } else { //symbol1 >= symbol2
            //започваме от symbol2
            for (char symbol = (char)(symbol2 + 1); symbol < symbol1; symbol++) {
                System.out.print(symbol + " ");
            }
        }
    }
}