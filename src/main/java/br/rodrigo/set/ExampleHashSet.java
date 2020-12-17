package br.rodrigo.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ExampleHashSet {
    public static void main(String[] args) {

        Set<Double> grades = new HashSet<>();
        grades.addAll(Arrays.asList(5.8, 9.3, 6.5, 10.0, 5.4, 7.3, 3.8, 4.0));

        System.out.println("Grades are in different positions: " + grades);
        System.out.println("Size:" + grades.size());

        grades.removeIf(grade -> grade < 7);
        System.out.println("New set: " + grades);

        grades.clear();
        System.out.println("It it empty?: " + grades.isEmpty());
    }
}
