package rollthedie;

import java.util.Random;

public class LetsRoll {
    static int spaceboard = 0;
    static int roll = 1;


    public int getRandomNumber() {
        Random randomNumber = new Random();
        return randomNumber.nextInt(6) + 1;
    }

    public void play() {
        System.out.println();
        while (true) {
            int dice = getRandomNumber();
            spaceboard += dice;
            if (spaceboard == 20) {
                System.out.println("Roll #" + roll + " You roll a  " + dice + " You are now on space " + spaceboard + " You WON");
                break;
            }
            int left = 20 - spaceboard;
            System.out.println("Roll #" + roll + ". You roll a " + dice + " . You are now on space " + spaceboard + " and have " + left + " to go");
            roll++;
            if (roll == 6 || spaceboard >= 21) {
                System.out.println("Sorry but you lose");
                break;
            }
        }
    }

}
