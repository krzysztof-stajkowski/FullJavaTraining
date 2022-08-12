package org.example.ZadaniaZKamilem.tests.test2;

public class Main2 {
    public static void main(String[] args) {

        One one = new Two(); //to działa bo Two dziedziczy po One
        one.print();

       // Two two = new One(); //To nie zadziała
       // two.print();
    }
}
