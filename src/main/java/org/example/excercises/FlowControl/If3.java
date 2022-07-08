package org.example.excercises.FlowControl;

public class If3 {

    public static void main(String[] args) {
        /*
            Ocena punktowa potencjalnych kierowców.
            Stwórz prosta ocenę kierowcy zaczynając od początkowych zmiennych:
            points = 0 (int), driverLicense (boolean), experienceYears (int),
            drunkDriving (boolean), causedAccident (boolean), overSpeeding (boolean),
            Zastosuj instrukcje if do sprawdzadzania warunków i dodawania czy odejmowania punktów.

            1. Kierowca startuje z ilością 0 punktów, Dostaje +20 jeśli ma prawo jazdy
            2. -100 punktów jeśli jeździł pod wpływem albo spowodował wypadek
            3. -10 jeśli przekraczał prędkość
            4. Jeśli ma przynajmniej 10 lat doświdczenia +20 punktów
            5. Jeśli ma więcej niż 60 lat doświadczenia -20 punktów
         */

        int points = 0;
        boolean driverLicense = true;
        int experienceYears = 10;
        boolean drunkDriving = false;
        boolean causedAccident = false;
        boolean overSpeeding = false;
        int age = 62;

        if (driverLicense) {
            points += 20;
        }
        if (experienceYears >= 10) {
            points += 20;
        }
        if (age > 60) {
            points -= 20;
        }
        if (drunkDriving || causedAccident) {
            points -= 100;
        }
        if (overSpeeding) {
            points -= 10;
        }

        System.out.println(points);
    }
}