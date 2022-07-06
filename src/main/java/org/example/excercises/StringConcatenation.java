package org.example.excercises;

public class StringConcatenation {
    public static void main(String[] args) {
         /*
        Stwórz tablicę 4 imion i połącz je za pomocą konkatenacji,
        nie ważne czy będzie to operator + czy metoda concat().
        Zaprezentuj na koniec wynik połączenia wszystkich elementów.
        Pamiętaj o spacji rozdzielającej imiona :)
         */

        String names[] = { "Ola", "Kasia", "Ela", "Karol" };

        String str = "";

        for (String s : names) {
            str = str.concat(s);
            str += " ";
        }

        System.out.println(str);
    }
}