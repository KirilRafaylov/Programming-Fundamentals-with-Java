package Ex;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String text = scanner.nextLine ();

        printMiddleCharacters (text);
    }

    public static void printMiddleCharacters(String text) {
       if (text.length () % 2 == 1 ) {
          int indexOfMiddleCharacters = text.length () / 2;
           System.out.println (text.charAt (indexOfMiddleCharacters));
       } else {
           int firstMiddleIndex = text.length () / 2 - 1;
           int secondMiddleIndex= text.length () /2 ;
           System.out.println (text.charAt (firstMiddleIndex) + "" + text.charAt (secondMiddleIndex));
           // трябва да сложа "" между два char-a !!!

       }
    }
}
