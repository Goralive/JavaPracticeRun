package javaStart.taxes;

// taxes. Get user input float for course value, * 0.95 (5%) + 820 ghr (ESV) * 3 months (quarter)
public class QuaterTaxes {
    static long tax = 0;
    static final int CALCULATION_CONSTANT = 100;

    public static void currencySelector(String currency) {
        switch (currency.toLowerCase()) {
            case "1":
            case "dollar":
                QuaterTaxes.hryvnia(dollar(Parser.doubToLong(UserInput.profit())));
                break;
            case "2":
            case "euro":
                QuaterTaxes.hryvnia(euro(Parser.doubToLong(UserInput.profit())));
                break;
            case "3":
            case "hryvnia":
                QuaterTaxes.hryvnia(Parser.doubToLong(UserInput.profit()));
                break;
            default:
                System.out.println("Wrong input\nCould you please try again?");
                QuaterTaxes.currencySelector(UserInput.currency().toLowerCase());
        }
    }

    public static long euro(long euroProfit) {
        System.out.println("Course value is: " + "31.63\n" + "Your profit in EUR is: " + Parser.longToDoub(euroProfit));
        return euroProfit * 3163 / CALCULATION_CONSTANT;
    }

    public static long dollar(long dollarProfit) {
        System.out.println("Course value is: " + "27.91\n" + "Your profit in USD is: " + Parser.longToDoub(dollarProfit));
        return dollarProfit * 2791 / CALCULATION_CONSTANT;
    }

    public static long hryvnia(long hryvniaProfit) {
        System.out.println("Your profit in hryvnia: " + Parser.longToDoub(hryvniaProfit));
        tax = (hryvniaProfit - (hryvniaProfit * 95 / CALCULATION_CONSTANT)) + 246000;
        return tax;
    }
}
