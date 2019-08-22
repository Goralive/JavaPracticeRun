package rectangle;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    private Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getroom();
        Rectangle bathromm = calculator.getroom();

        double area = calculator.calculateTotalArea(kitchen,bathromm);

        System.out.println("Total area is: " + area);
        calculator.sc.close();
    }

    private double calculateTotalArea (Rectangle rectangle1, Rectangle rectangle2) {
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }

    public Rectangle getroom() {

        System.out.println("Enter the length of your room: ");
        double length = sc.nextDouble();

        System.out.println("Enter the width of you room: ");
        double width = sc.nextDouble();

        return new Rectangle(length, width);
    }
}
