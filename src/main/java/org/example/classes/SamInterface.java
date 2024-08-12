package org.example.classes;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.function.BiFunction;

public class SamInterface {


    public static void main(String[] args) {

        Person<String, Integer, LocalDate> personMessage =
                (name,age,birthday) -> new String("La fecha de nacimiento de ") + name +
                        divisionOperator.apply((int) ChronoUnit.YEARS.between(birthday, LocalDate.now()), age) + new String(" a la edad ingresada") ;

        // Ejemplo de operacion de dos BigDecimal con BunaryOperator con calculo  utilizando Bifunction
        System.out.println(personMessage.apply("Andres", 27, LocalDate.of( 1996, 8, 13)));

    }

    @FunctionalInterface
    interface Person<Name, Age, Birthday> {
        String apply (String Name, Integer Age, LocalDate Birthday);
    }

    static BiFunction<Integer, Integer, String> divisionOperator = (x, y) ->  x.equals(y)  ? " corresponde " : " no corresponde ";


}
