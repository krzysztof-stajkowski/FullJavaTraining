package org.example.excercises.AnonimClass;

public class Animal {
    void makeSound() {
        System.out.println("Grrrrr");
    }

    void eat() {
        System.out.println("Eat eat eat");
    }

    private void move() {
        System.out.println("go go go");
    }

     class PetToy { //Inner Class ------------------
        //z klasy wewnętrznej można wywołać metody z klasy zewnętrznej nawet gdy metody w Parencie są private
        String name;

        void getName() {
            System.out.println(name);
        }

        void act(){
            System.out.println("Parent method 1");
            makeSound();
            System.out.println("Parent method 2");
            eat();
            System.out.println("Parent method 3 - private");
            move();
        }

    }


}
