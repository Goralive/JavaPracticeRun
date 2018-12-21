package rectangle;


import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value for rectangle: ");

        int userValue = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < userValue; i++) {
            for (int j = 0; j < userValue; j++) {
                if (i == 0 || i == userValue - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}

