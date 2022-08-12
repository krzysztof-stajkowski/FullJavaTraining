package org.example.ZadaniaZKamilem.tests.test5;

import org.w3c.dom.ls.LSOutput;

public class Four extends Two implements Inter{
    @Override
    public void sound() {
        System.out.println("mmmm");
    }

    @Override
    public void move() {
        super.move();
        System.out.println(" z klasy 2");
    }
}
