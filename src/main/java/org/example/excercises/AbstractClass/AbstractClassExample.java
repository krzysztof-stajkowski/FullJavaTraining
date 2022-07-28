package org.example.excercises.AbstractClass;

public abstract class AbstractClassExample {

    public static final int quantity = 10;

    //abstrakcyjna metoda - nie może posiadac impelemntacji jak zwykłą poniżej oraz nie ma nawiasów klamrowych
    public abstract String kupuj();

    //zwykła metoda
    public static void goBuy(int distance, int speed) {
        double time = (double) distance / speed;
        System.out.println("I will buy " + quantity + " items in time/duration " + time);
    }
}
