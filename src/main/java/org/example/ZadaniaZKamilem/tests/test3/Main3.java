package org.example.ZadaniaZKamilem.tests.test3;

public class Main3 {
    public static void main(String[] args) {

        One one = new Two(); // Two jest dzieckiem One więc może One być nowym Two - nie na odwrót
        one.print(10); //metoda print w One ma parametr int i ale nie jest wykorzystant w metodzie (dla zmyłki)

        One one1 = new Two(3,5);
        one1.print(1);

        One one2 = new One();
        one2.print(4);

        Two two = new Two();
        two.print(3);

        //statyczne metody nie mogą być przeciążane w klasach dziedziczących
        //musza być indentyczne w deklaracji (parametry/nazwa)
        //gdy metoda nie jest przeciążana w klasie Two to zawsze w przypadku
        // -> One = new Two
        //będzie wywoławyana na obiekcie metoda z klasy One

    }
}
