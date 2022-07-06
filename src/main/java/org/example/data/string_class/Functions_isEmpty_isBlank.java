package org.example.data.string_class;

public class Functions_isEmpty_isBlank {
    public static void main(String[] args) {
        String emptyStr = ""; //zwraca TRUE jeśli lenght = 0 i tylko to
        String blankStr = "  \n       "; //zwraca TRUE jeśli lenght = 0 lub treść tospacje, tabulacje itd.

        if(emptyStr.isEmpty()) {
            // true
            System.out.println("emptyStr jest pusty - isEmpty()");
        }

        if(blankStr.isEmpty()) { // false
            // true
            System.out.println("blankStr jest pusty - isEmpty()");
        } else {
            System.out.println("blankStr nie jest pusty - isEmpty()");
        }

        if(emptyStr.isBlank()) {
            // true
            System.out.println("emptyStr ma 0 znaków lub same białe znaki - isBlank()");
        }

        if(blankStr.isBlank()) {
            // true
            System.out.println("blankStr 0 znaków lub same białe znaki - isBlank()");
        }
    }
}
