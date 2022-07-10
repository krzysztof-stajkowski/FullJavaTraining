package org.example.data.string_class;

public class StringVariousTests {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = new String(" World");
        StringBuilder StrB = new StringBuilder("Hello ");
        StrB.append(5);
        StrB.append(" World");

        System.out.println(str + str2);

        System.out.println("string builder: -------------");

        System.out.println(StrB);
        System.out.println(StrB.lastIndexOf("l"));
        StrB.delete(11,13);
        System.out.println(StrB);
        StrB.substring(5);
        System.out.println(StrB.substring(5).trim().toUpperCase());
        System.out.println(StrB.substring(5).trim().toLowerCase());

        System.out.println("string buffer: -------------");
        StringBuffer StrBuffer = new StringBuffer("Hi StringBuffer");
        int lenghtSB = StrBuffer.length();
        StrBuffer.append(" " + lenghtSB);

        System.out.println(StrBuffer);


    }
}
