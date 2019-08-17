package polymorphism;

public class Apple extends Fruit {

    public Apple(double calories) {
        this.calories = calories;
    }

    public void removeSeeds() {
        System.out.println("Seeds are removed");
    }

    @Override
    public void makeAJuice() {
        System.out.println("Apple juice is made");
    }
}
