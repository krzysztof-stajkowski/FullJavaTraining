package org.example.excercises.FlowControl;


import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

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

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = 0;

        for ( ; ; ) {
            System.out.println("Wpisz liczbę lub quit jesli chcesz zakończyć program");
            String data = reader.readLine();
            if (data.equalsIgnoreCase("quit")) break;

            int num = Integer.parseInt(data);
            number += num;

            System.out.println("Wartość number: " + number);
        }

    }
}
