package org.example.wzorceProjektowe;

public class MainFactory { // method that creates objects by hiding complex logic

    public static void main(String[] args) {
      //  new Car(); //instancja obiektu - zamiast tego użyjemy metody createCar jako wzorzec Fabryka czyli metode która tworzy obiekty
        createCar(); //tworzę n obiektów dzięki fabryce
        createCar();
        createCar();
        createColorCar("Zielony"); //w zależności od konstruktorów mogę tworzyć różne warianty
        createColorCar("Niebieski");
    }

    //factory pattern - jest to metoda statycna dzięki której nie musimy tworzyć instancji klasy aby skorzystac z metody
    public static Car createCar(){
        return new Car();
    }

    public static Car createColorCar(String color){
        return new Car(color);
    }
    public static class Car { //instancja klasy
        Car() {//konstruktor
            System.out.println("Car created");
        }

        Car(String color) {//konstruktor
            System.out.println("Color car created - " + color);
        }

    }


}
