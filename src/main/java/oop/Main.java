package oop;

public class Main {
    public static void main(String[] args) {
        Car car = new Car ("Yellow",1500,2010);
        car.beep();
        car.print();
        car.repaint(car,"Blue");
        System.out.println(car.color);

    }
}
