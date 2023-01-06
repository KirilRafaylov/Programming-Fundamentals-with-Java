package Lab;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lineInput = scanner.nextLine ();
        int [] numbersArr= Arrays
                .stream (lineInput.split (" "))
                .mapToInt (Integer::parseInt)
                .toArray ();
        int sum = 0;
        for (int i = 0; i < numbersArr.length ; i++) {
            int currentElement = numbersArr[i];
            if (currentElement % 2 == 0) {
                sum += currentElement;
            }
        }
        System.out.println (sum);
    }
}
