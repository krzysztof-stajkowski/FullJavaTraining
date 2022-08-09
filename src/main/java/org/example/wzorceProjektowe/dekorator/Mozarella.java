package org.example.wzorceProjektowe.dekorator;

public class Mozarella extends DodatkiDekorator{

    public Mozarella(Pizza newPizza) {
        super(newPizza);

        System.out.println("Dodawanie ciasta");
        System.out.println("Dodatkowa Mozarella");
    }

    public String getDescription() {
        return tempPizza.getDescription() + ", Mozarella";
    }

    public double getCost() {
        return tempPizza.getCost() + 0.50;
    }

}
