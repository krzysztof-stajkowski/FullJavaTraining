package org.example.data.operators;

public class op1_basics {
    public static void main(String[] args) {
        int a = 10;
        int b, c;

        //operator przypisania oblicza od prawej
        c = b = a + 5;
        System.out.println("c:" + c + " b:" + b);

        int v = (100 * 2) / 5 + 20;
        System.out.println("v:" + v);

        System.out.println("modulo 20 % 7 = " + 20%7) ;
    }
}
