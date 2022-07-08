package org.example.excercises.FlowControl;

public class ForEachEx {
    public static void main(String[] args) {
        /*
            Zapisz tablicę liczb całkowitych od 0 do 5 w zmiennej numbers.
            Użyj pętli for each aby przejść po całej tablicy
            i dodaj do siebie wszytkie elementy.
            Sumę elementów zaprezentuj po pętli w konsoli.
         */

int numbersArr[] = {0,1,2,3,4,5};

int sum = 0;

        for (int x : numbersArr) {

            sum += x;

        }

        System.out.println(sum);
    }
}