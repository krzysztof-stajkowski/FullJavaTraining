package org.example.ZadaniaZKamilem.tests.test5;

public class Main5 {
    public static void main(String[] args) {

        //Inter inter = new Six();
        One one = new Five();  //to zadziała ponieważ five dziedziczy po klasie 4 kótra dziedziczy po 2 a 2 po 1
        Inter inter = new Four(); //to zadziała ponieważ inter tworzy obiekt z 4 który implementuje inter
        //Three three = new Four();

        Inter inter2 = new Inter() {
            @Override
            public void sound() {
                System.out.println("dzwięk z obiektu interfejs");
            }
        };

        // Inter inter2 = () -> System.out.println("dzwięk z obiektu interfejs"); - to samo jako lambda
        inter.sound();
        inter2.sound();

    }
}
