package org.example.data.types;

public class J09_string {
    public static void main(String args[]) {
        String s1 = "string #1";
        String s2 = new String("str #2");

        String s3 = s1 + s2;
        System.out.println(s3.toUpperCase());

        String s4 = "Wiersz #1 \n \t wiersz #2 \n \\ \" \u263A ";
        System.out.println(s4);

    }
}
