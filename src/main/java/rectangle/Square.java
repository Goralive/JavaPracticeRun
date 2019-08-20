package rectangle;

public class Square extends Rectangle {

    public double calculatePerimeter() {
        return length * width;
    }

    public void print (String print) {
        System.out.println(print);
    }
}
