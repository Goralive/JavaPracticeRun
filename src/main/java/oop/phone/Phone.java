package oop.phone;


public class Phone {
    private InputNumber inputNumber  = new InputNumber();
    private Network network = new Network();


    public void call() {
        String telephoneNumber = inputNumber.userInputTelephoneNumber();
        if (network.isPhoneNumberInDatabase(telephoneNumber)) {
            System.out.println("Calling number " + telephoneNumber);
        }
    }
}



