package polymorphism;

public class Market {
    public static void main(String[] args) {
        Fruit apple = new Apple(30);
        ((Apple) apple).removeSeeds();

        Apple apple2 = new Apple(15);
        apple2.removeSeeds();

        Banana banana = new Banana(22);
        banana.removePeel();

        Fruit banana2 = new Banana(33);
        ((Banana) banana2).removePeel();

        Fruit orange = new Fruit();

        squeeze(apple);
        squeeze(banana);
        squeeze(banana2);
        squeeze(orange);

    }

    public static void squeeze(Fruit fruit) {
        System.out.print("Squeezing...");
        fruit.makeAJuice();
    }
}
