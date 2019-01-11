package oop.phone;


public class Phone {
    private String telephoneNumber;
    private Network network;

    public Phone(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    void call(Phone phone) {

    }

    void registrationInNetwork() {

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



