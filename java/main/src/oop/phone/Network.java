package oop.phone;

import java.util.ArrayList;
import java.util.List;

public class Network {
    List<String> telephoneDatabase = new ArrayList<String>();

    void numberRegistration(String number) {
        telephoneDatabase.add(number);
    }

    boolean verifyPhoneNumberInDatabase(String number) {
        return telephoneDatabase.contains(number);
    }
}

