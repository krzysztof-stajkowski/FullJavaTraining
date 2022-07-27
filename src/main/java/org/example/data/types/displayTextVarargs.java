package org.example.data.types;

public class displayTextVarargs {
    public static void displayText(String... words){

        for (String word : words){
            System.out.println(word);
        }

    }

    public static void main(String[] args) {
        displayText();
        displayText("hej");
        displayText("hej you");
        displayText("hej you welcome");

    }
}
