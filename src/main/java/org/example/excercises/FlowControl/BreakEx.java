package org.example.excercises.FlowControl;

public class BreakEx {
    public static void main(String[] args) {
     /*
        Stwórz dowolną pętle od 0 do 50,
        wyświetl licznik pętli w każdej iteracji,
        ale przerwij działanie pętli na 10 używają
        break.
         */

        for (int i = 1; i <= 50; i++) {

            if (i == 10) {
                break;
            } else {
                System.out.println(i);
            }

        }
    }
}