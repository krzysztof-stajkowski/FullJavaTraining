package org.example.data.string_class;

public class Functions_length_toLowerCase_toUppserCase_charAt {
    public static void main(String args[]) {

        String str = "Ola ma kota";
        System.out.println("ilość znaków: " + str.length() ); // ilość znaków: 11

        char sign = str.charAt(1);
        System.out.println("Znak pod indeksem 1: " + sign); // Znak pod indeksem 1: l

        String strUp = str.toUpperCase();
        System.out.println(strUp); // OLA MA KOTA

        String strLowerCase = str.toLowerCase();
        System.out.println(strLowerCase); // ola ma kota

        String str2 = "  ";
        String str3 = "  " ;
        System.out.println( str2.isBlank()); //nie działa gdy String jest null - mogą być Spacje - zwróci true
        System.out.println( str3.isEmpty()); //nie działa gdy String jest null - NIE mogą być Spacje - zwróci false


    }

}