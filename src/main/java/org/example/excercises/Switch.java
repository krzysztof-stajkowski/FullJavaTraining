package org.example.excercises;

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

        int monthNum = 5;
        String season = "";

        switch (monthNum) {
            case 3:
            case 4:
            case 5:
                season = "wiosna";
                break;
            case 6:
            case 7:
            case 8:
                season = "lato";
                break;
            case 9:
            case 10:
            case 11:
                season = "jesień";
                break;
            case 12:
            case 1:
            case 2:
                season = "zima";
                break;
            default:
                season = "brak informacji";
        }

        System.out.println("Numer miesiąca "+monthNum+" to pora roku: " + season);
    }
}
