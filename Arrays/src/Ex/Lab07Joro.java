package Ex;

import java.util.Arrays;
import java.util.Scanner;

public class Lab07Joro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream (scanner.nextLine ().split (" "))
                .mapToInt (Integer :: parseInt)
                .toArray ();
        for (int repetitions = 0; repetitions < numbers.length -1; repetitions++) {
            for (int i = 0; i < numbers.length - 1; i++) {
                 numbers [i] = numbers[i] + numbers[i+1];
            }
            
        }
        System.out.println (numbers[0]);
    }
}
