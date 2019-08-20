package cake;

public class WeddingCake extends Cake {
    private int tiers;

    public WeddingCake() {
        super("Almond");
    }

    public int getTiers(){
        return this.tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
