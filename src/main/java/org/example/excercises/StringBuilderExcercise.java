package org.example.excercises;

public class StringBuilderExcercise {
    public static void main(String[] args) {
         /*
        Stwórz tablicę kilku imion.
        W pętli połącz wszystkie imiona z pomocą StringBuffer,
        Zaprezentuj wynikowy łańcuch znaków w konsoli.
         */

        String names[] = { "Ola", "Asia", "Kasia" };

        StringBuilder strBuilder = new StringBuilder();

        for (String s: names) {
            strBuilder.append(s);
            strBuilder.append(" ");
        }

        System.out.println(strBuilder.toString());
    }
}
