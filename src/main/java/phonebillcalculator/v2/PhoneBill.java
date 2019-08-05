package phonebillcalculator.v2;


public class PhoneBill {
    private int id;
    private int allottedMinutes;
    private int usedMinutes;
    private double charge = 0.25;
    private double tax = 0.15;
    private double baseCost;

    public PhoneBill(){
        this.id = 0;
        this.allottedMinutes = 200;
        this.usedMinutes = 200;
        this.baseCost = 250;
    }

    public PhoneBill (int id) {
        this.id = id;
        this.allottedMinutes = 200;
        this.usedMinutes = 200;
        this.baseCost = 250;
    }

    public PhoneBill(int id, int allottedMinutes, int usedMinutes, double baseCost) {
        this.id = id;
        this.allottedMinutes = allottedMinutes;
        this.usedMinutes = usedMinutes;
        this.baseCost = baseCost;
    }
    //allottedMinutes - usedMinutes if more then 0 then calculate take a tax
    public double calculateOverage () {
        return allottedMinutes > usedMinutes ? 0 : (usedMinutes - allottedMinutes) * charge;
    }

    public double calculateTax () {
        return (baseCost + calculateOverage()) * tax;
    }

    public double calculateTotal () {
        return calculateTax() + baseCost + calculateOverage();
    }

    public void printItemizedBill(){
        System.out.println("ID: " + id);
        System.out.println("Base Rate: $" + baseCost);
        System.out.println("Overage Fee: $"
                + String.format("%.2f", calculateOverage()));
        System.out.println("Tax: $"
                + String.format("%.2f", calculateTax()));
        System.out.println("Total: $"
                + String.format("%.2f\n", calculateTotal()));
    }
}
