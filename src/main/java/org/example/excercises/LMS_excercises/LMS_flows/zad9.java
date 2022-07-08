package org.example.excercises.LMS_excercises.LMS_flows;

/*
W pliku Main09.java napisz program rysujący na podstawie wartości zmiennej nponiższy schemat, dla zawartego w metodzie main int n = 5;

*
* *
* * *
* * * *
* * * * *

Możesz to zadanie rozwiązać na dwa sposoby:

    używając pętli zależnych,
    używając pętli niezależnych i instrukcji warunkowej if.
*/

public class zad9 {
    public static void main(String[] args) {
        //definicja zmiennej z ilością rzędów i gwiazdek w wierszu
        int n = 5;

        //tworzymy pętlę która będzie generowała nam WIERSZE
        for (int i = 0; i < n; i++) {
            String row = "";//zmienna która jest zerowana na początku każdej iteracji,
            // przechowująca gwiazdki z wiersza

            //tworzymy pętlę generującą nam gwiazdki w wierszu
            for (int j = 0; j < n; j++) {

                if (i == 0 && j == 0) {
                    row += "* ";
                } else if (i == 1 && j < 2) {
                    row += "* ";
                } else if (i == 2 && j < 3) {
                    row += "* ";
                } else if (i == 3 && j < 4) {
                    row += "* ";
                } else if (i == 4 && j < 5) {
                    row += "* ";
                } else {
                    row += "";
                }
            }
            System.out.print(row + "\n");//wyświetlamy gwiazdki z wiersza i dodajemy znak nowej lini
        }
    }
}

