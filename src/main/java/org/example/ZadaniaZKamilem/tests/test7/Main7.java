package org.example.ZadaniaZKamilem.tests.test7;

public class Main7 {
    public static void main(String[] args) {
       // One one = new One(); ta linia zwraca błąd ponieważ nie ma parametru nadanego w konstruktorze
        One one = new One(5);
        System.out.println(one.x);
    }
}
