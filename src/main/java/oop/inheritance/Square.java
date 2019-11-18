package oop.inheritance;

public class Square extends Shape {
    private final String name = "Square";
    private Point a;
    private Point b;
    private Point c;
    private Point d;
    private double sideA;

    public String getName() {
        return name;
    }

    public Square(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.sideA = a.getDistance(a, c);
    }

    public Square(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public double getPerimeter() {
        return 4 * sideA;
    }

    @Override
    public double getArea() {
        return sideA * sideA;

    }
}
