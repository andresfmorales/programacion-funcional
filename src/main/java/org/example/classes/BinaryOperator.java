package org.example.classes;

import java.math.BigDecimal;
import java.util.function.BiFunction;

public class BinaryOperator {

    public static void main(String[] args) {

        BigDecimal dividend = new BigDecimal("10.00");
        BigDecimal divisor = new BigDecimal("4.00");

        // Ejemplo de operacion de dos BigDecimal con BunaryOperator
        System.out.println("Resultado de la división es: " + divisionOperator.apply(dividend, divisor));

    }

    static  BiFunction<BigDecimal, BigDecimal, BigDecimal> divisionOperator = (x, y) -> x.divide(y) ;
}
