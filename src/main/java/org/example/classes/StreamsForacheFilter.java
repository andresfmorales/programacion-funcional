package org.example.classes;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsForacheFilter {


    public static void main(String[] args) {

        List<String> namesList  = DatesOperator.getList("Andres","Pedro","Pablo", "Jose", "Daniel");

        System.out.println("------------------Lista de nombres que coinciden con filter--------------------------");
        List<String> filterNameList  = getAndresList(namesList, "Andres");
        filterNameList.forEach(System.out::println);

        System.out.println("------------------Lista de nombres que coinciden con stream--------------------------");
        Stream<String> filtredNameLStream = getAndresStreamList(namesList.stream(), "Andres");
        filtredNameLStream.forEach(System.out::println);

        System.out.println("------------------Optional de lista de nombres que coinciden--------------------------");
        Optional<List<String>> optionalNames = getOptionalNames(filterNameList);
        optionalNames.ifPresent(name -> name.forEach(System.out::println));
    }

    static List<String> getAndresList(List<String> names, String nameToFilter){
        return names.stream()
                .filter(name -> name.equals(nameToFilter)).collect(Collectors.toList());
    }

    static Stream<String> getAndresStreamList(Stream<String> names, String nameToFilter){
        return  names.filter(name -> name.contains(nameToFilter));
    }

    static Optional<List<String>> getOptionalNames(List<String>  names){
        return Optional.of(names);
    }

}
