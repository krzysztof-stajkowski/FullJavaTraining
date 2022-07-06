package org.example.data.string_class;

public class StringsComparison {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "HELLo";

        if(s2.equals(s1)) System.out.println("s2 równe jest s1 -> użyto funkcji equals do porównywania Stringów");

        if(s3.equals(s1)) System.out.println("s3 nie jest równe s1 - wielkość liter inna  -> użyto funkcji equals do porównywania Stringów"); // false

        if(s1.equalsIgnoreCase(s3)) System.out.println("s1 równe jest s3 - wielkość znaków ignorowana.");

        System.out.println("-----------------");

        String t1 = "Hello";
        String t2 = "He"; //t1 i t2 nie są współdzielone bo są to dwa różne teksty
        String t3 = t2 + "llo"; //operator konkatenacji tworzy nowy String Hello

        if(t1 == t3) {
            System.out.println(true);
        } else {
            System.out.println("t1" + " oraz " + "t2 nie są równe sobie mimo że mają taki sam ostatecznie tekst\n");
        }

        System.out.println("-----------------PORÓWNYWANIE METODĄ EQUALS");

        String str1 = "Hello";
        String str2 = "He";
        String str3 = str2 + "llo";

        if(str1.equals(str3)) {
            System.out.println(str1  + " jest tym razem równy " + str3);
            System.out.println("Gdyby w obu Stringach były różne wielkości znaków wtedy używamy equalsIgnoreCase");
        } else {
            System.out.println(false);
        }

    }
}
