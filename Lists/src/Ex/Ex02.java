package Ex;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine() //"1 2 3 4 5 5 5 6"
                        .split(" ")) //["1", "2", "3", "4", "5", "5", "5", "6"]
                .map(Integer::parseInt) //[1, 2, 3, 4, 5, 5, 5, 6]
                .collect(Collectors.toList()); //{1, 2, 3, 4, 5, 5, 5, 6}

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            //1. "Delete 3".split(" ") -> ["Delete", "3"]
            //2. "Insert 5 0".split(" ") -> ["Insert", "5", "0"]
            String commandName = command.split(" ")[0];
            int element = Integer.parseInt(command.split(" ")[1]);

            if (commandName.equals("Delete")) {
                numbers.removeAll(Arrays.asList(element));
            } else if (commandName.equals("Insert")) {
                int position = Integer.parseInt(command.split(" ")[2]);
                numbers.add(position, element);
            }
            command = scanner.nextLine();
        }
        //{3, 4, 5, 6}
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}

