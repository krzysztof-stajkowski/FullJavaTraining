package org.example.excercises.LMS_excercises.zadania.calc1;

public class Calculator {

    private String[] calcHistory;

    public Calculator() {
        this.calcHistory = new String[0];
    }

    public String[] getCalcHistory() {
        return calcHistory;
    }

    public void setCalcHistory(String[] calcHistory) {
        this.calcHistory = calcHistory;
    }
}

