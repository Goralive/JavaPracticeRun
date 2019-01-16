package oop.phone;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("333");
        Network network = new Network();

        phone.registrationInNetwork(network);
    }
}
