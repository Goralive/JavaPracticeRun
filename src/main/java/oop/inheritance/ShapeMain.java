package oop.inheritance;

public class ShapeMain {
    public static void main(String[] args) {


      //  UserInput board = new UserInput();
    //    board.addFigureOnBoard();
        Triangle triangle = new Triangle(new Point(1,3),new Point(2,-5), new Point(-8,4));
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());
    }
}
