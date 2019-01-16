package oop.phone;


import java.util.List;

public class Phone {
    private String telephoneNumber;
    private Network network;

    public Phone(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    void call(Phone phone) {

    }

    void registrationInNetwork(Network network) {
        List<Phone> tempPhone = network.getPhones();
        tempPhone.add(this);
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }
}



