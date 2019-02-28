package oop.inheritance;

public class Square extends Shape {
    private final String name = "Square";

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
