package cointossgame;

import java.util.Random;

public class Coin {

    private String side;
    public static final String HEADS = "Heads";
    public static final String TAILS = "Tails";

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public void flip() {
        Random random = new Random();
        if (random.nextBoolean()) {
            setSide(HEADS);
        }
        setSide(TAILS);
    }
}


