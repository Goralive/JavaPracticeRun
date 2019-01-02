package rectangle;

import java.util.Scanner;

public class RectangleInput {

     public static String readLine() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        return line;
     }

     public static int parseStringToInt(String line) {
        return Integer.parseInt(line);
    }
}
