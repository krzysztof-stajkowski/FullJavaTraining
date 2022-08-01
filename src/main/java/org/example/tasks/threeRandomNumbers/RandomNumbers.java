package org.example.tasks.threeRandomNumbers;

import java.util.HashSet;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        Random random = new Random();
        HashSet losoweLiczby = new HashSet<>();

        while(losoweLiczby.size() < 3){
            losoweLiczby.add(random.nextInt(10+1));
        }
        //stream
        losoweLiczby.forEach(liczba -> System.out.println(liczba));
    }
}
