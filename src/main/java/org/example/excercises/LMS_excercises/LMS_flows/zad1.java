package org.example.excercises.LMS_excercises.LMS_flows;

/*
Zadanie 1

        W pliku Main01.java stwórz dwie zmienne, o nazwach nr1 i nr2,
        przechowujące liczby całkowite o wartościach 3 i 7.
        Następnie za pomocą instrukcji warunkowej if ... else , wypisz w konsoli, która z nich jest większa.
        Tekst wypisz wg wzoru: Większa liczba to 7.
*/

public class zad1 {

    public static void main(String[] args) {

        int nr1 = 3;
        int nr2 = 7;

        if (nr1 > nr2) {
            System.out.println("Większa liczba to " + nr1);
        } else {
            System.out.println("Większa liczba to " + nr2);
        }

        System.out.println("----------------------");

        Integer nr3 = 5;
        Integer nr4 = 3;

        int num = nr3.compareTo(nr4);
        int biggerValue = num > 0 ? nr3 : nr4;

        System.out.println("Większa liczba to " + biggerValue);

        boolean num2 = nr3.equals(nr4);
        System.out.println("Czy nr3 jest równy nr4? " + num2);

    }

}
