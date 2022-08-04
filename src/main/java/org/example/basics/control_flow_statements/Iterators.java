package org.example.basics.control_flow_statements;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterators {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            String string = it.next();
            System.out.println(string);
        }

        while (it.hasNext()) {
            String string = it.next();
            System.out.println(string);
        }
        System.out.println("---------");

    }
}
