package org.example.basics;

import java.util.Arrays;

public class CustomException extends Exception {

    //Dziedzicząc z klasy Exception sprawiamy, że nowy typ wyjątku będzie wyjątkiem kontrolowanym.
    public CustomException(String message) { //Konstruktor z parametrem message umożliwia przekazanie komunikatu podczas rzucania wyjątku.
        super(message);
    }

    public static void printArray(int[] data) throws CustomException {
        if (data.length > 100) {
            throw new CustomException("Array can't exceed 100 items!");
        }
        String elements = Arrays.toString(data);
        System.out.println(elements);
    }

    public static void main(String[] args) {
        int[] data = new int[101];
        Arrays.fill(data, 2);
        try {
            printArray(data);
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }
}
