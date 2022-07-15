package org.example.InterfaceExample.Logger;

//implementacja 1 - będzie logował do konsoli
public class ConsoleLogger implements Logger {

    @Override
    public void log(String text) {
        //prosta implementacja
        System.out.println(text);
    }

    @Override
    public void error(String textEr) {
        System.out.println(textEr);
    }
}
