package Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab05 {
    static class Student {
        String firstName;
        String secondName;
        String age;
        String town;

        public Student (String firstName, String secondName, String age, String town) {
            this.firstName=firstName;
            this.secondName=secondName;
            this.age=age;
            this.town=town;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getSecondName() {
            return this.secondName;
        }

        public String getAge() {
            return this.age;
        }

        public String getTown() {
            return this.town;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<> ();
        String input = scanner.nextLine ();
        while (!input.equals ("end")) {
            String[] inputStudentArr = input.split (" ");
            String firstName = inputStudentArr[0];
            String secondName = inputStudentArr[1];
            String age = inputStudentArr[2];
            String town = inputStudentArr[3];

            Student currentStudent = new Student (firstName, secondName, age, town);
            studentList.add (currentStudent);
            
            input = scanner.nextLine ();
        }
        String searchTown = scanner.nextLine ();

        for (Student item : studentList) {
            if (item.getTown ().equals (searchTown)) {
                System.out.printf ("%s %s is %s years old%n",
                        item.getFirstName (),
                        item.getSecondName (),
                        item.getAge ());
            }
        }
    }
}
