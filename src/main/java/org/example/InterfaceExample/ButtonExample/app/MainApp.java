package org.example.InterfaceExample.ButtonExample.app;

import java.sql.SQLOutput;

public class MainApp {
    public static void main(String[] args) throws InterruptedException {

        Screen1 screen1 = new Screen1();
        System.out.println("Aplikacja uruchomiona");

        Thread.sleep(3000);
        screen1.getButton().click();
    }
}
