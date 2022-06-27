package org.example.data.types;

public class J01_variable_declaration {
    public static void main(String args[]){

        int number = 24;
        number = 98;
        System.out.println("Wartość to " + number);

        int data = -123;
        System.out.println("Wartość to " + data);

        number = data * 2;
        System.out.println("Nowa wartość to " + number);
    }
}
