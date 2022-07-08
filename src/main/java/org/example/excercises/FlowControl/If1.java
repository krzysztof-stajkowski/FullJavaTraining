package org.example.excercises.FlowControl;

import java.util.Scanner;

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

// zmienna final minimum wiek i waga
        final int minWiek = 18;
        final int minWaga = 50;

//zmienna wiek
        int wiek = 19;
//zmienna waga
        int waga = 51;
//podaj wiek

        Scanner scanner = new Scanner(System.in);
        try {


            System.out.println("Podaj wiek");
            int age = Integer.parseInt(scanner.nextLine());
            //jeśli wiek jest >=18 to...
            if (age >= minWiek) {
                System.out.println("Podaj wagę");
                int weight = Integer.parseInt(scanner.nextLine());

                if (weight < minWaga) {
                    System.out.println("Waga musi być conajmniej 50");
                    System.out.println("Nie kwalifikujesz się do pobrania krwi");
                } else {
                    System.out.println("Kwalifikujesz się do pobrania krwi");
                }

            } else {
                System.out.println("Wiek musi być conajmniej 18");
                System.out.println("Nie kwalifikujesz się do pobrania krwi");
            }
        } catch (NumberFormatException e) {
            System.out.println("Zły wpis");
        }

    }
}