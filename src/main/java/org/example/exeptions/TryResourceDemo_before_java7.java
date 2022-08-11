package org.example.exeptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TryResourceDemo_before_java7 {

    public static void main(String[] args) {
        PrintWriter printWriter = null;
        try {
             printWriter = new PrintWriter(new File("mytestfile1.txt"));
        } catch (FileNotFoundException e) {

        } finally {
            printWriter.close();
        }


    }
}
