package org.example.basics.control_flow_statements;

/**

 Info: jest możliwe zapisanie if bez bloku kodu, ale działa to tylko przy jednym else
 Nie jest to rekomendowana praktyka.

 */

public class IfStatement {
    public static void main(String[] args) {
        int a = 3;
        if (a > 5) {
            System.out.println(" a jest większe od 5");
        } else if (a == 2) {
            System.out.println(" a jest równe 2");
        } else if (a == 3) {
            System.out.println(" a jest równe 3");
        } else if (a == 4) {
            System.out.println(" a jest równe 4");
        } else {
            System.out.println(" Wartość a jest równa: " + a);
        }

        if (90 < 20) {
            System.out.println(" 9 < 20");
            System.out.println("x");
        } else {
            System.out.println(" nie jest spłeniony warunek");
        }


    }
}
