package org.example.excercises.LMS_excercises.zadania.calc1;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator implements CalcInterface{

    List calcHistList;
    int incrementHistoryPos;
    Scanner scan = new Scanner(System.in);

    public Calculator() {
        this.calcHistList = new ArrayList<>();
    }

    public void doMath() {

        System.out.println("Wybierz metodę arytmetyczną: \n" +
                "1. Dodawanie\n" +
                "2. Odejmowanie\n" +
                "3. Mnożenie\n" +
                "4. Dzielenie\n");
        int chosenNumber =  scan.nextInt();

        System.out.println("Podaj pierwszą liczbę do działania");
        int firstNumber =  scan.nextInt();
        System.out.println("Podaj drugą liczbę do działania");
        int secondNumber =  scan.nextInt();

        do {
            switch (chosenNumber){

                case 1:
                    add(firstNumber,secondNumber);
                    break;
                case 2:
                    deduct(firstNumber,secondNumber);
                    break;
                case 3:
                    multiply(firstNumber,secondNumber);
                    break;
                case 4:
                    divide(firstNumber,secondNumber);
                    break;
            }

        } while (chosenNumber > 4 & chosenNumber < 0);


    }
    @Override
    public double add(double num1, double num2) {
        double result =  num1 + num2;
        String reString = String.format("%s dodać %s = %s", num1, num2, result);

        history(reString);
        System.out.println(reString);
        return result;
    }

    @Override
    public double deduct(double num1, double num2) {
        double result = num1 - num2;
        String reString = String.format("%s minus %s = %s", num1, num2, result);
        history(reString);
        System.out.println(reString);
        return result;
    }

    @Override
    public double multiply(double num1, double num2) {
        double result = num1 * num2;
        String reString = String.format("%s razy %s = %s", num1, num2, result);
        history(reString);
        System.out.println(reString);
        return result;
    }

    @Override
    public double divide(double num1, double num2) {

        if (num2 == 0) {// you should check j instead of i
            throw new ArithmeticException("cannot Divide By 0");
        }

        double result = num1 / num2;
        String reString = String.format("%s podzielić na %s = %s", num1, num2, result);
        history(reString);
        System.out.println(reString);
        return result;
    }


    private void history(String reString) {
        incrementHistoryPos++;
        calcHistList.add(incrementHistoryPos + ". " + reString);
    }

    public void printHistory() {
        for (Object s : calcHistList) {
            System.out.println(s);
        }
        System.out.println("\n");
    }

    public void deleteFromHistory() {

        System.out.println("Podaj numer do usunięcia z poniższej historii:");
        printHistory();
        int index = scan.nextInt();

        do {
            calcHistList.remove(index - 1);
            System.out.println("\n Usunięto pozycję " + index);
            printHistory();

        } while (index > calcHistList.size() & index < 0);

    }
}
