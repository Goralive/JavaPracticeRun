package farm;

public class Duck extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Duck says: Krya, Krya");
    }

    @Override
    public void eat(){
        System.out.println("Duck eat!");
    }
}
