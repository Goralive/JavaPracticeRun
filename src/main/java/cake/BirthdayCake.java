package cake;

public class BirthdayCake extends Cake {

    private int candles;

    public BirthdayCake() {
        super("vanila");
    }


    public void setCandles(int candles) {
        this.candles = candles;
    }

    public int getCandles() {
        return candles;
    }
}
