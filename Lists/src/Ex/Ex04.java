package Ex;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine() //"1 23 29 18 43 21 20"
                        .split(" ")) // ["1", "23", "29", "18", "43", "21", "20"]
                .map(Integer::parseInt)// [1, 23, 29, 18, 43, 21, 20]
                .collect(Collectors.toList()); // {1, 23, 29, 18, 43, 21, 20}

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            if (command.contains("Add")) {
                //command = "Add 4".split(" ") -> ["Add", "4"]
                int numberToAdd = Integer.parseInt(command.split(" ")[1]);
                numbers.add(numberToAdd);

            } else if (command.contains("Insert")) {
                //command = "Insert 4 0".split(" ") -> ["Insert", "4", "0"]
                int numberToInsert = Integer.parseInt(command.split(" ")[1]);
                int index = Integer.parseInt(command.split(" ")[2]);
                //проверка за индекса
                if (isIndexValid(index, numbers.size())) {
                    //валиден (0 до дълж - 1) -> добавяме елемента на дадения индекс
                    numbers.add(index, numberToInsert);
                } else {
                    //невалиден -> "Invalid index"
                    System.out.println("Invalid index");
                }

            } else if (command.contains("Remove")) {
                //command = "Remove 1".split(" ") -> ["Remove", "1"]
                int indexToRemove = Integer.parseInt(command.split(" ")[1]);
                //проверка за индекса
                if (isIndexValid(indexToRemove, numbers.size())) {
                    //валиден -> премахваме елемента на дадения индекс
                    numbers.remove(indexToRemove);
                } else {
                    //невалиден -> "Invalid index"
                    System.out.println("Invalid index");
                }

            } else if (command.contains("Shift left")) {
                //command = "Shift left 2".split(" ") -> ["Shift", "left", "2"]
                int countLeft = Integer.parseInt(command.split(" ")[2]);
                //поватаряме countLeft на брой пъти
                for (int time = 1; time <= countLeft; time++) {
                    //first number becomes last
                    //{3, 4, 6, 7, 1}
                    //firstNumber = 3 -> index на lastNumber (дължина - 1)
                    int firstNumber = numbers.get(0);
                    numbers.add(firstNumber); //{3, 4, 6, 7, 1, 3}
                    numbers.remove(0); //{3, 4, 6, 7, 1, 3}
                }
            } else if (command.contains("Shift right")) {
                //command = "Shift right 3".split(" ") -> ["Shift", "right", "3"]
                int countRight = Integer.parseInt(command.split(" ")[2]);
                //поватаряме countRight на брой пъти
                for (int time = 1; time <= countRight; time++) {
                    //last number becomes first
                    //{3, 4, 6, 7, 1}
                    //lastNumber = 1 -> index = 0
                    int lastNumber = numbers.get(numbers.size() - 1); //1
                    numbers.add(0, lastNumber); //{1, 3, 4, 6, 7, 1}
                    numbers.remove(numbers.size() - 1); //{1, 3, 4, 6, 7}
                }
            }
            command = scanner.nextLine();
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
    //метод, който валидира индекса
    //true -> валиден индекс
    //false -> невалиден индекс
    public static boolean isIndexValid (int index, int sizeOfList) {
        //[0 до последния]
        return index >= 0 && index <= sizeOfList - 1;
    }
}