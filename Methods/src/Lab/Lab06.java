package Lab;

import java.util.Scanner;

public class Lab06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double widthInput = Double.parseDouble (scanner.nextLine ());
        double lengthInput = Double.parseDouble (scanner.nextLine ());
        double area = calculateRectangularArea (widthInput, lengthInput);
        System.out.printf ("%.0f",area);

    }

    public static double calculateRectangularArea(double width, double length) {
       return width * length;
    }
}

