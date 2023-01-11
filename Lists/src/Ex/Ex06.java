package Ex;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstPlayerCards = Arrays.stream (scanner.nextLine().split(" "))
                        .map (Integer :: parseInt).collect(Collectors.toList());
        List<Integer> secondPlayerCards = Arrays.stream (scanner.nextLine().split(" "))
                .map (Integer :: parseInt).collect(Collectors.toList());



    }
}
