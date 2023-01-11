package Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numberList = Arrays.stream (scanner.nextLine().split(" "))
                        .map(Integer :: parseInt).collect(Collectors.toList());
        String input = scanner.nextLine ();

        while (!input.equals ("end")) {
            List<String> commandLine = Arrays.stream (input.split (" "))
                    .collect(Collectors.toList());
            String command = commandLine.get (0);

            int item = 0;
            int index = 0;
            switch (command) {
                case "Add":
                    item = Integer.parseInt (commandLine.get (1));
                    numberList.add(item);
                    break;

                case "Remove":
                    item = Integer.parseInt (commandLine.get (1));
                    numberList.remove (Integer.valueOf (item));
                    break;

                case "RemoveAt":
                    index = Integer.parseInt (commandLine.get (1));
                    numberList.remove (index);
                    break;

                case "Insert":
                    item = Integer.parseInt (commandLine.get (1));
                    index = Integer.parseInt (commandLine.get (2));
                    numberList.add (index, item);
                    break;
            }

            input = scanner.nextLine ();
        }
        System.out.println (numberList.toString ().replaceAll ("[\\[\\],]", ""));

    }
}
