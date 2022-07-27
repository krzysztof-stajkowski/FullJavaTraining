package org.example.basics.oop.oopEx.inheritance_override;

public class Book {
    public String name;
    public double price;
    public String author;

    public void printBook(){ // metoda rodzica
        System.out.println("Printing ...");
    }

    //Metody statyczne nie podlegają polimorfizmowi.
    //Metoda statyczna w klasie pochodnej ukrywa metodę statyczną w klasie rodzica.
    //Przy Alt+Ins nie pojawi się przy próbie overridowania
    public static void hiddenMethod(){
        System.out.println("ParentHiddenMethod");
    }

}
