package javaStart.taxes;

// taxes. Get user input float for course value, * 0.95 (5%) + 820 ghr (ESV) * 3 months (quarter)
public class QuaterTaxes {
    static double tax = 0;

    public static void currencySelector(String currency) {
        switch (currency.toLowerCase()) {
            case "1":
            case "dollar":
                QuaterTaxes.hryvnia(dollar(UserInput.profit()));
                break;
            case "2":
            case "euro":
                QuaterTaxes.hryvnia(euro(UserInput.profit()));
                break;
            case "3":
            case "hryvnia":
                QuaterTaxes.hryvnia(UserInput.profit());
                break;
                default:
                    System.out.println("Wrong input\nCould you please try again?");
                    QuaterTaxes.currencySelector(UserInput.currency().toLowerCase());
        }
    }

    public static double euro(double euroProfit) {
        System.out.println("Course value is: " + "31.63\n" + "Your profit in EUR is: " + euroProfit);
        return (double) Math.round((euroProfit * 31.63) * 100) / 100;
    }

    public static double dollar(double dollarProfit) {
        System.out.println("Course value is: " + "27.91\n" + "Your profit in USD is: " + dollarProfit);
        return (double) Math.round((dollarProfit * 27.91) * 100) / 100;
    }

    public static double hryvnia(double hryvniaProfit) {
        System.out.println("Your profit in hryvnia: " + hryvniaProfit);
        tax = (double) Math.round((hryvniaProfit - (hryvniaProfit * 0.95) + 2460) * 100) / 100;
        return tax;
    }
}
