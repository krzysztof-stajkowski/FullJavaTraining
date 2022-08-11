package org.example.ZadaniaZKamilem.tests.test8;

public class Main8 {
    public static void main(String[] args) {
        long l = 20l;
        One one = new One(l); //wywołany będzie long constructor - w metodzie nie ma wykorzystania liczy więc będzie tylko treść z souta

        int i = 20;
        One another = new One(i);
    }
}
