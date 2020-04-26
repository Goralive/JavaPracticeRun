package advanced.collections;

import java.util.Stack;

public class StackLearn {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(3);
        stack.push(1);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        while (!stack.empty()){
            System.out.println(stack.pop());
        }
    }
}
