package org.example.tasks.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class findWordsStartingFrom {

    private static final String DIAKRYTYCZNE = "ąćęłńóśźżĄĆĘŁŃÓŚŻŹ";

    public static void main(String[] args) {
        String text = "Zaimek, to jest tekst zawierający znaki interpunkcyjne. ten tekst zawiera " +
                "także nawiasy (właśnie takie), więc rozwiązanie może nie być takie proste. Zamość.";

        //find words starting from 'za'
        Pattern pattern = Pattern.compile("(?i)(^|[^a-z"+DIAKRYTYCZNE+"])(za[a-z" + DIAKRYTYCZNE + "]*)");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.println(matcher.group(2)); //jest to druga grupa a mamy na górze dwie w nawiasach
        }
    }

}
