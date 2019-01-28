package taxes;

public class Parser {


    public static long doubToLong(double number) {
        long temp = (long) (number * 100.00);
        return temp;
    }

    public static long longToDoub(long number) {
        return number / QuaterTaxes.CALCULATION_CONSTANT;
    }

    public static long excess (long number) {
        return number % QuaterTaxes.CALCULATION_CONSTANT;
    }
}
