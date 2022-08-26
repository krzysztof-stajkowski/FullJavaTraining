package org.example.multiThread;

public class MT_Main {
    public static void main(String[] args) {
        Multithreading myThing = new Multithreading();
        Multithreading myThing2 = new Multithreading();

        myThing.start(); //musi być start aby zadziałało wielowątkowo (nie run)
        myThing2.start();
    }
}
