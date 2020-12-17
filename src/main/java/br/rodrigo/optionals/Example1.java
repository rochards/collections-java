package br.rodrigo.optionals;

import javax.swing.text.html.Option;
import java.util.Optional;

public class Example1 {
    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of("Valor presente");
        // o valor presente é passado como argumento para o primeio parâmetro chamando o método
        // dessa forma
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Não está " +
                "presente"));

        Optional<String> optionalNull = Optional.ofNullable(null);
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null == Não " +
                "está presente"));

        Optional<String> optionalEmpty = Optional.empty();
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("empty == Não " +
                "está presente"));

//        Optional<String> optionalNullError = Optional.of(null); isso retorna uma exception
//        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("erro == Não
//        está presente"));

    }
}
