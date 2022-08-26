package org.example;

public class Test_v1 {

    public static void main(String[] args) {
        One one = new Two();
        one.className();
    }
}

class One {
    public void className() {
        System.out.println("Parent");
    }
}

class Two extends One {
    @Override
    public void className() {
        System.out.println("Child");
    }
}

