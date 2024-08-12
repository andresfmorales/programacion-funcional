package org.example.classes;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class DatesOperator {

    public static void main(String[] args) {

        List<LocalDate> dateList  = getList(
                LocalDate.of(2024, 8, 10),
                LocalDate.of(2024, 8, 11),
                LocalDate.of(2024, 8, 12)
        );

        // Ejemplo de imprimir fechas con operador de referencia
        dateList.forEach(DatesOperator :: printFormattedDate );

    }

    // Metodo que crea el mensaje a mostrar
    public static void printFormattedDate(LocalDate date) {
        String message = String.format("La fecha es %d de %s del %d.",
                date.getDayOfMonth(),
                date.getMonth().toString(),
                date.getYear());
        System.out.println(message);
    }

    static <T> List<T> getList (T... elements){
        return Arrays.asList(elements);
    }
}
