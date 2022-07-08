package org.example.excercises.FlowControl;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        /*
        Wykorzystaj switch do określenia pory roku na bazie numeru
        miesiąca w zmiennej monthNum (od 1 do 12).
        Zaprezentuj w konsoli informację o porze roku.
        Pory roku dla liczb:
        3, 4, 5 - wiosna
        6, 7, 8 - lato
        9, 10, 11 - jesień
        12, 1, 2 - zima
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę od 1 do 12 dla pory roku");
        String poraRoku = scanner.nextLine();


        switch (Integer.parseInt(poraRoku)) {

            case 1, 2, 12:
                System.out.println("Zima");
                break;

            case 3, 4, 5:
                System.out.println("Wiosna");
                break;

            case 6, 7, 8:
                System.out.println("Lato");
                break;

            case 9, 10, 11:
                System.out.println("Jesień");
                break;
            default:
                System.out.println("Zły wpis");

        }

    }
}