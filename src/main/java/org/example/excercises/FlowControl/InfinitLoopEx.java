package org.example.excercises.FlowControl;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InfinitLoopEx {
    public static void main(String[] args) throws IOException {
          /*
        W programie zapisz liczbę cąłkowitą z nazwą number
        o początkowej wartości 0.
        Dodaj BufferedReader do odczytu danych od użytkownika.
        Pamiętaj o potencjalnym wyjątku, który musi być obsłużony.
        Stwórz dowolną nieskończoną pętlę.
        W każdej iteracji poproś o użytkownika o wpisanie liczby,
        odczytaj informację od użytkownika z konsoli za pomocą BufferedReader.
        Jeśli wpisane będzie quit zakończ działanie pętli.
		Aby porównać łańcuchy znaków wykorzystaj metodę equalsIgnoreCase() która jest w string
        W innym wypadku oczekuj wpisanej liczby która będzie dodana
        do zmiennej number. Zaprezentuj aktualną wartość number
        na koniec każdej iteracji.
     */

        int number = 0;

        java.io.BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        for (; ; ) {

            System.out.println("Podaj liczbe");
            String read = bf.readLine();

            if (read.equalsIgnoreCase("q")) {
                System.out.println("koniec");
                break;
            } else {

                number += Integer.parseInt(read);
                System.out.println("Suma dodanych: " + number);
            }

        }


    }
}
