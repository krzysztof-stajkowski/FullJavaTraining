package org.example.basics.oop.oopEx;

public class Tv {

    String producent;
    String model;

    int rok_produkcji;
    public void printBasicData() {
        System.out.println(
                "Producent: " + this.producent + " \n" +
                        "Model: " + this.model + " \n" +
                        "Rok produkcji: " + this.rok_produkcji
        );
    }
}

class TvExample {

    public static void main(String[] args) {

        Tv telewizor1 = new Tv();
        telewizor1.producent = "Sony";
        telewizor1.model = "Bravia";
        telewizor1.rok_produkcji = 2020;

        telewizor1.printBasicData();

    }
}

