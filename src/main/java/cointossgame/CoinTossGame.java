package cointossgame;

import java.util.Scanner;

public class CoinTossGame {

    private Scanner scanner;
    // Create game flow. Game > Players > Flip coin > game results
    public static void main(String[] args) {
     
    }
    //player name
    private String askPlayerName() {
        System.out.println("Enter the player's name:");
        return scanner.nextLine();
    }
    // What side do you want
    private String askGuess() {
        String prompt = String.format("%s or ");

    }

    private void determineWinner() {
        String winner;


        System.out.println("The winner is " + winner);
    }
}