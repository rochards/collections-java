package br.rodrigo.queue;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ExampleLinkedList {
    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();
        filaBanco.addAll(Arrays.asList("Patrícia", "Roberto", "Flávio", "Pâmela", "Anderson"));

        System.out.println("Original: " + filaBanco);
        System.out.println("Next: " + filaBanco.poll()); // remove and retrieve the next element
        System.out.println("Modified: " + filaBanco);
        System.out.println("Next:" + filaBanco.peek()); // don't remove the next element
        System.out.println("No modified: " + filaBanco);
        System.out.println("Next:" + filaBanco.element()); //don't remove the next. Throw exception if it's empty

        System.out.println("Each element: ");
        filaBanco.forEach(client -> System.out.println(client));

        System.out.println("Is it empty?: " + filaBanco.isEmpty());
        System.out.println("Is there a Roberto?: " + filaBanco.contains("Roberto"));

//        Collections.sort(filaBanco);
    }
}
