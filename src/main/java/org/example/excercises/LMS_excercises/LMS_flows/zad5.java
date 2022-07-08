package org.example.excercises.LMS_excercises.LMS_flows;
/*
Zadanie 5

    W pliku Main05.java stwórz zmienne resultFor oraz resultWhile i przypisz do nich liczbę 0.
    Następnie stwórz pętlę, która doda do siebie liczby od 1 do 10 i zapisze do zmiennej resultFor lub resultWhile.
    Pętla powinna co uruchomienie (zwaną także iteracją pętli) dodawać do zmiennej resultFor lub resultWhile kolejną liczbę z podanego zakresu.
    Napisz zarówno pętlę for jak i while.
    Wypisz w konsoli w oddzielnych liniach zmienne: resultFor i resultWhile.

Oczekiwany wynik:

55
55

 */

public class zad5 {
    public static void main(String[] args) {

        int resultFor = 0;
        int resultWhile = 0;

        for (int i = 0; i <= 10; i++) {
            resultFor += i;
        }

        int j = 0;
        while (j <= 10) {

            resultWhile += j;
            j++;
        }
        System.out.println("ResultFor: " + resultFor);
        System.out.println("ResultWhile: " + resultWhile);
    }
}
