package org.example.basics.oop;

public class Student {


    String imie;
    String nazwisko;
    String miasto;
    int wiek;


    public Student() {
        this.imie = "Jan";
        this.nazwisko = "Kowalski";
        this.miasto = "Unknown";
        this.wiek = 0;
    }

    public Student(String imie, String nazwisko, String miasto, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miasto = miasto;
        this.wiek = wiek;
    }


    public void printBasicData() {
        System.out.println(this.imie + " " + this.nazwisko + " " + this.miasto + " " + this.wiek);
    }


    public static void main(String[] args) {

        Student student1 = new Student();

        Student student2 = new Student();
        student2.imie = "Piotr";
        student2.nazwisko = "Nowak";
        student2.miasto = "Warszawa";
        student2.wiek = 15;

        Student student3 = new Student("Jacek", "Kowalski", "Toruń", 22);


        student1.printBasicData();
        student2.printBasicData();
        student3.printBasicData();


    }
}
