package oop.inheritance;

public class Square extends Shape {
    private final String name = "Square";
    private Point a = new Point(1,1);
    private Point b = new Point(6,1);
    private Point c = new Point(1,3);
    private Point d = new Point(6,3);

    public String getName() {
        return name;
    }

    @Override
    double getPerimeter() {
        return 0;
    }

    @Override
    double getArea() {
        return 0;
    }
}
