package org.example.streams;

import org.example.data.string_class.BlankStringAndNull;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WorkingWithStreams {
    void streams() {
        List<String> names = List.of("Jacek", "Łukasz", "Michał"); // zwykła lista
        Stream<String> stream = names.stream(); //mogę moją listę wgrać jako stream w ten sposób LUB
        Stream<String> namesStream = Stream.of("Jacek", "Łukasz", "Michał"); //tak bezpośrednio

        // stream. i po kropce mam masę opcji do transformacji
        //poniżej jest niepraktyczny przykład jak to działa (dzięki ALT+Enter zrobiliśmy lokalną zmienną List<Object> )
        List<Object> collect =
                stream.limit(2) //intermediate operator
                        .map(null)//intermediate operator
                        .sorted(null)//intermediate operator
                        .dropWhile(null)//intermediate operator
                        .collect(Collectors.toList()); //terminal operator


        //Stream z tablicy - przykład
        Stream[] tab = {}; //pusta dla przykładu
        Arrays.stream(tab);

    }
}
