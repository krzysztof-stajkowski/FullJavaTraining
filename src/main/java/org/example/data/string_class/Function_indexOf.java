package org.example.data.string_class;

public class Function_indexOf {
    public static void main(String args[]) {

        //wyszukuje pierwsze wystąpienie od począku i zwraca numer indeksu

        String str = "Raz dwa trzy cztery";

        int index = str.indexOf("dwa trzy");
        System.out.println("dwa trzy, index: " + index);

        //gdy nie znajdzie wzróci -1
        index = str.indexOf("pięć");
        System.out.println("pięć, index: " + index);

        index = str.indexOf("trzy", 6);
        System.out.println("trzy, index: " + index);

    }
}
