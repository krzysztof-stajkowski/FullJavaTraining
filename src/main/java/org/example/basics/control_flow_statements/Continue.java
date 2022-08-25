package org.example.basics.control_flow_statements;

/*

Dzięki tej instrukcji continue wychodzimy z pętli ale
jest ona dalej wykonywana np. możemy pominąć jakieś elementy na podstawie warunków IF

 */

public class Continue {
    public static void main(String[] args) {
        for(int a = 0; a < 10; a++) {
           if(a == 2 || a == 5 || a == 9) continue;
            System.out.println(a);
        }

    }
}