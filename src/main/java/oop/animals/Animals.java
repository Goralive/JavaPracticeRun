package oop.animals;

public class Animals {
    int age;
    double weight;
    boolean sex;
    String ration;

    public Animals() {
    }

    public Animals(int age, double weight, boolean sex, String ration) {
        this.age = age;
        this.weight = weight;
        this.sex = sex;
        this.ration = ration;
    }

    public void getVoice (){
        System.out.println("...");
    }

    @Override
    public String toString() {
        return "Animals{" +
                "age=" + age +
                ", weight=" + weight +
                ", sex=" + sex +
                ", ration='" + ration + '\'' +
                '}';
    }
}
