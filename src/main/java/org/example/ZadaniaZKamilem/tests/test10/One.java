package org.example.ZadaniaZKamilem.tests.test10;

public class One {
    public One(int x){
        System.out.print("int constructor");
    }

    public One(char c){
        System.out.print("char constructor");
    }

     void One(String str){ //ten konstruktor nie zadziała /nawet jako public void
        System.out.print("String constructor");
    }
}
