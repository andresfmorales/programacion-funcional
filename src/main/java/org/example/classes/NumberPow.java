package org.example.classes;

import java.util.function.Function;

public class NumberPow {

    public static void main(String[] args) {

        // Ejemplo de llamado a metodo para saber la potencia de un numero utilizando la clase Function
        System.out.println("La potencia de 3 es: " + pow.apply(3));
    }


    static Function<Integer, Integer> pow = new Function<Integer, Integer>() {
        @Override
        public Integer apply(Integer number) {
            return (int) Math.pow(number, number);
        }
    };

}
