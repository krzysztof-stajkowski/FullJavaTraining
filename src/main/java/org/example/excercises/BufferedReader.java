package org.example.excercises;


import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader {

    public static void main(String[] args) throws IOException {

        java.io.BufferedReader reader = new java.io.BufferedReader(
                new InputStreamReader(System.in)
        );

        System.out.println("Podaj imie");
        String name = reader.readLine();
        System.out.println("Twoje imie to: " + name);

    }

}
