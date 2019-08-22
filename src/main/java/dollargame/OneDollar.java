package dollargame;

import java.util.Scanner;

public class OneDollar {
    private double dollar = 1.00;
    private double pennies = 0.01;
    private double nickels = 0.05;
    private double dimes = 0.1;
    private double quarters = 0.25;
    private double userMoney;

    Scanner sc = new Scanner(System.in);


    public double calculation() {
        System.out.println("Enter enough change to equal exactly $1 ");
        userMoney += penniesAmount();
        userMoney += nickelsAmount();
        userMoney += dimesAmount();
        userMoney += quartersAmount();
        sc.close();
        return userMoney;
    }

    private double quartersAmount() {
        System.out.println("How many quaters do you need? ");
        return quarters * userInput();
    }

    private double dimesAmount() {
        System.out.println("How many dimes do you need? ");
        return dimes * userInput();
    }

    private double nickelsAmount() {
        System.out.println("How many nickels do you need? ");
        return nickels * userInput();
    }

    public double userInput() {
        return sc.nextInt();
    }

    public void game() {
        calculation();
        if (userMoney == dollar) {
            System.out.println("You won the game! You get a $" + userMoney);
        } else if (userMoney < dollar) {
            System.out.println("Sorry you went under a dollar! Your result under for a $" + (dollar - userMoney));
        } else if (userMoney > dollar) {
            System.out.println("Sorry you went over a dollar! Your above for $" + (userMoney - dollar));
        }
    }

    public double penniesAmount() {
        System.out.println("How many pennies do you need? ");
        return pennies * userInput();

    }
}
