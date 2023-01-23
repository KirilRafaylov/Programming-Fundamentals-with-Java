package Lab;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {

    static class Student {
        int facultyNumber;
        String name;
        int age;

        public Student(int facultyNumber, String name, int age) {
            this.facultyNumber = facultyNumber;
            this.name = name;
            this.age = age;
        }

        public int getFacultyNumber() {
            return facultyNumber;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student> ();
        students.add (new Student (123455, "Kiro", 33));

        new Student (123455, "Kiro", 33);
        new Student (1234567, "Petko", 34);
    }
}
