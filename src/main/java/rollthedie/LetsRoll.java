package rollthedie;

import java.util.Random;

public class LetsRoll {
    private static int spaceboard = 0;
    private static int roll = 1;
    private int lastSpace = 20;
    private int maxRoll = 5;


    public int getRandomNumber() {
        Random randomNumber = new Random();
        return randomNumber.nextInt(6) + 1;
    }

    public void play() {
        System.out.println();
        while (true) {
            int dice = getRandomNumber();
            spaceboard += dice;
            if (spaceboard == lastSpace) {
                System.out.println("Roll #" + roll + " You roll a  " + dice + " You are now on space " + spaceboard + " You WON");
                break;
            }
            int left = lastSpace - spaceboard;
            System.out.println("Roll #" + roll + ". You roll a " + dice + " . You are now on space " + spaceboard + " and have " + left + " to go");
            if (roll == maxRoll && spaceboard < lastSpace) {
                System.out.println("Sorry but you lose. For " + roll +" rolls you have passed only " + spaceboard);
                break;
            }
            else if (spaceboard > lastSpace) {
                System.out.println("Sorry but you lose. You get more than 20 spaces. Your result is " + spaceboard);
                break;
            }
            roll++;
        }
    }

}
