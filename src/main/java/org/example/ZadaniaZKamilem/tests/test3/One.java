package org.example.ZadaniaZKamilem.tests.test3;

public class One {
    public void print(int i) {
        System.out.println("Parent");
    }
    public void print2(int i) { //klasa dziedziscząca może wywołac metody klasy nadrzędnej nawet bez overrida
        System.out.println("Parent");
    }
}