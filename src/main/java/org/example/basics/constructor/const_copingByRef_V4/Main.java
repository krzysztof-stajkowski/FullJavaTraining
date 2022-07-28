package org.example.basics.constructor.const_copingByRef_V4;

public class Main {
    public static void main(String[] args) {
        Point4 point4 = new Point4(10,20);

        System.out.println("x: " + point4.x);
        System.out.println("y: " + point4.y);

        Point4 point4a = point4;

        point4a.x = 0;
        point4a.y = 20;


        System.out.println("x2: " + point4a.x); //java działa na referencjach więc x1 i x2 będą już takie same niezależnie od 4 czy 4a
        System.out.println("y2: " + point4a.y);

        System.out.println("x1: " + point4a.x);
        System.out.println("y1: " + point4a.y);

    }
}
