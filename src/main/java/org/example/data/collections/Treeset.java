package org.example.data.collections;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Treeset {

    public static void main(String[] args) {


        //treeset jest soriowany i w porządku
        //nie ma również sensu pobierania elementów ze środka, tylko ewentualnie pierwszy i ostatni
        TreeSet<String> ts = new TreeSet<String>((s1, s2) -> { //Lambda i comparator

            int diff = s1.length() - s2.length();

            if (diff == 0) {
                return s1.compareTo(s2);
            } else {
                return diff;
            }

        });

        ts.add("one");
        ts.add("two");
        ts.add("hundred");
        ts.add("fifty");
        ts.add("sixty");
        ts.add("seventy");

        for (String t : ts) {
            System.out.println(t);
        }

        System.out.println("----------------------");

        TreeSet<Integer> myInts = new TreeSet<>();

        myInts.add(1);
        myInts.add(100);
        myInts.add(15);
        myInts.add(13);
        myInts.add(19);

        Integer floor = myInts.floor(18); // treeset posiada funkcje matematyczne które np znajdą najbliższą wartość w secie w dół lub w górę

        System.out.println("Floor: " + floor); // przy wartości 18 znajdzie najbliższą w dół 15
    }
}