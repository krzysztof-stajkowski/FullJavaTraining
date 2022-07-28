package org.example.basics.constructor.const_copyNewInstance_V5;

public class Main {
    public static void main(String[] args) {
        Point5 point5 = new Point5(10,20);

        System.out.println("x: " + point5.x); //10
        System.out.println("y: " + point5.y); //20

        Point5 point5A = new Point5(point5); //dzięki przekazaniu do konstruktora typu point to można tak skopiować obiekt

        point5A.y = 99; //zmieniam tylko drugi element z konstruktora pierwszego

        System.out.println("x2: " + point5A.x); //java działa na referencjach więc x1 i x2 będą już takie same niezależnie od 4 czy 4a
        System.out.println("y2: " + point5A.y); //99 <--!!!

        System.out.println("x1: " + point5.x); //10
        System.out.println("y1: " + point5.y); //20

    }
}
