package oop.phone2;

public class Main {
    public static void main(String[] args) {
        Phone vladimirPhone = new Phone("+380634486655");
        Phone randomTelephone = new Phone("+380673332233");
        Network kievstar = new Network("Kievstar", randomTelephone);

        vladimirPhone.registrationInTheNetwork(kievstar);
        boolean callingNumber = kievstar.isNumberInNetwork(vladimirPhone,kievstar);
        vladimirPhone.call(callingNumber);

    }
}
