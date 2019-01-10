package oop.phone;

import java.util.Scanner;

public class Phone {
    protected String number;

    String operatorRegistration() {
        Scanner sc = new Scanner(System.in);
        return number = sc.nextLine();
    }

    void call(boolean number) {
        if (number) {
            System.out.println("Calling " + this.number);
        } else {
            System.out.println("No number in the database");
        }
    }
}
