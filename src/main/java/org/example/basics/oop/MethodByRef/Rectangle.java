package org.example.basics.oop.MethodByRef;

public class Rectangle {

    //tworzę sobie obiekt
    float side1;
    float side2;
    float surfaceArea;

    float circuit;

    //kontsruktor robię ale tylko z dwóch boków bo to one służą do obliczenia powieszchni
    public Rectangle(float s1, float s2) {
        this.side1 = s1;
        this.side2 = s2;
    }
}
