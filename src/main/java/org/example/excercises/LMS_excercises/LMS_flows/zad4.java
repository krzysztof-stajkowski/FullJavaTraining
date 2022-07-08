package org.example.excercises.LMS_excercises.LMS_flows;

/*
Zadanie 4

    W pliku Main04.java stwórz pętlę, która wypisze w konsoli,
    w jednej linii, liczby od 1 do 10.
    Napisz zarówno pętlę for jak i while.
    W sumie zostanie wypisanych 20 liczb.

Oczekiwany wynik:

1 2 3 4 5 6 7 8 9 10
1 2 3 4 5 6 7 8 9 10

 */

public class zad4 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            if (i != 10) {
                System.out.print(i + " ");
            } else {
                System.out.print(i + "\n");
            }
        }
        int j = 1;
        while (j <= 10) {
            System.out.print(j + " ");
            j++;
        }
    }
}

