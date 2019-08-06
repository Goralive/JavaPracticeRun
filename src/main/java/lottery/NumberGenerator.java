package lottery;

import java.util.Random;

public class NumberGenerator {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public int [] generateNumber() {
        int [] ticket = new int[LENGTH];
        Random random = new Random();
        for (int i = 0; i < ticket.length; i++) {
               ticket[i] = random.nextInt(MAX_TICKET_NUMBER) + 1;
        }
        return ticket;
    }

    public void printWinNumbers(int [] ticket){
        for (int i = 0; i < ticket.length ; i++) {
            System.out.print(ticket[i] + " | ");
        }
    }
}
