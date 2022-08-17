package org.example.ZadaniaZKamilem.tests.test4;

public abstract class Test extends One { //klasa abstrakcyjna dziedziczy po klasie normalnej
    public abstract void process2(); //posiada metodę z samymi nawiasami
    public void process3(){
        System.out.println("Abc");
    }; //klasa abstrakcyjna nie musi mieć wszystkich metod abstrakcyjnych


    @Override
    public void process() {
        super.process();
        System.out.println("Overidowana metoda z klasy One która jest w klasie abstrakcyjnej");
    }
}
