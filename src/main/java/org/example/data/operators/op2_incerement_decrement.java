package org.example.data.operators;

public class op2_incerement_decrement {
    public static void main(String[] args) {
        int a = 10;
        a++; //a--
        System.out.println("a++ " + a);

        int b = 5;
        int c = 10 + b++;
        System.out.println("c: " + c); //15
        System.out.println("b: " + b); //6

        int d = 5;
        int e = 10 + ++d; //inkrementacja PRZEDrostkowa
        System.out.println("d: " + d); //6
        System.out.println("e: " + e); //16


    }
}
