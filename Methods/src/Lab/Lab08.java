package Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberInput = Double.parseDouble(scanner.nextLine());
        double powerInput = Double.parseDouble(scanner.nextLine());

        double result = mathPower (numberInput, powerInput);

        DecimalFormat df = new DecimalFormat ("0.####");
        System.out.println (df.format (result));
    }

    public static double mathPower(double num, double power) {
        double result = 1;
        for (int i = 1; i <= power ; i++) {
            result = result * num;
        }
        return result;
    }
}
