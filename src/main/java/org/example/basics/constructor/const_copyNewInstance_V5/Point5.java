package org.example.basics.constructor.const_copyNewInstance_V5;

public class Point5 {
    int x;
    int y;

    Point5(Point5 p) {
        x = p.x;
        y = p.y;
    }

    public Point5(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
