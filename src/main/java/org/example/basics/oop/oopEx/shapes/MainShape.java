package org.example.basics.oop.oopEx.shapes;

public class MainShape {
    public static void main(String[] args) {

        Shape s1 = new Shape(2,3,"red");
        Shape s2 = new Shape(4,5,"green");

        System.out.println(s1.getDescription());
        System.out.println(s2.getDescription());

        System.out.println(s1.getDistance(s2));
        System.out.println(s2.getDistance(s1));



    }
}
