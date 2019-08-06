package lottery;

public class LotteryTicket {
    public static void main(String[] args) {
    NumberGenerator lottery = new NumberGenerator();
    int [] lotteryNumbers = lottery.generateNumber();
    lottery.printWinNumbers(lotteryNumbers);
    }
}
