package org.example.InterfaceExample.Series;

public class byTwos implements Series {

    int val;

    //konstruktor który ustawia defaultową wartość val
    public byTwos() {
        this.val = 0;
    }

    @Override
    public int getNext() {
        val += 2;
        return val;
    }

    @Override
    public int getPrev() {
        val -= 3;
        return val;
    }
}
