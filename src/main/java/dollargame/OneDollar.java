package dollargame;

import java.util.Scanner;

public class OneDollar {
    private double dollar = 1.00;
    private double pennies = 0.01;
    private double nickels = 0.05;
    private double dimes = 0.1;
    private double quarters = 0.25;
    private double userMoney;
    private double tempUserInput;


    public double calculation() {
        System.out.println("Enter enough change to equal exactly $1 ");
        System.out.println("How many pennies do you need? ");
        tempUserInput = pennies * userInput();
        userMoney += tempUserInput;
        System.out.println("How");
    }

    public double userInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public void game () {
        if (calculation() == dollar) {
            System.out.println("You won the game! You get a " + userMoney);
        }
        else if (calculation() < dollar) {
            System.out.println("Sorry you went under a dollar! Your result under for a " + (dollar - userMoney));
        }
        else if (calculation() > dollar) {
            System.out.println("Sorry you went over a dollar! Your result is " + (userMoney - dollar));
        }
    }
}
