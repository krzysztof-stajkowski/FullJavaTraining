package org.example.basics.oop.MethodByRef;

public class MathMain {
    public static void main(String[] args) {

        //aby w metodzie main wykorzystać metody muszę stworzyć obiekty z obu klas
        MyMath math = new MyMath();

        //w tej klasie był konstruktor więc wypełniamy wartości
        Rectangle rectangle = new Rectangle(5f,10f);

        //następnie korzystając z drugiej klasy z metodą przez referencję dajemy do niej nasz obiekt powyższy
        math.calcRectangleSurface(rectangle);
        math.circuit(rectangle);

        //wyświetlamy w konsoli wartość z metody w klasie MyMath
        System.out.println(rectangle.surfaceArea);
        System.out.println(rectangle.circuit);

    }
}
