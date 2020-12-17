package br.rodrigo.set;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExampleLinkedHashSet {
    public static void main(String[] args) {

        Set<Integer> sequence = new LinkedHashSet<>();
        sequence.addAll(Arrays.asList(1, 2, 16, 8, 4, 5, 3, 9));

        System.out.println("Ordered as inserted:" + sequence);

        sequence.removeIf(n -> n % 2 != 0);
        System.out.println("Only even: " + sequence);
        System.out.println("It is empty?: " + sequence.isEmpty());
    }
}
