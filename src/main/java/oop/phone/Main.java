package oop.phone;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("333");
        Phone phone1 = new Phone("555");
        Phone phone2 = new Phone("777");

        Network network = new Network();

        phone.registrationInNetwork(network);
        phone1.registrationInNetwork(network);
        phone.call(phone2);

    }
}
