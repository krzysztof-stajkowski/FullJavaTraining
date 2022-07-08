package org.example.excercises.FlowControl;

public class If2 {

    public static void main(String[] args) {
        /*
            Wykorzystaj instrukcje if, else if itd
            wraz z operatorami logicznymi czyli AND i OR
            do sprawdzenia pogody i decyzji czy warto pójść na spacer
            Potrzebujesz nastepujących zmiennych typu boolean: raining, haveUmbrella
            Dodatkowo zapisz temperaturę jako int w zmiennej: temperature

            Wymagania:
            1. Gdy temperatura jest powyżej 40 lub poniżej -20 to komunikat o pozostaniu w domu
            2. Jeśli temperatura między -10 a 10, pada i ma parasolkę to może wyjść (w jednym if)
            3. Jeśli nie pada i powyżej 12 stopni może wyjść
            4. W innych wypadkach zostaje w domu
         */

        boolean raining = true;
        boolean haveUmbrella = true;
        int temperature = 30;

        // 1. Gdy temperatura jest powyżej 40 lub poniżej -20 to komunikat o pozostaniu w domu
        if (temperature > 40 || temperature < -20) {
            System.out.println("Musisz pozostać w domu");
            // 2. Jeśli temperatura między -10 a 10, pada i ma parasolkę to może wyjść (w jednym if)
        } else if (temperature > -10 && temperature <= 10 && haveUmbrella && raining) {
            System.out.println("Temperatura jest ok, pada ale masz parasol to możesz wyjść");
            // 3. Jeśli nie pada i powyżej 12 stopni może wyjść
        } else if (!raining && temperature > 12) {
            System.out.println("Ciepło, nie pada, możesz wyjść!");
        } else if (temperature > 10 && raining && haveUmbrella) {
            System.out.println("Temperatura jest " + temperature + " stopni, pada i w sumie masz parasol,\n"
                    + "ale musisz zostać w domu aż temperatura spadnie o " + (temperature - 10) + " stopień/stopni");
        } else {
            System.out.println("Zostajesz w domu!");
        }


        //  4. W innych wypadkach zostaje w domu

    }
}