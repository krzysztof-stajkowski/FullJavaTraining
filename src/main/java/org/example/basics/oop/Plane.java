package org.example.basics.oop;

public class Plane {

    float lenght;
    float width;
    float weight;
    String name;
    int engines;

    public Plane() {
        this.name = "Unknown name";
        this.width = 0f;
        this.weight = 0f;
        this.lenght = 0f;
        this.engines = 0;
    }

    public Plane(float lenght, float width, float weight, String name, int engines) {
        this.lenght = lenght;
        this.width = width;
        this.weight = weight;
        this.name = name;
        this.engines = engines;
    }

    public void showDimentions() {
        System.out.println("Długość: " + this.lenght + "\n Szerokość: " +  this.width + "\n Waga: " +  this.weight);
    }

    public void showOther() {
        System.out.println( "\n Name: " +  this.name + ", Liczba silników: " + this.engines);
    }

    public static void main(String[] args) {

        Plane plane1 = new Plane();
        Plane plane2 = new Plane();
        Plane plane3 = new Plane(100f,25.3f,300f,"Mig",8);

        plane1.showDimentions();
        plane2.showOther();
        plane3.showDimentions();
        plane3.showOther();


    }
}
