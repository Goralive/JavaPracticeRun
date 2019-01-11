package oop.phone;

import java.util.ArrayList;
import java.util.List;

public class Network {
    List<String> telephoneDatabase = new ArrayList<String>();

    void numberRegistration(String number) {
        telephoneDatabase.add(number);
        System.out.println("The number " + number + " was added to database");
    }

    boolean verifyPhoneNumberInDatabase(String number) {
        return telephoneDatabase.contains(number);
    }
}

