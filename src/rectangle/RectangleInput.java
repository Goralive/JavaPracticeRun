package rectangle;

import java.util.Scanner;

public class RectangleInput {
    static Scanner scanner = new Scanner(System.in);

    static public String readLineHeight() {
        System.out.println("Enter height for rectangle: ");
        String height = scanner.nextLine();
        return height;
    }

    static public String readLineLength() {
        System.out.println("Enter length for rectangle: ");
        String length = scanner.nextLine();
        return length;
    }

    static public int parseStringToIntHeight(String height) {
        return Integer.parseInt(height);
    }

    static public int parseStringToIntLength(String length) {
        return Integer.parseInt(length);
    }
}
