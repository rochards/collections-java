package br.rodrigo.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleArrayList2 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Rodrigo");
        names.add("Hillary");
        names.add("John");
        names.add("Mary");
        names.add("Richard");

        System.out.println("Basic for:");
        for (var name : names) {
            System.out.println(name);
        }

        System.out.println("For each:");
        names.forEach(name -> System.out.println(name));

        Iterator<String> iter = names.iterator();
        System.out.println("Iterator: ");
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
