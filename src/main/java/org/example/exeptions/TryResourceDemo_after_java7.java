package org.example.exeptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TryResourceDemo_after_java7 {

    public static void main(String[] args) {

        //nie trzeba zamykać źródła w try with resources ponieważ implementuje interfejs autocloseable
        try (PrintWriter printWriter = new PrintWriter(new File("mytestfile_TryWithResources.txt"))) {
            printWriter.write("Test 1 2 3 \n");
            printWriter.write("Test 1 2 3 \n");
            printWriter.write("Test 1 2 3 \n");
            printWriter.write("Test 1 2 3 \n");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}