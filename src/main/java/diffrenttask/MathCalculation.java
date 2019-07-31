package diffrenttask;

public class MathCalculation {

    private int numberOne;
    private int numberTwo;

    public MathCalculation(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }


    public void printFunction() {
        System.out.println("The numbers is " + numberOne + " " + numberTwo);
    }

    public void changeNumbers(int firstNum, int secondNum) {
        numberOne = firstNum;
        numberTwo = secondNum;
    }

    public int sumOfNumbers() {
        return numberOne + numberTwo;
    }

    public int biggerNumber() {
        if (numberOne < numberTwo) {
            return numberTwo;
        }
        else if (numberOne > numberTwo) {
            return numberOne;
        }
        else if (numberOne == numberTwo) {
            System.out.println("They are equals");
        }
        return -1;
    }
}
