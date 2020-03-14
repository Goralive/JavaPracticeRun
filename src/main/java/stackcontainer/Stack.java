package stackcontainer;

public class Stack {
    private BlackList blackList = null;
    private Object[] stack = new Stack[0];


    public Stack() {
        super();
    }

    public Stack(BlackList blackList) {
        super();
        this.blackList = blackList;
    }

    public boolean addToStack(Object addObject) {
        if (blackList == null || !blackList.contains(addObject)) {
            Object[] tempObjects = new Object[stack.length + 1];
            for (int i = 0; i < stack.length; i++) {
                tempObjects[i] = stack[i];
            }
            stack = tempObjects;
            for (int i = 0; i < stack.length; i++) {
                if (stack[i] == null) {
                    stack[i] = addObject;
                    System.out.printf("\nObject %s was successfully added to the stack", addObject.toString());
                    return true;
                }
            }
        }
        System.out.printf("\nObject %s wasn't added to the stack", addObject.toString());
        return false;
    }

    public Object getObjectFromStackAndDelete(Object readObject) {
        Object returnObject = null;
        if (stack.length == 0) {
            System.out.println("No objects in the stack");
            return null;
        } else {
            for (int i = 0; i < stack.length; i++) {
                if (stack[i] == readObject) {
                    returnObject = stack[i];
                    stack[i] = null;
                }
            }
            if (returnObject != null) {
                Object[] temp = new Object[stack.length - 1];
                if (!(temp.length == 0)) {
                    for (Object tempStack : stack) {
                        if (tempStack != null) {
                            for (int i = 0; i < temp.length; i++) {
                                temp[i] = tempStack;
                            }
                        }
                    }
                } else {
                    System.out.println("Stack is empty after getting the object");
                }
                stack = temp;
            } else {
                System.out.printf("No object %s was found in the stack", readObject);
            }
            return returnObject;
        }
    }

    public Object getObjectFromTop() {
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (stack.length == 0) {
            return "\nStack is empty";
        } else {
            sb.append("\nStack contains: ");
            for (Object i : stack) {
                if (i != null) {
                    sb.append("\n- " + i.toString());
                }
            }
            return sb.toString();
        }
    }
}

