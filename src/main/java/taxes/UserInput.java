package javaStart.taxes;

import java.util.Scanner;

public class UserInput {

    static Scanner sc = new Scanner(System.in);

    public static String currency() {
        return sc.nextLine();
    }

    public static double profit() {
        System.out.println("Enter your profit: ");
        return Double.parseDouble(sc.nextLine());
    }
}
