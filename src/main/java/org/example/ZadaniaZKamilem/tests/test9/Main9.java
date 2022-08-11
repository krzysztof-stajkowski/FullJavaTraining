package org.example.ZadaniaZKamilem.tests.test9;

public class Main9 {
    public static void main(String[] args) {
        long l = 20l;
       // One one = new Two(l);  - nie może być przekazany long gdy konstruktor pozwala na int tylko
        One one = new Two(10);
    }
}
