package org.example.basics.control_flow_statements;

public class Forloop {
    public static void main(String[] args) {

        int arr[] = { 1, 5, 10, 15, 20 };

        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            System.out.println("arr: " + value);
        }

        System.out.println("-----------------");

        for (int i = 0; i < arr.length; i+=2) { //zwiększam index niestandardowo
            int value = arr[i];
            System.out.println("arr: " + value);
        }
        System.out.println("-----------------");

        String names[] = {"Ola", "Adam", "Kasia"};

        for (int i = names.length - 1; i >= 0; i-- ) { //iteracja od końca
            String str = names[i];
            System.out.println("Imię: " + str);
        }



    }
}
