package org.example;


public class Test {


    public static void main(String[] args){
        Test t = new Test();
        t.method1();
    }

    public void method1(){
        method2();
    }

    public void method2(){
        try{
            throw new NullPointerException();
        }catch(NullPointerException e){
            throw e;
        }
    }
}