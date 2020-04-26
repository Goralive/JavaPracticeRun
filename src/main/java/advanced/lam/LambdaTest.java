package advanced.lam;

interface Executable {
    int execute(int x, int y);

}

class Runner {
    public void run(Executable e) {
          int a =  e.execute(5, 20);
        System.out.println(a);
    }
}

public class LambdaTest {
    public static void main(String[] args) {
        Runner runner = new Runner();
        Executable executable = ((x, y) -> {
            return 1;
        });

        int a = 33;

        runner.run((x, y) -> {
            System.out.println("Hello");
            System.out.println("World");
            return x + y + a;
        });
    }
}
