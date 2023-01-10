package Ex;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startCode = Integer.parseInt(scanner.nextLine()); //60
        int endCode = Integer.parseInt(scanner.nextLine()); //65

        //всеки код от първия до последния
        for (int code = startCode; code <= endCode; code++) {
            char symbol = (char) code;
            System.out.print(symbol + " ");
        }
    }
}