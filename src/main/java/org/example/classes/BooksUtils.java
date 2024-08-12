package org.example.classes;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class BooksUtils {



    static List<Book> generateBooks(){
        Supplier<List<Book>> bookSupplier = () -> Arrays.asList(
                new Book("Book One","Pepito", 7.3),
                new Book("Book Two","Juanito", 6.9),
                new Book("Book Three","Andres", 6.1),
                new Book("Book Four","Felipe", 9.1)
        );

        return bookSupplier.get();
    }

    static void isRecommendedBook( ){
        Consumer<Book> consumerHelper = book ->{
            if(isRecomended.test(book)){
                System.out.println("El libro " + book.getName() + " es recomendado");
            }
        };
        generateBooks().forEach(book -> consumerHelper.accept(book));
    }

    public static void main(String[] args) {
        // Ejemplo de lista de libros creada utilizando Supplier
        System.out.println("Lista de libros: " + generateBooks().toString());

        System.out.println("--------------------------------------------");

        // Ejemplo que determina que libros tienen un puntaje mayor o igual a 7 y es recomendado
        isRecommendedBook();


        System.out.println("--------------------------------------------");

        // Ejemplo mostrando por consola un menjsaje  utilizando UnaryOperator
        System.out.println(recommendBook.apply(generateBooks().get(0).getName()));
    }

    static Predicate<Book> isRecomended = x -> x.getScore() >= 7.0;
    static UnaryOperator<String> recommendBook = bookName -> "El libro " + bookName + " es recomendado";

}

