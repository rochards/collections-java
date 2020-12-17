package br.rodrigo.optionals;

import java.util.Optional;

public class Example3 {
    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of("Laranja");

        System.out.println("Is present?: " + optionalString.isPresent());
        System.out.println("Is empty?: " + optionalString.isEmpty());

        if (optionalString.isPresent()) {
            String value = optionalString.get();
            System.out.println(value);
        }

        optionalString.map(valor -> valor.concat(" ***")).ifPresentOrElse(System.out::println,
                () -> System.out.println("Nothing!"));
    }
}
