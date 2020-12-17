package br.rodrigo.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {

        List<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Pedro", "Thayse", "Carla", "Marcelo", "Juliana", "Thiago", "Rafael"));

        System.out.println("Count: " + students.stream().count());
        System.out.println("Max length: " + students.stream().max(Comparator.comparingInt(String::length)));
        System.out.println("Has r?: " + students.stream().filter(student -> student.toLowerCase().contains("r")).collect(Collectors.toList()));
        System.out.println("Map: " + students.stream().map(student -> student.concat("-br")).collect(Collectors.toList()));
        System.out.println("First  3: " + students.stream().limit(3).collect(Collectors.toList()));
        System.out.println("-----");
//        System.out.println("Foreach:");
//        students.forEach(System.out::println);
        System.out.println("All has a?: " + students.stream().allMatch(student -> student.contains("a")));
        System.out.println("Any match a?: " + students.stream().anyMatch(student -> student.contains("a")));

        System.out.print("First if it's present: ");
        students.stream().findFirst().ifPresent(System.out::println);

        System.out.println("Encadeando chamadas:");
        System.out.println(students.stream()
                .filter(student -> student.contains("r"))
                .map(student -> student.concat("-br"))
                .collect(Collectors.toList()));
    }
}
