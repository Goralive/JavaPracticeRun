package dayoftheweek;

import java.util.Scanner;

public class DaysOfTheWeek {
    private final String[] DAYS_OF_THE_WEEK = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    Scanner sc = new Scanner(System.in);

    public void userInput() {
        int index;
        do {
            System.out.println("Enter a number of the week: ");
            index = sc.nextInt();
        }
        while (index > DAYS_OF_THE_WEEK.length || 0 >= index);
        System.out.println("Your week is " + DAYS_OF_THE_WEEK[index - 1]);
    }
}
