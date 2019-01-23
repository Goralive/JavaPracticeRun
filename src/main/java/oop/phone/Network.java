package oop.phone;


import java.util.ArrayList;
import java.util.List;

public class Network {
    private String mobileNetwork;
    private Phone phone;


    private List<Phone> phones = new ArrayList();

    boolean verifyPhoneNumberInDatabase(Phone call) {
        for (Phone tempPhone : phones) {
            if (tempPhone.equals(call)) {
                return true;
            }
        }
        return false;
    }

    public String getMobileNetwork() {
        return mobileNetwork;
    }

    public void setMobileNetwork(String mobileNetwork) {
        this.mobileNetwork = mobileNetwork;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }
}
