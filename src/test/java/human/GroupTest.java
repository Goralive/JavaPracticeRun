package human;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


public class GroupTest {
    Group group = new Group("KPI", 14, 10);
    Student bob = new Student("Bob", "Burovski", 27, 88.3, 190, "KPI", 14);
    Student jack = new Student("Jack", "Vorovski", 27, 90, 195, "KPI", 14);
    Student rob = new Student("Rob", "Korovski", 17, 95, 176, "KPI", 14);

    @Test
    public void shouldStudentAddDataWhenAddStudent() throws AddStudentException {
        group.addStudentToGroup(bob);
        assertThat(bob).isIn(group.getStudensFromGroup());
    }

    @Test
    public void shouldDeleteStudentDataWhenDeleteStudent() throws AddStudentException {
        group.addStudentToGroup(jack);
        group.deleteStudentFromGroup("jack", "vorovski");
        assertThat(jack).isNotIn(group.getStudensFromGroup());
    }

    @Test
    public void sholdDeleteStudentDataWhenTwoOrMoreStudents() throws AddStudentException {
        group.addStudentToGroup(jack);
        group.addStudentToGroup(bob);
        group.deleteStudentFromGroup("Bob", "Burovski");
        assertThat(jack).isIn(group.getStudensFromGroup());
        assertThat(bob).isNotIn(group.getStudensFromGroup());
    }

    @Test
    public void shouldSearchStudentViaSurname() throws AddStudentException {
        Student bob = new Student("Bob", "Burovski", 27, 88.3, 190, "KPI", 14);
        Student jack = new Student("Jack", "Vorovski", 27, 88.3, 190, "KPI", 14);
        group.addStudentToGroup(bob);
        group.addStudentToGroup(jack);
        group.addStudentToGroup(rob);
        assertThat(group.findStudent("Rob","Korovski")).isEqualTo(rob);
    }
}
