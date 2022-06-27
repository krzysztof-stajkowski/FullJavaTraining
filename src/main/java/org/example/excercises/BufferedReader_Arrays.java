package org.example.excercises;


import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader_Arrays {
    public static void main(String[] args) throws IOException {

        String values[] = {"jeden", "dwa", "trzy", "cztery", "pięc"};

        java.io.BufferedReader reader = new java.io.BufferedReader(
                new InputStreamReader(System.in)
        );

        System.out.println("Podaj indeks w tablicy, max wartość: " + (values.length - 1));
        String strNum = reader.readLine();
        //konwersja wartości string na int
        int index = Integer.parseInt(strNum);
        System.out.println("index " + index + " w tablicy ma wartość " + values[index]);

    }
}
