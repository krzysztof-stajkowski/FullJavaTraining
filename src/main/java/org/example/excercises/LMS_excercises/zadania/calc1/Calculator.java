package org.example.excercises.LMS_excercises.zadania.calc1;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    List calcHistList;
    int i;

    public Calculator() {
        calcHistList = new ArrayList<>();
    }

    public double add(double num1, double num2) {

        double result = num1 + num2;
        String reString = String.format("%s dodać %s = %s", num1, num2, result);

        history(reString);

        return result;
    }

    double deduct(double num1, double num2) {
        double result = num1 - num2;
        String reString = String.format("%s minus %s = %s", num1, num2, result);
        history(reString);
        return result;
    }

    double multiply(double num1, double num2) {
        double result = num1 * num2;
        String reString = String.format("%s razy %s = %s", num1, num2, result);
        history(reString);
        return result;
    }

    double divide(double num1, double num2) {

        if (num2 == 0) {// you should check j instead of i
            throw new ArithmeticException("cannot Divide By 0");
        }

        double result = num1 / num2;
        String reString = String.format("%s podzielić na %s = %s", num1, num2, result);
        history(reString);

        return result;
    }


    private void history(String reString) {
        i++;
        calcHistList.add(i + ". " + reString);
    }

    public void printHistory() {
        for (Object s : calcHistList) {
            System.out.println(s);
        }
        System.out.println("\n");
    }

    public void deleteFromHistory() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj numer do usunięcia z poniższej historii:");
        printHistory();
       int index = scan.nextInt();

        do {
            calcHistList.remove(index);
            System.out.println("\n Usunięto pozycję " + index);
            printHistory();

        } while (index > calcHistList.size() & index < 0);


    }
}
