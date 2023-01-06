package Lab;
import java.util.Arrays;
import java.util.Scanner;
public class Lab07OtKolega {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      int [] numbersArr = Arrays
              .stream (scanner.nextLine ().split (" "))
              .mapToInt (Integer :: parseInt)
              .toArray ();
////         int [] condensedArr = new int [numbersArr[numbersArr.length-1]] ;
//           int sum = 0;
//        for (int i = 0; i < numbersArr.length; i++) {
//
//            sum += numbersArr[i];
//            sum = numbersArr[i] + numbersArr[i+1];
//
////            for (int j = 0; j < condensedArr.length -1; j++) {
////                sum += condensedArr[i];
//            }
//            System.out.println (sum);

        while (numbersArr.length > 1) {
            int[] condesedArr = new int[numbersArr.length -1];
            for (int j = 0; j < numbersArr.length-1; j++) {
                condesedArr[j] = numbersArr[j] + numbersArr[j +1];
            }
            numbersArr = condesedArr;
        }
        System.out.println(numbersArr[0]);
        }
    }

