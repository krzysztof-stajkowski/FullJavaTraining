package org.example.ZadaniaZKamilem.konstruktory;

public class PIES {
    int size = 10;
    String name = "Azor";

    public PIES(){}

    public PIES(int size, String name) {
        this.size = size;
        this.name = name;
    }

    @Override
    public String toString() {
        return "PIES{" +
                "size=" + size +
                ", name='" + name + '\'' +
                '}';
    }
}
