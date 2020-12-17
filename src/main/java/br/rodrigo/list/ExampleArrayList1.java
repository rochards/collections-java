package br.rodrigo.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ExampleArrayList1 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Rodrigo");
        names.add("Hillary");
        names.add("John");
        names.add("Mary");
        names.add("Richard");

        System.out.println("Original: " + names);

        Collections.sort(names);
        System.out.println("Sorted: " + names);

        names.set(2, "New random name"); // it updates a value on a specific position
        System.out.println("New name: " + names);

        names.remove(0);
        System.out.println("Remove by position: " + names);
        names.remove("Rodrigo");
        System.out.println("Remove by object: " + names);

        System.out.println("From position 0: " + names.get(0));

        System.out.println("List length: " + names.size());

        System.out.println("Is there a John?: " + names.contains("John"));
        System.out.println("Index of John: " + names.indexOf("John"));

        System.out.println("Is it empty?: " + names.isEmpty());

        names.clear();
        System.out.println("After clear. Is it empty?: " + names.isEmpty());
    }
}
