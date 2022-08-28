package org.example.excercises.LMS_excercises.zadania.calc1;

public class MainCalc {
    public static void main(String[] args) {

        Calculator calc1 = new Calculator();
        Calculator calc2 = new Calculator();

        calc1.add(2, 3);
        calc1.multiply(3,3);
        calc1.deduct(10,3);
        calc1.divide(30,5);

        calc1.printHistory();

        calc2.multiply(4,4);
        calc2.deduct(33,3);
        calc2.printHistory();

    }
}
