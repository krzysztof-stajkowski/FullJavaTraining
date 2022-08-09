package org.example.wzorceProjektowe.dekorator;

public class PlainPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Na cienkim cieście";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}
