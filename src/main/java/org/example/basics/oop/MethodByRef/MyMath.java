package org.example.basics.oop.MethodByRef;

public class MyMath {
    //parametr przekazywany przez referencję

    //tworzę sobie metodę która z obiektu obliczy trzecie pole czyli surfaceArea
    public void calcRectangleSurface(Rectangle rectangle) {
        rectangle.surfaceArea = rectangle.side1 * rectangle.side2;
    }

    public void circuit(Rectangle rectangle) {
        rectangle.circuit = (rectangle.side1 + rectangle.side2) * 2;
    }
}
