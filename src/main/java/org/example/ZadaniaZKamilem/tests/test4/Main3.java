package org.example.ZadaniaZKamilem.tests.test4;

public class Main3 {
    public static void main(String[] args) {
        One one = new One();
        one.process();

        Two two = new Two();
        two.process2();

        Test test = new Test() {
            @Override
            public void process2() {
                process();
            }
        };

        test.process2();

    }
}
