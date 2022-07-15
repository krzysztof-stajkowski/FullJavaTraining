package org.example.InterfaceExample.Series;

public class MainSeries {
    public static void main(String[] args) {

        //trzeba zaimportować instancję klasy
        byTwos byTwos = new byTwos();
        byThrees byThrees = new byThrees();

        //teraz można zrobić pętlę która wywoła 5 razy metodę z klasy byTwos implementującej metody z interfejsu
        for (int i = 0; i < 5; i++) {
            //System.out.println(byTwos.getNext());
            System.out.println(byThrees.getNext());
        }

    }
}
