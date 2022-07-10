package org.example.basics.oop;

//package access
class Car{
    String manufacturer;
    String name;
    int year;
    String color;
    float topSpeed;

    //constructor
    public Car(String manufacturer, String name, String color, int year, float topSpeed){
        this.manufacturer = manufacturer;
        this.name = name;
        this.year = year;
        this.color = color;
        this.topSpeed = topSpeed;
    }

    public Car(){
        this.manufacturer = "unknown";
    }

    //method
    public void printInfo() {
        System.out.println(this.manufacturer + " "
        + this.name + " "
        + this.year);
    }

}

public class CarExample {
    public static void main(String[] args) {

        Car ford = new Car();
        ford.manufacturer = "Ford";
        ford.name = "Mustang";
        ford.color = "blue";
        ford.year = 1967;
        ford.topSpeed = 200.0f;

        ford.printInfo();

        Car chevrolet = new Car();
        chevrolet.manufacturer = "Chevrolet";
        chevrolet.name = "Camaro";
        chevrolet.color = "red";
        chevrolet.year = 2020;
        chevrolet.topSpeed = 300.0f;

        chevrolet.printInfo();

        Car dodge = new Car("Dodge","Viper","blue",1997,270.0f);
        dodge.printInfo();

    }
}
