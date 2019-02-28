package oop.inheritance;

public class Triangle extends Shape {
    private Point a;
    private Point b;
    private Point c;
    private final String name = "Triangle";

    Point pointA = new Point(1,1);
    Point pointB = new Point(2,2);
    Point pointC = new Point(2,2);

    public Triangle() {
        super();

    }

    public String getName() {
        return name;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }



    @Override
    double getPerimeter() {
        // a + b + c
        return 0 ;
    }

    @Override
    double getArea() {
//        double polP = (a + b + c) / 2;
//        Math.sqrt(polP*(polP-a)*(polP-b)*(polP-c));
        return 0;
    }
}
