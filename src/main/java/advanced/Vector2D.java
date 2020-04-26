package advanced;

public class Vector2D {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double length() {
        return Math.sqrt((x * x) + (y * y));
    }

    public double divide(double number1, double number2) {
        if (number1 == 0 || number2 == 0) {
            throw new ArithmeticException("Can't divide by zero");
        }
        return number1 / number2;
    }
}
