package Ex;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> distances = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        //повтаряме:
        //спираме: разстоянията свършат
        //продължаваме: имаме разстояния между покемоните
        int sumRemoved = 0; //сума на премахнати елементи
        while (distances.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());
            //< 0
            if (index < 0) {
                //{4, 5, 3}
                int firstElement = distances.get(0); //4 - премахнат
                sumRemoved += firstElement;
                int lastElement = distances.get(distances.size() - 1); // 3
                distances.set(0, lastElement); //{3, 5, 3}
                //модификация на списъка
                modifyList(distances, firstElement);
            }
            // > последния
            else if (index > distances.size() - 1) {
                //{4, 5, 3}
                int firstElement = distances.get(0); //4
                int lastElement = distances.get(distances.size() - 1); // 3 - премахнат
                sumRemoved += lastElement;
                distances.set(distances.size() - 1, firstElement); //{3, 5, 4}
                //модификация на списъка
                modifyList(distances, lastElement);
            }
            // между 0 и последния
            else if (index >= 0 && index <= distances.size() - 1) {
                int removedElement = distances.get(index);
                sumRemoved += removedElement;
                distances.remove(index);
                //модификация на списъка
                modifyList(distances, removedElement);
            }
        }

        System.out.println(sumRemoved);
    }

    public static void modifyList(List<Integer> list, int removedElement) {
        for (int index = 0; index <= list.size() - 1 ; index++) {
            int currentElement = list.get(index);
            if (currentElement <= removedElement) {
                currentElement += removedElement;
            } else {
                currentElement -= removedElement;
            }
            //замествам старата стойност на елемента с променената
            list.set(index, currentElement);
        }
    }
}