package org.example.ZadaniaZKamilem.tests.test1;

public class Main1 {
    public static void main(String[] args) {



        One one = new One();
        Two two = (Two)one; //Exception in thread "main" java.lang.ClassCastException:
        System.out.println( two.getInt() );
    }
}
