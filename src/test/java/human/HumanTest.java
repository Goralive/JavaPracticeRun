package human;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


public class HumanTest {

    @Test
    public void shouldSetData() {
        String name = "Jackson";
        String surname = "Ford";
        int age = 25;
        double weight = 77.8;
        int height = 187;


        Human human = new Human(name, surname, age, weight, height);
        Student student = new Student(name, surname, age, weight, height, "KPI", 14);

        assertThat(human.getName()).isEqualToIgnoringCase("jackson");
        assertThat(human.getSurname()).isEqualToIgnoringCase("ford");
        assertThat(human.getAge()).isEqualTo(25);
        assertThat(human.getWeight()).isEqualTo(77.8);
        assertThat(human.getHeight()).isEqualTo(187);
        assertThat(human.getInformation()).contains("Jackson").contains("Ford");
        assertThat(student.getInformation()).contains("Jackson").contains("Ford").contains("14").contains("KPI");
        System.out.println(student.getInformation());
    }
}
