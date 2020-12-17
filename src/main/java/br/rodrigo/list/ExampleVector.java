package br.rodrigo.list;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class ExampleVector {
    public static void main(String[] args) {

        List<String> sports = new Vector<>();
        sports.addAll(Arrays.asList("Soccer", "Basketball", "Ping-pong", "Handball"));

        sports.forEach(sport -> System.out.println(sport));
    }
}
