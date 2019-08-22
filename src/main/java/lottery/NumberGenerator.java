package lottery;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class NumberGenerator {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public int[] generateNumber() {
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for (int i = 0; i < ticket.length; i++) {
            int randomNumber;
            //Generate random number then search again
            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            } while (search(ticket, randomNumber));
            ticket[i] = randomNumber;
        }
        return ticket;
    }

    /**
     * Does a sequntial search on the array to find a value
     *
     * @param array       Array to search through
     * @param numberToSearchFor Value to search for
     * @return true if found, false if not
     */
    private boolean search(int[] array, int numberToSearchFor) {
        for (int temp : array){
            if(temp == numberToSearchFor) {
                return true;
            }
        }
        //If we've reached this point the value was not found
        return false;
    }

    private boolean binarySearch (int[] array, int number) {
        Arrays.sort(array);
        int index = Arrays.binarySearch(array,number);
        if(index >=0){
            return true;
        }
        else return false;
    }

    public void printWinNumbers(int[] ticket) {
        for (int i = 0; i < ticket.length; i++) {
            System.out.print(ticket[i] + " | ");
        }
    }
}
