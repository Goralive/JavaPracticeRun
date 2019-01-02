package rectangle;

public class DrawRectangle {
     public static void drawLogic(int height, int length) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == length - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
