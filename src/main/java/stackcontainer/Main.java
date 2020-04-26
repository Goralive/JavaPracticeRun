package stackcontainer;

import human.Human;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BlackList blackList = new BlackList();
        Stack stack = new Stack(blackList);
     // blackList.addToBlackList(Human.class);
     // blackList.addToBlackList(Scanner.class);
        System.out.println(blackList.toString());
///     stack.addToStack(2.3);
///     stack.addToStack("Bobby");
///     stack.addToStack(17);
///     System.out.println(stack.toString());
///     stack.getObjectFromTop();
///     try {
///         String objectFromStack = stack.getObjectFromStackAndDelete(String.class).toString();
///         System.out.printf("Object from stack is %s", objectFromStack);
///     } catch (NullPointerException e) {
///         System.out.printf("\n" + e);
///     }
///     System.out.println(stack.toString());


    }

}
