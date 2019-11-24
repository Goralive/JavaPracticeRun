package human;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;


public class GroupTest {


    @Test
    public void shouldStudentAddDataWhenAddStudent() {
        Group group = new Group("KPI", 10, 10);
        Student bob = new Student("Bob","Burovski", 27, 88.3, 190,"KPI",14);

        group.addStudentToGroup(bob);

        assertThat(bob).isIn(group.getGroupWithStudents());
    }

    @Test
    public void shouldDeleteStudentDataWhenDeleteStudent() {
    }

    @Test
    public void shouldGetStudentInfoWhenSearchStudent() {
    }

    @Test
    public void shouldThrowErrorWhenAdd11Student() {
    }
}
