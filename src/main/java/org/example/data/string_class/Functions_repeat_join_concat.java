package org.example.data.string_class;

public class Functions_repeat_join_concat {
    public static void main(String args[]) {

        String str = "Info";
        str = str.repeat(3);
        System.out.println(str); // InfoInfoInfo

        //Funkcja statyczna - nie musimy tworzyc nowego obiektu za pomocą new tylko od razu możemy wywołać taką funkcję
        String joinedText = String.join(" - ", "Raz", "Dwa", "Trzy");
        System.out.println(joinedText); // Raz - Dwa - Trzy

        String text = "Ola ".concat("ma") + " kota".concat(".");
        System.out.println(text); // Ola ma kota.

    }
}