package oop.phone;


import java.util.ArrayList;
import java.util.List;

public class Network {
    private List<String> phoneNumbers = new ArrayList();
    InputNumber input = new InputNumber();
    private boolean isTelephoneNumberInDatabase = false;



    public boolean isPhoneNumberInDatabase(String telephoneNumber) {
        for (String tempPhone : phoneNumbers) {
            if (tempPhone.equals(telephoneNumber)) {
                 isTelephoneNumberInDatabase = true;
            }
        }
        System.out.println("The number isn't in the database\nDo you want to add it? Yes/No");
        if (input.userChoice()){
            System.out.println("The number will be added to the network");
            phoneNumbers.add(telephoneNumber);
            isTelephoneNumberInDatabase = true;
        } else {
            System.out.println("You select No. The number isn't in the database and won't be added");
             isTelephoneNumberInDatabase = false;
        }
        return isTelephoneNumberInDatabase;
    }
}
