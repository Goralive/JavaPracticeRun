package oop.inheritance;

public class Triangle extends Shape {
    private final String name = "Triangle";

   private Point a = new Point(1,1);
   private Point b = new Point(2,2);
   private Point c = new Point(2,2);

    public Triangle() {
        super();

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
