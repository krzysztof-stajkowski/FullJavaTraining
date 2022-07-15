package org.example.InterfaceExample.Series;

public class MainSeries {
    public static void main(String[] args) {

        //trzeba zaimportować instancję klasy
        byTwos byTwos = new byTwos();
        byThrees byThrees = new byThrees();

        //teraz można zrobić pętlę która wywoła 5 razy metodę z klasy byTwos implementującej metody z interfejsu
        for (int i = 0; i < 5; i++) {
            System.out.println("byTwo standard: " + byTwos.getNext());
            System.out.println("byThree standard: " + byThrees.getNext());
        }

        //można sworzyć obiekt typu interfejs który będzie można przypisać do metody
        Series ob;

        for (int i = 0; i < 5; i++) {
            ob = byTwos;
            System.out.println("Obiekt byTwo: " + ob.getNext());

            ob = byThrees;
            System.out.println("Obiekt byThree: " + ob.getPrev());
        }

        //możemy wywoływać bezpośrednio z interfejsu wartości z pól
        System.out.println("Wartosć minimalna wywołana bezpośrednio z interfejsu Series wynosi: " + Series.MIN);
        System.out.println(Series.exampleString);


    }
}
