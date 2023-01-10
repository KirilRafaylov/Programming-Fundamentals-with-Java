package Lab;

import java.util.Scanner;

public class Lab11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        System.out.printf ("Length: ", length);
        double width = Double.parseDouble(scanner.nextLine());
        System.out.printf ("Width: ", width);
        double height = Double.parseDouble(scanner.nextLine());
        System.out.printf ("Height: ", height);

        double volume = ( length * width * height ) / 3 ;

        System.out.printf ("Pyramid Volume: %.2f", volume);


//        double dul, sh, V = 0;
//        System.out.print("Length: ");
//        dul = Double.parseDouble(scanner.nextLine());
//        System.out.print("Width: ");
//        sh = Double.parseDouble(scanner.nextLine());
//        System.out.print("Height: ");
//        V = Double.parseDouble(scanner.nextLine());
//        V = (dul * sh * V) / 3;
//        System.out.printf("Pyramid Volume: %.2f", V);


    }
}
