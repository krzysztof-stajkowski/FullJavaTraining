package org.example.basics.oop.oopEx.shapes;

public class Shape {

    int x;
    int y;
    String color;

    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public String getDescription() {
        return String.format("(%s, %s i %s)", this.x, this.y, this.color);
    }

    public double getDistance(Shape obj) {
        // sqrt((xA - xB)^2 + (yA-yB)^2)
        return Math.sqrt(
                Math.pow(this.x - obj.x, 2) + Math.pow(this.y - obj.y, 2)
        );
    }
}
