package human;

import java.util.Comparator;

public class SortByName implements Comparator<Human> {
    @Override
    public int compare(Human human, Human t1) {
        return human.getName().compareToIgnoreCase(t1.getName());
    }
}
