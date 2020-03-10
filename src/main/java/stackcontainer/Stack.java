package stackcontainer;

import java.util.Arrays;

public class Stack {
    private BlackList blackList;
    private Object[] stack;

    public Stack() {
        super();
        stack = new Stack[0];
    }

    public Stack(BlackList blackList) {
        super();
        this.blackList = blackList;
        stack = new Stack[0];
    }

    public boolean addToStack(Object addObject) {
        if (!blackList.contains(addObject)) {
            Object[] tempObjects = new Object[stack.length + 1];
            for (int i = 0; i < stack.length; i++) {
                stack[i] = tempObjects[i];
            }
            stack = tempObjects;
            for (int i = 0; i < stack.length; i++) {
                if (stack[i] == null) {
                    stack[i] = addObject;
                    System.out.printf("\nObject %s was successfully added to the stack", addObject.getClass());
                    return true;
                }
            }
        }
        System.out.printf("\nObject %s wasn't added to the stack", addObject.getClass());
        return false;
    }

    public boolean getObjectFromStackAndDelete(Object readObject) {
        return false;
    }

    public Object getObjectFromTop() {
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(blackList.toString());
        if (stack.length == 0) {
            return "\nStack is empty";
        } else {
            sb.append("\nStack contains: ");
            for (Object i : stack) {
                sb.append("\n- " + i.getClass());
            }
            return sb.toString();
        }
    }
}
