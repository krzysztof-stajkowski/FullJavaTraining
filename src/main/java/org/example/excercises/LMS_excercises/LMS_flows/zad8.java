package org.example.excercises.LMS_excercises.LMS_flows;

public class zad8 {
    public static void main(String[] args) {
        //definicja zmiennej z ilością rzędów i gwiazdek w wierszu
        int n = 5;

        //tworzymy pętlę która będzie generowała nam WIERSZE
        for (int i = 0; i < n; i++) {
            String row = "";//zmienna która jest zerowana na początku każdej iteracji,
            // przechowująca gwiazdki z wiersza

            //tworzymy pętlę generującą nam gwiazdki w wierszu
            for (int j = 0; j < n; j++) {

                if (i == 0 && j != 0) {
                    row += j + 1;
                } else if (i == 1 && j > 1) {
                    row += j + 1;
                } else if (i == 2 && j > 2) {
                    row += j + 1;
                } else if (i == 3 && j > 3) {
                    row += j + 1;
                } else {
                    row += "*";
                }
            }
            System.out.print(row + "\n");//wyświetlamy gwiazdki z wiersza i dodajemy znak nowej lini
        }
    }
}

