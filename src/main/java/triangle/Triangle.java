package triangle;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write an intenger for Triangle creation: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print("*");

            }
            for (int c = 1; c < i; c++) {
                System.out.print(" ");
                if (c == i - 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int k = n; k > 0; k--) {
            System.out.print("*");
        }

    }

}


