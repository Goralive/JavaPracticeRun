package oop.phone;

import java.util.Scanner;

public class InputNumber {
    private int telephoneNumberLength = 10;
    String telephoneNumber;
    Scanner sc = new Scanner(System.in);
    private boolean userChoiceResult;


    public String userInputTelephoneNumber() {
        System.out.println("Hello type the telephone number, if the telephone in the database, we will call it");
        telephoneNumber = sc.nextLine().replaceAll("\\D", "");
        while (telephoneNumber.length() != telephoneNumberLength) {
            System.out.println("Your number doesn't fit the requirements. Should have length of " + telephoneNumberLength + " characters");
            userInputTelephoneNumber();
        }
        return telephoneNumber;
    }

    public boolean userChoice() {
        switch (sc.nextLine().toLowerCase()) {
            case ("yes"):
                userChoiceResult = true;
                break;
            case ("no"):
                userChoiceResult = false;
            break;
            default:
                System.out.println("You can choose only yes or no");
                userChoice();
        }
        return userChoiceResult;
    }
}