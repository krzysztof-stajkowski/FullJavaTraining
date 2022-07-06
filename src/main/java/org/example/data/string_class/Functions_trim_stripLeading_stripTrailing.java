package org.example.data.string_class;

public class Functions_trim_stripLeading_stripTrailing {
    public static void main(String[] args) {
        String str = "   \n \n  Hello World!       \n  "; // spacje (białe znaki) i np. znaki nowej linii \n
        String str2 = str.trim(); //kasuje białe znaki na początku i końcu Stringa
        System.out.println( "\"" + str2 + "\"" ); //aby zapisac cudzysłów w cudzysłowiu tworzymy "\"" - znak ucieczki

        String str3 = str.stripLeading(); //kasuje białe znaki na początku Stringa
        System.out.println( "\"" + str3 + "\"" );

        String str4 = str.stripTrailing(); //kasuje białe znaki na końcu Stringa
        System.out.println( "\"" + str4 + "\"" );

    }
}