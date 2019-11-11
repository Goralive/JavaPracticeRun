package oop.inheritance;

public class Triangle extends Shape {
    private final String name = "Triangle";

    private Point a;
    private Point b;
    private Point c;

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public double getPerimeter() {
        sideA = a.getDistance(a, b);
        sideB = b.getDistance(b, c);
        sideC = c.getDistance(a, c);
        return sideA + sideB + sideC;
    }

    @Override
    public double getArea() {
        double polP = getPerimeter() / 2;
        return Math.sqrt(polP * (polP - sideA) * (polP - sideB) * (polP - sideC));
    }
}
