package org.example.ZadaniaZKamilem.jvmBehavior;

public class B extends A {

    String b = "BBB";

    @Override
    protected void metoda() {
        System.out.println(super.a + b);;
    }
}
