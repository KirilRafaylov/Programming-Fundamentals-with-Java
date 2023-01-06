package Lab;
import java.util.Arrays;
import java.util.Scanner;
public class Lab05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = Arrays
                .stream (scanner.nextLine ().split(" "))
                .mapToInt (Integer::parseInt)
                .toArray ();
        int evenSum = 0;
        int oddSum = 0;
          for (int item: numbersArr)
          /*  for (int i = 0; i < numbersArr.length; i++) {
           //     int item = numbersArr[i];
            } */
            if (item % 2 ==0) {
                evenSum += item;
            } else {
                oddSum += item;
            }
        System.out.println (evenSum - oddSum);
    }
}
