package org.example.excercises.FlowControl;

public class While {
    public static void main(String[] args) {

   /*
        Wykorzystaj petle while do odczytania wszystkich liczb
        z tablicy i pomnożenia każdej z nich przez dwa.
        Pokaż każdy z wyników w konsoli.
         */

        int tab[] = {1, 2, 3};

        int i = 0;

        while (i < tab.length) {

            System.out.println(tab[i]*2);

            i++;
        }
    }
}