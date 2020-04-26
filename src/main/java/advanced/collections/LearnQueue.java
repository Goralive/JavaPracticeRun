package advanced.collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class LearnQueue {
    public static void main(String[] args) {
        Person preson1 = new Person(1);
        Person preson2 = new Person(2);
        Person preson3 = new Person(3);
        Person preson4 = new Person(4);

        Queue<Person> people = new ArrayBlockingQueue<Person>(3);
        System.out.println(people.offer(preson2));
        System.out.println(people.offer(preson2));
        System.out.println(people.offer(preson2));
        System.out.println(people.offer(preson2));

        System.out.println(people.remove());
        System.out.println(people.peek());
        System.out.println(people);

    }
}


class Person {
    private int id;

    public Person(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}
