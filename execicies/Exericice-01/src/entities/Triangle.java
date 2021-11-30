package entities;

import java.lang.Math;

public class Triangle {

    public double a;
    public double b;
    public double c;

    public double area() {
        double perimeter = (a + b + c) / 2;
        double area = Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
        return area;
    }

}
