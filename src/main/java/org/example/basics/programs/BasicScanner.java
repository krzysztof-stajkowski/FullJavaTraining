package org.example.basics.programs;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class BasicScanner {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Podaj swoje imie: ");
        String name = in.nextLine();

        System.out.println("Twoje imie to: " + name);

    }
}
