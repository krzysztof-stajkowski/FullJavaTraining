package org.example.excercises;

public class While {
    public static void main(String[] args) {

   /*
        Wykorzystaj petle while do odczytania wszystkich liczb
        z tablicy i pomnożenia każdej z nich przez dwa.
        Pokaż każdy z wyników w konsoli.
         */

        int numbers[] = { 1, 2, 3, 4, 5, 6 };

        int i = 0;
        while (i < numbers.length) {
            System.out.println( numbers[i] * 2 );
            i++;
        }

    }
}