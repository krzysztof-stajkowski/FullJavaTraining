package org.example.data.operators;

public class Op6_concatenationOperator {
    public static void main(String args[]) {

        String s1 = " Hello ";
        String s2 = s1 + "World!"; // + to operator konkatenacji
        System.out.println(s2);

        int a = 5;
        int b = 3;
        int c = a + b;

        b += a; //inaczej b = b + a
        System.out.println(b);
    }
}
