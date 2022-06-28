package org.example.data;

public class EnumExample {

    //typ wyliczeniowy
    enum SoundVolume {LOW, MEDIUM, HIGH, VERY_HIGH}
    enum CarVariant {SEDAN, COMBI, SUPER_CAR}


    public static void main(String[] args) {

        SoundVolume phoneSound = SoundVolume.LOW;
        System.out.println(phoneSound);
    }

}