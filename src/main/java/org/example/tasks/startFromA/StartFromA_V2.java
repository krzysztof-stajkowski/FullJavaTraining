package org.example.tasks.startFromA;

import java.util.ArrayList;

public class StartFromA_V2 {

    //static are loaded with a class initialization
    private static ArrayList<String> words = new ArrayList<>();

    static {
        words.add("abażur");
        words.add(null);
        words.add("Antek");
        words.add("Jacek");
        words.add("ananas");
        words.add("Gruszka");
        words.add("Marek");
    }

    public static void main(String[] args) {
        //show all starting from 'a' or 'A'
        words.stream()
                .filter(word -> word != null)
                .filter(word -> word.toLowerCase().charAt(0) == 'a')
                .forEach(System.out::println);  // (word ->  System.out.println(word);



    }
}
