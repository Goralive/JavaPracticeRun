package javaStart.taxes;
// taxes. Get user input float for course value, * 0.95 (5%) + 820 ghr (ESV) * 3 months (quarter)
public class QuaterTaxes {
    public void currencySelector (String currency){
        switch (currency.toLowerCase()) {
            case "1":
            case"dollar":
                QuaterTaxes.dollar();
                QuaterTaxes.ghryvna();
                break;
            case "2":
            case "euro":
                QuaterTaxes.euro();
                QuaterTaxes.ghryvna();
                break;
            case "3":
            case"ghryvna":
                QuaterTaxes.ghryvna();
                break;
        }
    }
    public static void euro (double profit) {

    }
    public static void dollar (double profit){

    }
    public static void ghryvna (double profit){

    }
}
