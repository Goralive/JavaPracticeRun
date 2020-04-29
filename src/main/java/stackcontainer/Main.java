package stackcontainer;

public class Main {
    public static void main(String[] args) {

        BlackList blackList = new BlackList();
        StackContainer stack = new StackContainer(blackList);
        // blackList.addToBlackList(Human.class);
        // blackList.addToBlackList(Scanner.class);
        System.out.println(blackList.toString());
        stack.push(Integer.class);
        stack.push(String.class);
        stack.push(Double.class);
        System.out.println(stack.pop().getClass());
        System.out.println(stack.peek().getClass());


    }

}
