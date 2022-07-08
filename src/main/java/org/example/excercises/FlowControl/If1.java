package org.example.excercises.FlowControl;

public class If1 {

    public static void main(String[] args) {
        /*
            Napisz program kwalifikujący do oddania krwi
            Taka osoba musi mieć 18 lat i minimum 50 kg wagi.
            Użyj zagnieżdżonych instrukcji if.
            Pamiętaj o informacji dla użytkownika czy się kwalifikuje
            oraz dlaczego nie spełnia danego warunku.
            Dla uproszczenia stosuj liczby całkowite.
         */

        int age = 19;
        int weight = 49;

        if (age >= 18) {
            if (weight >= 50) {
                System.out.println("Można oddać krew");
            } else {
                System.out.println("Kryterium wagi niespełnione");
            }
        } else {
            System.out.println("Wymóg wieku nie jest spełniony");
        }

    }
}