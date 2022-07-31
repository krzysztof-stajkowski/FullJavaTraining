package org.example.tasks;

public class StringCompare {
    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "abc";

        /* == comparing a place in memory
           equals - comparing values
         */

        System.out.println(s1 == s2); //should show False but String Pool optimalization makes it True

        //String is immutable it means i can make it uppercase but the core will be as it was at creating it
        //StringBuilder is mutable, when changed it will remain changed

        StringBuilder sb = new StringBuilder();
        sb.append("abcd");
        sb.reverse();
        System.out.println(sb);


    }
}
