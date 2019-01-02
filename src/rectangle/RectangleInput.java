package rectangle;

import java.util.Scanner;

public class RectangleInput {
    Scanner scanner = new Scanner(System.in);
    public String readLineHeight() {
        System.out.println("Enter height for rectangle: ");
        String height = scanner.nextLine();
        return height;
    }
    public String readLineLength () {
        System.out.println("Enter length for rectangle: ");
        String length = scanner.nextLine();
        return length;
    }
    public int parseStringToIntHeight(String height){
        return Integer.parseInt(height);
    }
    public int parseStringToIntLength(String length) {
        return Integer.parseInt(length);
    }
}
