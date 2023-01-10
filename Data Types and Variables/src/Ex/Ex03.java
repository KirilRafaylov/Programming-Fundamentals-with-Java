package Ex;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

//        int fullCourses = people / capacity ;
//        int partCourses = people % capacity;
//        int totalCourses = fullCourses + partCourses;
//        if (partCourses !=0) {
//
//        }
        double courses = Math.ceil (people * 1.0 / capacity);
        System.out.printf ("%.0f", courses);
    }
}
