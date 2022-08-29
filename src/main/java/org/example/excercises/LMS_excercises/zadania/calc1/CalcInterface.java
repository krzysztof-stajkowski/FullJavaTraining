package org.example.excercises.LMS_excercises.zadania.calc1;


public interface CalcInterface {

    default void final_info() {
        System.out.println("Wynik działania: ");
    }

    double add(double num1, double num2);

    double deduct(double num1, double num2);

    double multiply(double num1, double num2);

    double divide(double num1, double num2);
}
