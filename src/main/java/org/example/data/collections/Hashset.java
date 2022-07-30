package org.example.data.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class Hashset {

    public static void main(String[] args) {

        ArrayList<String> myStrings = new ArrayList<>();
        myStrings.add("one");
        myStrings.add("ten");
        myStrings.add("twenty");
        myStrings.add("fourty");
        myStrings.add("fourty"); //duplikaty nie będą dodane
        myStrings.add("fifty");

        //hashset nie ma porządku i wyświetlą się losowo
        //nie ma również sensu pobierania elementów ze środka - tylko ewentualnie pierwszy i ostatni
        HashSet<String> hs = new HashSet<>(myStrings);

        for (String h : hs) {
            System.out.println(h);
        }

    }
}
