package polymorphism;

public class Banana extends Fruit {

    public Banana(double calories) {
        this.calories = calories;
    }

    public void removePeel (){
        System.out.println("Peal is removed");
    }

    @Override
    public void makeAJuice() {
        System.out.println("Banana juice is made");
    }
}
