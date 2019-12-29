package human;

import java.util.Comparator;

public class SortByAge implements Comparator<Human> {
    @Override
    public int compare(Human human, Human t1) {
        return human.getAge() < t1.getAge() ? -1 : (human.getAge() == t1.getAge() ? 0 : 1);
    }
}


