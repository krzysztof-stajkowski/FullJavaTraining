package org.example.data.types;

public class J11_2dArrays {
    public static void main(String args[]) {

        String strArr[][] = {
                {"1", "2", "3"},
                {"4", "5", "6"}
        };

        System.out.println(strArr[0][1]); //2
        System.out.println(strArr[1][2]); //6

        int numArr[][] = new int[3][4];
        numArr[1][2] = 100;

        int numRows = 10;
        int numCols = 15;
        int arr[][] = new int [numRows][numCols];

    }
}
