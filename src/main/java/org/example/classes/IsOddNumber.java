package org.example.classes;

import java.util.function.Predicate;

public class IsOddNumber {

    public static void main(String[] args) {

        // Ejemplo de validar si es numero par o impar utilizando predicate
        System.out.println("La potencia de 3 es: " + NumberPow.pow.apply(2) +
                " y es numero " + (isEvent.test(NumberPow.pow.apply(2)) ? "par" : "impar")
        );
    }

    static Predicate<Integer> isEvent = x -> x % 2 == 0;
}
