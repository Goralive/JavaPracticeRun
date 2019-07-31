package javaStart.variables;


public class Main {
    public static void main(String[] args) {
        ReadNumberAndType readNumber = new ReadNumberAndType();
        System.out.println("Greetings,\n\nHere is the list of the home tasks. Type a number to start:\n");
        System.out.println("1. Type a number and you receive each number on the line ");
        System.out.println("2. Triangle square calculation");
        System.out.println("3. Calculation of the circle width");

        switch (UserInput.returnInt()) {
            case 1:
                System.out.println("Please enter 5 digits");
                readNumber.number(UserInput.returnLine());
                break;
            case 2:
                //TriangleSquare
                break;
            case 3:
                //CircleWidth
            default:
                System.out.println("Select program using number from 1-3");
        }

    }
}
