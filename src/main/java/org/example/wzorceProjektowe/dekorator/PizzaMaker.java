package org.example.wzorceProjektowe.dekorator;

public class PizzaMaker {

    public static void main(String[] args) {

        //Dekorator
        Pizza basicPizza = new SosPomidorowy(new Mozarella(new PlainPizza()));

        System.out.println("Składniki: " + basicPizza.getDescription());
        System.out.println("Cena " + basicPizza.getCost());
    }


}
