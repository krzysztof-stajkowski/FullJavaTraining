package org.example.excercises.FlowControl;

public class DoWhile {
    public static void main(String[] args) {
       /*
        Stwórz pętle do while od 0 do 20
        i wyświetl tylko i wyłącznie nieparzyste liczby.
         */

        int i = 1;

        do {

            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;

        } while (i <= 20);


    }
}