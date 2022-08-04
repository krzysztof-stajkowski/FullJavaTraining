package org.example.ZadaniaZKamilem.konstruktory;

public class KOT {
    int size = 6;
    String name = "Puszek";

    public KOT(){}

    public KOT(int size, String name) {
        this.size = size;
        this.name = name;
    }

    @Override
    public String toString() {
        return "KOT{" +
                "size=" + size +
                ", name='" + name + '\'' +
                '}';
    }
}
