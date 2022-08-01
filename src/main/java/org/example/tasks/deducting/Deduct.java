package org.example.tasks.deducting;

public class Deduct {

    private static int pierwszaLiczba;
    private static int drugaLiczba = 10;

    private static Integer trzeciaLiczba;
    private static Integer czwartaLiczba = 10;


    public static void main(String[] args) {
        int wynik = pierwszaLiczba - drugaLiczba;
        System.out.println(wynik);

        if (trzeciaLiczba != null && czwartaLiczba != null) {
            int wynik2 = trzeciaLiczba - czwartaLiczba; //będzie błąd ponieważ Obiekt == null
            System.out.println(wynik2);
        }else{
            System.out.println("null number");
        }
    }
}
