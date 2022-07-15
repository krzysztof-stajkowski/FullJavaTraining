package org.example.InterfaceExample.Series;

public interface Series {

    public static final int MAX = 10; // zmienne w interfejsie są zarówno finalne, statyczne (nie trzeba tworzyć obiektu) oraz publiczne co widać po wyszarzonych modifikatorach
    String ERRORMSG = "Nie można powyżej warotości: " + MAX;

    int MIN = 1;
    String exampleString = "Można wywołać pole bezpośrednio z interfejsu w klasie";


    //metody które będą musiały być w klasie
    int getNext();
    int getPrev();



}
