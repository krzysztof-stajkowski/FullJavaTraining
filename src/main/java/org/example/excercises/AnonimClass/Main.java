package org.example.excercises.AnonimClass;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Animal(){ // przykład klasy anonimowej gdy podcza tworzenia obiektu nadpisujemy metodę z parenta a reszta pozostaje jak w parencie
            @Override
            void makeSound() {
               // super.makeSound();
                System.out.println("Miau");
            }
        };

        cat.makeSound();

        Animal dog = new Animal();
        dog.makeSound();

        cat.eat();
        dog.eat();

    }
}
