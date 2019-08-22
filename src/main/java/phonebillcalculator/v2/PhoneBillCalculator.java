package phonebillcalculator.v2;

import java.util.Scanner;

public class PhoneBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhoneBill phoneBill = new PhoneBill(1,890,899,82.45);
        PhoneBill phoneBill1 = new PhoneBill(8);
        PhoneBill phoneBill2 = new PhoneBill();
        phoneBill.printItemizedBill();
        phoneBill1.printItemizedBill();
        phoneBill2.printItemizedBill();
    }
}
