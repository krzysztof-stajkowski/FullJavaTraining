package org.example.InterfaceExample.Series;

public class byTwos implements Series {

    int val;

    //konstruktor który ustawia defaultową wartość val
    public byTwos() {
        this.val = 0;
    }

    //wykorzystanie zmiennej w interfejsie aby zablokowała mozliwość przekroczenia pewnej wartości
    @Override
    public int getNext() {
       if(val>=MAX){
           System.out.println(ERRORMSG);
       }else{
           val += 2;
       }
        return val;
    }

    @Override
    public int getPrev() {
        val -= 3;
        return val;
    }
}
