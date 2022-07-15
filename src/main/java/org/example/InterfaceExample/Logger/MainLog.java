package org.example.InterfaceExample.Logger;

public class MainLog {
    public static void main(String[] args) {

        Logger loggerC = new ConsoleLogger();
        Logger loggerF = new FileLogger();

        loggerC.log("Testuję logera");
        loggerF.log("Testuję logera");

        //loguję błąd do pliku
        loggerF.log("Testuję error text");



    }
}
