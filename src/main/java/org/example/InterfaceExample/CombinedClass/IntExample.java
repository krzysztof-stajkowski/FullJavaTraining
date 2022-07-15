package org.example.InterfaceExample.CombinedClass;

interface WaterBottleInterface {
    String color = "Blue";

    void fillUp();
    void pourOut();

}


public class IntExample implements WaterBottleInterface {
    public static void main(String[] args) {

        System.out.println("Attribite color from the intefece is: " + color);

    IntExample example = new IntExample();
    example.fillUp();
    example.pourOut();

    }

    @Override
    public void fillUp() {
        System.out.println("Filled up");
    }

    @Override
    public void pourOut() {
        System.out.println("Poured out");
    }
}
