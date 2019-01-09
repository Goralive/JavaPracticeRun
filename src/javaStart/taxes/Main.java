package javaStart.taxes;

public class Main {
    public static void main(String[] args) {
        System.out.println("This program calculate 5% taxes from profit\nChoose currency:\n 1. Dollar\n 2. Euro\n 3. Hryvnia");
        QuaterTaxes.currencySelector(UserInput.currency());
        System.out.println("You have to pay to the goverment " + Parser.longToDoub(QuaterTaxes.tax) + "," + Parser.excess(QuaterTaxes.tax) + " hrn");
    }
}
