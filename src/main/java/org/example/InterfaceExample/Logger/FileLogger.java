package org.example.InterfaceExample.Logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//implementacja 2 będzie logował do pliku
public class FileLogger implements Logger{

    @Override
    public void log(String text) {
        //loger do pliku

        try{
            File file = new File("logs.txt");
            FileWriter writer = new FileWriter(file);  //wymagana jest obsługa wyjątku i jeśli byśmy dodali ją tu w tej metodzie to musiałaby być identyczna w sygnaturze metody w interfejsie
                                                        //lepszym rozwiązaniem jest try catch
            writer.write(text+"\n");
            writer.close();
        }catch (IOException e){
            //ignore
        }

    }
}
