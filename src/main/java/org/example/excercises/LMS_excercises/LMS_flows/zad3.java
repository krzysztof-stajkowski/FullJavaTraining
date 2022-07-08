package org.example.excercises.LMS_excercises.LMS_flows;

/*
Zadanie 3

    W pliku Main03.java stwórz pętlę, która 3 razy wypisze w konsoli tekst Java.
    Napisz zarówno pętlę for jak i while.
    W sumie napis będzie widoczny 6 razy.

 */

public class zad3 {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.println("Java");
        }

        System.out.println("----------");

        int j = 0;
        while (j < 3) {
            System.out.println("Java while");

            j++;
        }
    }
}
