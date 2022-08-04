package org.example.data.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> listWithNames = new LinkedList<>();

        listWithNames.add("Piotrek");
        listWithNames.add("Krzysiek");

        List<String> otherListWithNames = new LinkedList<>();
        otherListWithNames.add("Marek");
        otherListWithNames.addAll(listWithNames);
        otherListWithNames.add("Marek");

        System.out.println(otherListWithNames.contains("Marek"));
        System.out.println(otherListWithNames.get(0));
        System.out.println(otherListWithNames.isEmpty());
        System.out.println(otherListWithNames.indexOf("Marek"));
        System.out.println(otherListWithNames.lastIndexOf("Marek"));

        System.out.println("----For Each--------");

        for (String str : otherListWithNames){
            System.out.println(str);
        }

        System.out.println("-----Iterators-------");
        //very old method - not used
        Iterator iterator = otherListWithNames.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("-----For i-------");
        for (int i = 0; i < otherListWithNames.size(); i++) {
            System.out.println(otherListWithNames.get(i));
        }

    }





}
