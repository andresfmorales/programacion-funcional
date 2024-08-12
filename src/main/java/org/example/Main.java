package org.example;

import org.example.classes.InmutableObj;
import org.example.classes.MutableObj;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /* Ejemplo de creacion de un objeto mutable el cual se crea de una manera y en el transcurso de la ejecucion del
          bloque de codigo dos de sus propiedades cambian
        */
        ArrayList<String> hobbies = new ArrayList<>();
        MutableObj mutableObj = new MutableObj("Andres", "Morales", hobbies);
        System.out.println("Mutable Obj: " + mutableObj);
        mutableObj.setLastName("Tabares");
        hobbies.add("Drive");
        mutableObj.setHobbies(hobbies);
        System.out.println("Modify Mutable Obj: " + mutableObj);


        System.out.println("--------------------------------------------");


        /* Ejemplo de creacion de un objeto mutable el cual se crea de una manera y en el transcurso de la ejecucion del
          bloque de codigo dos de sus propiedades cambian
        */
        ArrayList<String> grandparentsNames = new ArrayList<>();
        grandparentsNames.add("Grandpa");
        grandparentsNames.add("Grandama");
        InmutableObj inmutableObj = new InmutableObj(1,"Andres", 13081996, grandparentsNames );
        System.out.println("inmutableObj: " + inmutableObj);
        // Desde la creacion de los objetos final en la clase inmutable no se permite crear los metodos setter que modifiquen propiedad

    }
}
