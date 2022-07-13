package org.example.basics.oop.methods;

class MyCalc {

    //wywołanie przez wartość (nie referencje jak obiekty)
    //przez wartość oznacza ze wszelkie przekazane parametry beda kopiami przekazanymi do metody i nie bedzie można ich zmienic u źródła
    public void add(int a, int b) {
        int result = a + b;
        System.out.println("result: " + result);

    }

}

public class InvokingMethods {
    public static void main(String[] args) {
        //tworzymy obiekt klasy aby mieć dostęp do metod
           MyCalc calculation = new MyCalc();
           int a = 10;
           int b = 7;

           calculation.add(a,b);


    }
}
