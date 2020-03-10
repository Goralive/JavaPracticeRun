package stackcontainer;

import human.Human;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BlackList blackList = new BlackList();
        Stack stack = new Stack(blackList);
        blackList.addToBlackList(Human.class);
        blackList.addToBlackList(Human.class);
        blackList.addToBlackList(Scanner.class);
        System.out.println(blackList.toString());
        stack.addToStack(Human.class);
        stack.addToStack(System.class);
        System.out.println(stack.toString());

    }

}
