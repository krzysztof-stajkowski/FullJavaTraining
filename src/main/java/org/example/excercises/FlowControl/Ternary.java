package org.example.excercises.FlowControl;

public class Ternary {
    public static void main(String[] args) {
        /*
            Użyj operator trójargumentowy aby sprawdzić
            czy liczba jest parzysta lub nieparzysta.
            Zastosuj operator modulo, który jesli zwróci 0
            to wskarze parzystą liczbę.
            Pokaż informację o wyniku w konsoli.
         */

        int testNumber = 6;

        int result = testNumber%2==0 ? 1 : 0;

        if (result==1){
            System.out.println("Parzysta");
        }else{
            System.out.println("Nieparzysta");
        }



    }
}

