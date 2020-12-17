package br.rodrigo.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExampleStudent {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Pedro", 19));
        students.add(new Student("Carlos", 23));
        students.add(new Student("Mariana", 21));
        students.add(new Student("João", 18));
        students.add(new Student("Thiago", 20));
        students.add(new Student("George", 22));
        students.add(new Student("Larissa", 21));

        System.out.println("As inserted: " + students);

        students.sort(Comparator.comparingInt(Student::getAge));
        System.out.println("Sorted: " + students);

        Collections.sort(students); // posso passar pq students extends comparable
        System.out.println("Sorted: " + students);

        Collections.sort(students, new StudentComparator());
        System.out.println("Sorted: " + students);
    }
}
