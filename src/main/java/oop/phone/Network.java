package oop.phone;


import java.util.ArrayList;
import java.util.List;

public class Network {
    private String mobileNetwork;


    List <Phone> phones = new ArrayList();

    void numberRegistration(String number) {

    }

    void verifyPhoneNumberInDatabase(Phone number) {

    }

    public String getMobileNetwork() {
        return mobileNetwork;
    }

    public void setMobileNetwork(String mobileNetwork) {
        this.mobileNetwork = mobileNetwork;
    }
}
