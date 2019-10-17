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
        boolean isFound = false;
        for (Phone phone : network.getPhoneList()) {
            if (phone.getTelephoneNumber() == phoneNumber.getTelephoneNumber()) {
                isFound = true;
                break;
            }
        }
        if(isFound) {
            System.out.println("Calling number " + phoneNumber.getTelephoneNumber());
        } else {
            System.out.println("No number in database " + phoneNumber.getTelephoneNumber());
        }
    }
}

