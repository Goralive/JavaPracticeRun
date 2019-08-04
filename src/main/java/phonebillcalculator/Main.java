package phonebillcalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CalculatorForCall calculatorForCall = new CalculatorForCall();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base cost of the plan");
        double costOfPlan = sc.nextDouble();
        System.out.println("Enter overage minutes");
        double overageMinutes = sc.nextDouble();
        double extra = calculatorForCall.extraMinutes(overageMinutes);
        sc.close();
        calculatorForCall.calculation(costOfPlan, overageMinutes, extra);

    }
}
