package br.rodrigo.set;

import java.util.TreeSet;

public class ExampleTreeSet {
    public static void main(String[] args) {

        TreeSet<String> treeCapitals = new TreeSet<>();
        treeCapitals.add("Porto Alegre");
        treeCapitals.add("Florianópolis");
        treeCapitals.add("Curitiba");
        treeCapitals.add("São Paulo");
        treeCapitals.add("Rio de Janeiro");
        treeCapitals.add("Belo Horizonte");

        System.out.println("It is not ordered as inserted: " + treeCapitals);

        System.out.println("First: " + treeCapitals.first());
        System.out.println("Last: " + treeCapitals.last());
        System.out.println("Lower to Florianópolis: " + treeCapitals.lower("Florianópolis"));
        System.out.println("Higher to Florianópolis: " + treeCapitals.higher("Florianópolis"));
        System.out.println("Remove first: " + treeCapitals.pollFirst());
        System.out.println("Remove last: " + treeCapitals.pollLast());

        System.out.println("New TreeSet: " + treeCapitals);
        treeCapitals.clear();
        System.out.println("New TreeSet: " + treeCapitals);
    }
}
