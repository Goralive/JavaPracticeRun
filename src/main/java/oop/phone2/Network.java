package oop.phone2;

import java.util.ArrayList;
import java.util.List;

public class Network {
    private String networkName;
    private List<Phone> phoneList = new ArrayList();

    public Network(String name, Phone phone){
        this.networkName = name;
        phoneList.add(phone);
        }


    public void addTelephoneToPhoneList(Phone phoneNumber) {
        phoneList.add(phoneNumber);
    }

    public List<Phone> getPhoneList() {
        return phoneList;
    }
}
