package oop.animals;

public class Cat extends Animals {
    String name;
    String type;

    public Cat(int age, double weight, boolean sex, String ration, String name, String type) {
        super(age, weight, sex, ration);
        this.name = name;
        this.type = type;
    }

    @Override
    public void getVoice() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Cat name " + name + " Cat type: " + super.toString();
    }
}
