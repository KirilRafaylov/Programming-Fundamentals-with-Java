package Lab;

import java.util.*;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countProducts = Integer.parseInt(scanner.nextLine());
        List<String> productList = new ArrayList<> ();

        for (int i = 0; i < countProducts; i++) {
            String product = scanner.nextLine ();

            productList.add(product);

        }
        Collections.sort (productList);
    //    Collections.reverse (productList);
        for (int i = 0; i <= productList.size () - 1; i++) {
            System.out.printf ("%d.%s%n", i+1, productList.get (i));
        }

    }
}
