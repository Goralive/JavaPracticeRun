package rectangle;

import java.util.Scanner;

public class RectangleInput {
    static Scanner scanner = new Scanner(System.in);

    static public String readLine() {
        String line = scanner.nextLine();
        return line;
    }

    static public int parseStringToInt(String line) {
        return Integer.parseInt(line);
    }
}
