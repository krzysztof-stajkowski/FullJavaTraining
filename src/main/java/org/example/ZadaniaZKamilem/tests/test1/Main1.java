package org.example.ZadaniaZKamilem.tests.test1;

public class Main1 {
    public static void main(String[] args) {
        One one = new One();
        Two two = (Two)one;
        System.out.println( two.getInt() );
    }
}
