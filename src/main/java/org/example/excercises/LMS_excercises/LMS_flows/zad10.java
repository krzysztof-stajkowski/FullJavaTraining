package org.example.excercises.LMS_excercises.LMS_flows;

/*
Zadanie 10

W pliku Main10.java napisz program rysujący, na podstawie wartości zmiennej n, następujący schemat (tutaj dla n = 5):

* 2 3 4 5
* * 3 4 5
* * * 4 5
* * * * 5
* * * * *
* * * * *
* * * * 5
* * * 4 5
* * 3 4 5
* 2 3 4 5

Do stworzenia takiego zapisu, w środku zagnieżdżonej pętli, użyj wyrażenia warunkowego if,
dzięki któremu zdecydujesz czy wypisać gwiazdkę, czy licznik z zagnieżdżonej pętli.

*/

public class zad10 {
    public static void main(String[] args) {

        //definicja zmiennej z ilością rzędów i gwiazdek w wierszu
        int n = 5;

        //tworzymy pętlę która będzie generowała nam WIERSZE
        for (int i = 0; i < (n * 2); i++) {
            String row = "";//zmienna która jest zerowana na początku każdej iteracji,
            // przechowująca gwiazdki z wiersza

            //tworzymy pętlę generującą nam gwiazdki w wierszu
            for (int j = 0; j < n; j++) {

                if (i == 0 && j != 0) {
                    row += j + 1 + " ";
                } else if (i == 1 && j > 1) {
                    row += j + 1 + " ";
                } else if (i == 2 && j > 2) {
                    row += j + 1 + " ";
                } else if (i == 3 && j > 3) {
                    row += j + 1 + " ";
                } else if ((i == 4 && j == 4) || ((i == 5 && j >= 0))) {
                    row += "* ";
                } else if (i == 6 && j == 4) {
                    row += j + 1 + " ";
                } else if (i == 7 && j > 3) {
                    row += j + 1 + " ";
                } else if (i == 7 && j > 2) {
                    row += j + 1 + " ";
                } else if (i == 8 && j > 1) {
                    row += j + 1 + " ";
                } else if (i == 9 && j > 0) {
                    row += j + 1 + " ";
                } else {
                    row += "* ";
                }
            }
            System.out.print(row + "\n");//wyświetlamy gwiazdki z wiersza i dodajemy znak nowej lini
        }
    }
}