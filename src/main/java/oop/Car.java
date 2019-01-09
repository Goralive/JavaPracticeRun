package oop;

public class Car {
    String color;
    double weight;
    int year;
    private double velosity = 0;

    Car(String color, double weight, int year) {
        this.color = color;
        this.weight = weight;
        this.year = year;
    }

    void beep() {
        System.out.println("BEEP-BEEP!!!");
    }

    void acceleration(
            double a) {
        velosity = velosity + a;
    }

    void deceleration(double b) {
        if (velosity - b >= 0) velosity = velosity - b;
    }

    void print() {
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
        System.out.println("Year car: " + year);
        System.out.println("Velosity: " + velosity);
    }

    Car repaint (Car a, String newcolor) {
        a.color = newcolor;
        return a;
    }
}

