package lottery;

import java.util.Arrays;

public class LotteryTicket {
    public static void main(String[] args) {
        NumberGenerator lottery = new NumberGenerator();
        int[] lotteryNumbers = lottery.generateNumber();
        Arrays.sort(lotteryNumbers);
        lottery.printWinNumbers(lotteryNumbers);
    }
}
