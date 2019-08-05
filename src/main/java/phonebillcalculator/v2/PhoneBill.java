package phonebillcalculator.v2;

import java.util.Scanner;

public class PhoneBill {
    private int id;
    private double allottedMinutes;
    private double usedMinutes;
    private double charge = 0.25;
    private double tax = 0.15;
    private double baseCost;

    public PhoneBill(){

    }

    public PhoneBill (int id) {
        this.id = id;
    }

    public PhoneBill(int id, double allottedMinutes, double usedMinutes, double baseCost) {
        this.id = id;
        this.allottedMinutes = allottedMinutes;
        this.usedMinutes = usedMinutes;
        this.baseCost = baseCost;
    }

    Scanner sc = new Scanner(System.in);

    public void

    public void printItemizedBill(){
        System.out.println("ID: " + id);
        System.out.println("Base Rate: $" + baseCost);
        System.out.println("Overage Fee: $"
                + String.format("%.2f", calculateOverage()));
        System.out.println("Tax: $"
                + String.format("%.2f", calculateTax()));
        System.out.println("Total: $"
                + String.format("%.2f", calculateTotal()));
    }

}
