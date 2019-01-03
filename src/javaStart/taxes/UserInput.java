package javaStart.taxes;

import java.util.Scanner;

public class UserInput {
    static Scanner sc = new Scanner(System.in);

    public static String currency() {
        return sc.nextLine();
    }

    public static int profit() {
        System.out.println("Enter your profit: ");
        int userValue = Integer.parseInt(sc.nextLine());
        return userValue;
    }
}
