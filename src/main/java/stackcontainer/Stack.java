package stackcontainer;

public class Stack {
    private BlackList blackList;
    private Object[] stack;

    public Stack() {
        super();
        stack = new Stack[0];
    }

    public Stack(BlackList blackList){
        super();
        this.blackList = blackList;
        stack = new Stack[0];
    }

    public boolean addToStack() {
        return false;
    }

    public boolean getObjectFromStackAndDelete() {
        return false;
    }

    public boolean getObjectFromTop() {
        return false;
    }
}
