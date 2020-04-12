package advanced.lam;

public class LambdaTest {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Hello!");
        });
    }
}
