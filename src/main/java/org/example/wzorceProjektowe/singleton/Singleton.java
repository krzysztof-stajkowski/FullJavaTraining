package org.example.wzorceProjektowe.singleton;

public class Singleton { //jedna instancja obiektu nieważne ile razy bedzie wywołana metoda np. raz pobieramy plik 1GB. raz pobieramy bazę itp.

   // private static final Singleton INSTANCE = new Singleton(); //gdy ta linijka pozostanie w linii 5 to ta instan cja bedzie się tutaj najpierw tworzyła
                                                               //dlatego możemy przenieść to do metody i pozostawić tylko inicjalizację tego pola jak poniżej

    private static Singleton INSTANCE;

    private Singleton() {
        System.out.println("Instancja - mimo wywołania metody 4x w main to tylko raz się uruchamia");
    }

    public static Singleton getInstance() {
       //tutaj tworzymy instację w metodzie
        if (INSTANCE == null){
            INSTANCE = new Singleton();
        }

        return INSTANCE;
    }

    public static void main(String[] args) {

        getInstance();
        getInstance();
        getInstance();
        getInstance();

    }
}
