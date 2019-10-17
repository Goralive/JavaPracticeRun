package oop.phone2;

public class Phone {
    private String telephoneNumber;

    public Phone(String number) {
        this.telephoneNumber = number;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public void registrationInTheNetwork(Network network) {
        network.addTelephoneToPhoneList(Phone.this);
    }

    public void call(Phone phoneNumber, Network network) {
        if(network.isNumberInNetwork(phoneNumber)) {
            System.out.println("Calling number " +  getTelephoneNumber());
        } else {
            System.out.println("No number in database " + getTelephoneNumber());
        }
    }
}

