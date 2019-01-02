package rectangle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a value for height: ");
        int height = RectangleInput.parseStringToInt(RectangleInput.readLine());
        System.out.println("Enter a value for length: ");
        int length = RectangleInput.parseStringToInt(RectangleInput.readLine());
        DrawRectangle.drawLogic(height, length);
    }
}

