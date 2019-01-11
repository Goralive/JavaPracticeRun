package oop.phone;

import java.util.Scanner;

public class Phone {
    private String telephoneNumber;
    Network network = new Network();


    String userInput() {
        System.out.println("Please enter your telephone with (+380): ");
        Scanner sc = new Scanner(System.in);
        telephoneNumber = sc.nextLine();
        if (telephoneNumber.length() == 13 && telephoneNumber.contains("+380")) {
            return telephoneNumber;
        } else {
            System.out.println("Your number is incorrect. Number should contain 13 chars and start from +380\nPlease try again\n");
            userInput();
        }
        return userInput();
    }

    void call() {
        if (network.verifyPhoneNumberInDatabase(telephoneNumber)) {
            System.out.println("Calling " + this.telephoneNumber);
        } else {
            System.out.println("No number in the database");
        }
    }

    void registrationInNetwork() {
        userInput();
        System.out.println("Your number will be added to database");
        network.numberRegistration(telephoneNumber);

    }
}



