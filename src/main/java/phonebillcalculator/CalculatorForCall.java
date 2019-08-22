package phonebillcalculator;

public class CalculatorForCall {

    private double charge = 0.25;
    private double tax = 0.15;


    public double extraMinutes (double extraMinutes) {
        if (extraMinutes > 0) {
            return extraMinutes * charge;
        } else {
            System.out.println("Overage Minutes is 0");
            return 0;
        }
    }

    public void calculation(double costOfPlan, double overageMinutes, double extraMinutes) {
        System.out.println("Phone bill statement");
        System.out.println("Plan: " + String.format("%.2f",costOfPlan));
        System.out.println("Overage: " + String.format("%.2f", extraMinutes(overageMinutes)));
        double taxCalculation = (costOfPlan + extraMinutes) * tax;
        System.out.println("Tax: " + String.format("%.2f",taxCalculation) );
        System.out.println("Total: " + String.format("%.2f",(taxCalculation + costOfPlan + extraMinutes)));
    }

}


