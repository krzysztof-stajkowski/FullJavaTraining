package org.example.wzorceProjektowe.dekorator;

public class SosPomidorowy extends DodatkiDekorator{

    public SosPomidorowy(Pizza newPizza) {
        super(newPizza);

        System.out.println("Dodawanie sosu pomidorowego ");

    }

    public String getDescription() {
        return tempPizza.getDescription() + ", Sos Pomidorowy";
    }

    public double getCost() {
        return tempPizza.getCost() + 0.30;
    }

}
