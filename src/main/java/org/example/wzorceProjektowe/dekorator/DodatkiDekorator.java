package org.example.wzorceProjektowe.dekorator;

abstract class DodatkiDekorator implements Pizza {

    protected Pizza tempPizza;

    public DodatkiDekorator(Pizza newPizza) {
        tempPizza = newPizza;
    }

    public String getDescription() {
        return tempPizza.getDescription();
    }

    public double getCost() {
        return tempPizza.getCost();
    }


}
