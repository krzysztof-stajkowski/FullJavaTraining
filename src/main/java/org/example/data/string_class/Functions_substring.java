package org.example.data.string_class;

public class Functions_substring {
    public static void main(String args[]) {

        String str = "Ola ma psa oraz kota";

        String frag1 = str.substring(7);
        System.out.println(frag1);

        String frag2 = str.substring(7, 10); //drugi parametr w praktyce to 9 (ten 10 to granica)
        System.out.println(frag2);

    }
}
