package org.example.excercises;

public class If2 {

    public static void main(String[] args) {
        /*
            Wykorzystaj instrukcje if, else if itd
            wraz z operatorami logicznymi czyli AND i OR
            do sprawdzenia pogody i decyzji czy warto pójść na spacer
            Potrzebujesz nastepujących zmiennych typu boolean: rainning, haveUmbrella
            Dodatkowo zapisz temperaturę jako int w zmiennej: temperature

            Wymagania:
            1. Gdy temperatura jest powyżej 40 lub poniżej -20 to komunikat o pozostaniu w domu
            2. Jeśli temperatura między -10 a 10, pada i ma parasolkę to może wyjść (w jednym if)
            3. Jeśli nie pada i powyżej 12 stopni może wyjść
            4. W innych wypadkach zostaje w domu
         */

        boolean raining = false;
        boolean haveUmbrella = true;
        int temperature = 14;

        // 1. Gdy temperatura jest powyżej 40 lub poniżej -20 to komunikat o pozostaniu w domu
        if (temperature > 40 || temperature < -20) {
            System.out.println("Zimno lub zbyt gorąco, zostań w domu");
        } else if ( (temperature > -10 && temperature < 10) && raining && haveUmbrella ) {
            // 2. Jeśli temperatura między -10 a 10, pada i ma parasolkę to może wyjść (w jednym if)
            System.out.println("Temperatura między -10 a 10, pada i ma parasolkę to może iść");
        } else if ( !raining && temperature > 12 ) {
            // 3. Jeśli nie pada i powyżej 12 stopni może wyjść
            System.out.println("Nie pada, temperatura powyżej 12 to może iść");
        } else {
            // 4. W innych wypadkach zostaje w domu
            System.out.println("Zostań w domu");
        }

    }
}