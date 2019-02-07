package oop.inheritance;

public class Triangle extends Shape {
    double a, b, c;

    @Override
    double getPerimeter() {
        return a + b + c;
    }

    @Override
    double getArea() {
        double polP = (a + b + c) / 2;
        return Math.sqrt(polP*(polP-a)*(polP-b)*(polP-c));
    }
}
