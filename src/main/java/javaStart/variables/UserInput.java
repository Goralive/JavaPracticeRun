package javaStart.variables;

import java.util.Scanner;

public class UserInput {
   static Scanner sc = new Scanner(System.in);
    public static int returnInt () {
        String userInput = sc.nextLine();
        return Integer.parseInt(userInput);
    }
    public static String returnLine () {
        return sc.nextLine();
    }


}
