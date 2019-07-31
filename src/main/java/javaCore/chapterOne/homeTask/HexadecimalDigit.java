package javaCore.chapterOne.homeTask;

import java.util.Scanner;

public class HexadecimalDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter intenger value: ");
        int inputNumber = sc.nextInt();
        System.out.println("Your number in binary form:" + Integer.toBinaryString(inputNumber));
        System.out.println("Your number in octal form: " + Integer.toOctalString(inputNumber));
        System.out.println("Your number in hexadecimal form: " + Integer.toHexString(inputNumber));


    }
}
