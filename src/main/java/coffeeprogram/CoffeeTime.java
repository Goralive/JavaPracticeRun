package coffeeprogram;

import java.util.Scanner;
//"On a " + adjective + " " + season +
//                " day, I drink a minimum of " + number +
//                " cups of coffee."

public class CoffeeTime {
    public void print() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print an adjective: ");
        String adjective = sc.next();
        System.out.println("Enter a season: ");
        String season = sc.next();
        System.out.println("How many cups is: ");
        int number = sc.nextInt();

        sc.close();

        System.out.println("On a " + adjective + " " + season +
                " day, I drink a minimum of " + number +
                " cups of coffee.");
    }
}
