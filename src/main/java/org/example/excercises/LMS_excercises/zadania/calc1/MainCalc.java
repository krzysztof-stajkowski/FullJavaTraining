package org.example.excercises.LMS_excercises.zadania.calc1;

public class MainCalc {
    public static void main(String[] args) {

        Calculator calc1 = new Calculator();
        int length = calc1.getCalcHistory().length;

        System.out.println("Size a. " + length);
        System.out.println("Size b. " + calc1.getCalcHistory().length);

    }
}
