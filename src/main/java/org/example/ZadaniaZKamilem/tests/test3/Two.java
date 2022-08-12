package org.example.ZadaniaZKamilem.tests.test3;

public class Two extends One {

    int x;
    int y;

    public Two(){
    }

    public Two(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void print(int b) {
        System.out.println("Child");
    }
}
