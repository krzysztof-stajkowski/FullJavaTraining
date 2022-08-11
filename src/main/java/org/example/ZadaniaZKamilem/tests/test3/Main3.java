package org.example.ZadaniaZKamilem.tests.test3;

public class Main3 {
    public static void main(String[] args) {

        One one = new Two(); // Two jest dzieckiem One więc może One być nowym Two - nie na odwrót
        one.print(10); //metoda print w One ma parametr int i ale nie jest wykorzystant w metodzie (dla zmyłki)
    }
}
