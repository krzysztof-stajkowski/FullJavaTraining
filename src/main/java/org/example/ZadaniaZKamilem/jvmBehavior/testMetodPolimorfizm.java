package org.example.ZadaniaZKamilem.jvmBehavior;

public class testMetodPolimorfizm {

//Can two Java methods have the same name with different return type?
// The return type of the methods are different and they are declared with the same method's name.

    static int getNumber(String x) {
        return 5;
    }

    static String getNumber(int x) {
        return "aaa";
    }


    public static void main(String[] args) {

        getNumber(5);
        getNumber("ddd");

    }
}
