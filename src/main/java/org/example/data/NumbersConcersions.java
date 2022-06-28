package org.example.data;

public class NumbersConcersions {
    public static void main(String[] args) {
        //konwersja jawna - zawężająca
        int i = 5;
        double d = 20.0d / (double) i;    //konwersja jawna - zawężająca
        System.out.println(d);

        int a = 4;
        double b = 10.0d * a;  //konwersja niejawna - rozszerzająca
        System.out.println(b);

        //przy konwersji double do int traci się część dziesiętną

    }
}
