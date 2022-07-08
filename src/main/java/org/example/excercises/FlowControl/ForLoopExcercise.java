package org.example.excercises.FlowControl;

public class ForLoopExcercise {
    public static void main(String[] args) {
         /*
            Wykorzystaj pętlę for aby pokazać wszystkie elementy tablicy
            od jej początku w konsoli.
            Użyj kolejnej pętli for aby pokazac elementy tablicy
            od końca do początku.
         */
        String names[] = { "Ania", "Kasia", "Ola", "Olek", "Daniel" };
        System.out.println("Imiona od początku:");
        for (int i = 0; i < names.length; i++) {
            System.out.println("i: " + i + " - " + names[i]);
        }

        System.out.println("Imiona od końca");
        for (int i = names.length - 1; i >= 0; i-- ) {
            System.out.println("i: " + i + " - " + names[i]);
        }

    }
}