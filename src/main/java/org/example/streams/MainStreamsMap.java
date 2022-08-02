package org.example.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainStreamsMap {
    public static void main(String[] args) {

        //find 3 first numbers less than 10
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        numbers.add(8);
        numbers.add(11);
        numbers.add(13);
        numbers.add(22);
        numbers.add(25);


        List<Integer> collect =
                numbers.stream()
                        .limit(5) // wyświetlam max 5 elementów z listy mimo że w zakres wchodzi więcej
                        .filter(n -> n < 15) // chcę wyświetlić tylko te mniejsze niż 15
                        .collect(Collectors.toList()); //wgrywam wynik do listy

        collect.forEach(System.out::println);

        System.out.println("------");

        for (Integer c : collect) {
            System.out.println(c);
        }

    }
}
