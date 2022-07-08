package org.example.excercises.FlowControl;

public class ForLoopExcercise {
    public static void main(String[] args) {
         /*
            Wykorzystaj pętlę for aby pokazać wszystkie elementy tablicy
            od jej początku w konsoli.
            Użyj kolejnej pętli for aby pokazac elementy tablicy
            od końca do początku.
         */

        int tab[] = {1,2,3};

        for (int i = 0; i < tab.length ; i++) {
            System.out.println(tab[i]);

        }

        System.out.println("-----------");

        for (int i = tab.length -1; i >= 0 ; i--) {
            System.out.println(tab[i]);

        }

    }
}