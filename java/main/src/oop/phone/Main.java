package oop.phone;

public class Main {
    public static void main(String[] args) {

        System.out.println("Greetings,\nPlease enter your telephone number: ");
        Phone phone = new Phone();
        Network network = new Network();
        network.numberRegistration(phone.operatorRegistration());
        phone.call(network.verifyPhoneNumberInDatabase(phone.number));

    }
}
