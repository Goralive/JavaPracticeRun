package javaStart.taxes;

public class Parser {


    public static long doubToLong(double number) {
        long temp = (long) number * QuaterTaxes.CALCULATION_CONSTANT;
        return temp;
    }

    public static double longToDoub(long number) {

        double temp = (double) (number / QuaterTaxes.CALCULATION_CONSTANT);
        return temp;
    }
}
