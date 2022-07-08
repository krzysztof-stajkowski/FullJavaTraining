package org.example.excercises.LMS_excercises.LMS_flows;

/*
Zadanie 6

    W pliku Main6.java napisz kod, który na podstawie wartości zmiennej n ( int n = 6;),
    wypisuje wszystkie liczby od zera do n. Przy każdej liczbie wypisz, czy jest parzysta,
    czy nie.

Wzór:
0 – parzysta
1 – nieparzysta
2 – parzysta
3 – nieparzysta
...
Napisz zarówno pętlę for jak i pętlę while.
Podpowiedź: Jak sprawdzić, czy liczba jest parzysta lub nieparzysta? Wystarczy obliczyć jej resztę z dzielenia przez 2, jeżeli wynik to 0, wtedy liczba jest parzysta, w przeciwnym przypadku jest nieparzysta.

Oczekiwany wynik:
0 - parzysta
1 - nieparzysta
2 - parzysta
3 - nieparzysta
4 - parzysta
5 - nieparzysta
6 - parzysta
0 - parzysta
1 - nieparzysta
2 - parzysta
3 - nieparzysta
4 - parzysta
5 - nieparzysta
6 - parzysta

 */

public class zad6 {
    public static void main(String[] args) {

        System.out.println("FOR:");

        int n = 6;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "- parzysta");
            } else {
                System.out.println(i + "- nieparzysta");
            }
        }
        System.out.println("WHILE:");

        int j = 0;
        while (j <= n) {
            if (j % 2 == 0) {
                System.out.println(j + "- parzysta");
            } else {
                System.out.println(j + "- nieparzysta");
            }
            j++;
        }
    }
}


