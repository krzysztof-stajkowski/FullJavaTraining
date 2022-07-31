package org.example.tasks.tabRev;

public class Rev {
    public static void main(String[] args) {

        //replace 1 with 5 - leave rest untouched with no variables
        int[] numbers = {2,4,6,8,10};

        numbers[0] = numbers[0] + numbers[numbers.length -1];
        numbers[numbers.length -1] = numbers[0] - numbers[numbers.length -1];
        numbers[0] = numbers[0] - numbers[numbers.length -1];

        for (int number:numbers) {
            System.out.print(number + " ");
        }

    }
}
