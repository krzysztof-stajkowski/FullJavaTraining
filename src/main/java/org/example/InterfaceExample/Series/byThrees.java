package org.example.InterfaceExample.Series;

public class byThrees implements Series {
    int val;

    //konstruktor który ustawia defaultową wartość val
    public byThrees() {
        this.val = 0;
    }

    @Override
    public int getNext() {
        val += 3;
        return val;
    }

    @Override
    public int getPrev() {
        val -= 2;
        return val;
    }
}

