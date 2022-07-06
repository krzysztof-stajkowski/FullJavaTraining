package org.example.data.string_class;

public class Concatenation {
    public static void main(String[] args) {
        String s1 = "Hello ";
        String s2 = "World!";
        String s3 = s1 + s2 + " from Java prog.";
        System.out.println(s3);

        String txt1 = "Dodge Charger ";
        int year = 2020;

        String car = txt1 + year; // konkatenacja wymusza konwersję na String nawet połączeniu z liczbą
        System.out.println(car);

        String car2 = txt1.concat( Integer.toString(year) ); //funkcja konkatenacji ale nie ma automatycznej konwersji i trzeba manualnie to zrobić z klasy Intefer w tym przypadku
        System.out.println(car2);

    }
}
