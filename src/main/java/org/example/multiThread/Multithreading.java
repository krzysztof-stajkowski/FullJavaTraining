package org.example.multiThread;

public class Multithreading extends Thread{ //muszę rozszerzać Thread

    @Override
    public void run(){
        for (int i = 1; i <= 5 ; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000); //to automatycznie otoczy try catchem
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }


}
