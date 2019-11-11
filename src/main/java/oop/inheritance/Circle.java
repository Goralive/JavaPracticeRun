package oop.inheritance;

public class Circle extends Shape {
    private Point centrePoint;
    private Point pointOnCircle;

    public Circle(Point centrePoint, Point pointOnCircle) {
        this.centrePoint = centrePoint;
        this.pointOnCircle = pointOnCircle;
    }

    double calculateRadius () {
        return 0;
    }

    /*double calculateDiameter() {
        return (centrePoint - pointOnCircle);
    }
*/
    @Override
    public double getPerimeter() {
        System.out.println("shape of the circle");
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
