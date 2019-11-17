package oop.inheritance;

public class ShapeMain {
    public static void main(String[] args) {


        //  UserInput board = new UserInput();
        //    board.addFigureOnBoard();
        Shape triangle = new Triangle(new Point(1, 3), new Point(2, -5), new Point(-8, 4));
        Shape circle = new Circle(5);
        Shape square = new Square(new Point(1, 1), new Point(1, 3), new Point(3, 1), new Point(3, 3));

        System.out.println("Triangle perimeter " + triangle.getPerimeter());
        System.out.println("Triangle area " + triangle.getArea());

        System.out.println("Circle perimeter " + circle.getPerimeter());
        System.out.println("Circle area " + circle.getArea());

        System.out.println("Square area " + square.getArea());
        System.out.println("Square perimeter " + square.getPerimeter());

    }
}
