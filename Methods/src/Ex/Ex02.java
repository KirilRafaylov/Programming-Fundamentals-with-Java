package Ex;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textInput = scanner.nextLine ().toLowerCase ();
        printVowelsCount (textInput);
    }
    public static void printVowelsCount(String text) {
       int count = 0;
        for (char symbol: text.toCharArray ()) {
            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o'
            || symbol== 'u') {
            count++;
            }
                    }
        System.out.println (count);
    }

}
