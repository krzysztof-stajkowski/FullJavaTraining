package org.example.excercises.LMS_excercises.LMS_flows;

public class zad5 {
    public static void main(String[] args) {

        int resultFor = 0;
        int resultWhile = 0;

        for (int i = 0; i <= 10; i++) {
            resultFor += i;
        }

        int j = 0;
        while (j <= 10) {

            resultWhile += j;
            j++;
        }


        System.out.println("ResultFor: " + resultFor);
        System.out.println("ResultWhile: " + resultWhile);
    }
}
