package org.example.basics.constructor.const_V3;

public class Point3 {
    int x;
    int y;

    Point3() {

    }

    public Point3(int n1, int n2) { // nie zalecane - powinno być this.x = x i a parametrach int x nie n1 itp.
      x = n1;
      y = n2;
    }
}
