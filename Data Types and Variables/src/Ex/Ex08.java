package Ex;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()); //брой на кеговете
        //за всеки кег: модел, радиус, височина

        double maxVolume = Double.MIN_VALUE; //най-големия обем
        String maxModel = ""; //моделът на най-големия

        for (int keg = 1; keg <= n; keg++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            //обем на кега = π * r^2 * h
            double volume = Math.PI * Math.pow(radius, 2) * height;

            //проверка дали е най-голям
            if (volume > maxVolume) {
                //текущия кег е най-голям
                maxVolume = volume;
                maxModel = model;
            }
        }

        System.out.println(maxModel);
    }
}