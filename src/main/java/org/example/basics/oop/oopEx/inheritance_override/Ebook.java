package org.example.basics.oop.oopEx.inheritance_override;

public class Ebook extends Book{
    public int sizeInMB;
@Override //może być adnotacja ale nie musi - zaleca się by była
    public void printBook(){ //metoda dziecka oraz pobranie metody rodzica dzięki super
        System.out.println("Printing Ebook");
        super.printBook();
    }
}
