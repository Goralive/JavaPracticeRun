package human;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;


public class GroupTest {
    Group group = new Group("KPI", 10, 10);

    @Test
    public void shouldStudentAddDataWhenAddStudent() throws AddStudentException {
        Student bob = new Student("Bob","Burovski", 27, 88.3, 190,"KPI",14);

        group.addStudentToGroup(bob);

        assertThat(bob).isIn(group.getGroupWithStudents());
    }

    @Test
    public void shouldDeleteStudentDataWhenDeleteStudent() throws AddStudentException {
        Student jack = new Student("Jack","Vorovski", 27, 88.3, 190,"KPI",14);
        group.addStudentToGroup(jack);

        group.deleteStudentFromGroup(jack);

        assertThat(jack).isNotIn(group.getGroupWithStudents());

    }

    @Test
    public void sholdDeleteStudentDataWhenTwoOrMoreStudents() throws AddStudentException {
        Student jack = new Student("Jack","Vorovski", 27, 88.3, 190,"KPI",14);
        Student bob = new Student("Bob","Burovski", 27, 88.3, 190,"KPI",14);
        group.addStudentToGroup(jack);
        group.addStudentToGroup(bob);

        group.deleteStudentFromGroup(bob);

        assertThat(jack).isIn(group.getGroupWithStudents());
        assertThat(bob).isNotIn(group.getGroupWithStudents());
    }

    @Test
    public void shouldSearchStudentViaSurname() throws AddStudentException {
        Student rob = new Student("Rob","Korovski", 22, 95, 176,"KPI",14);
        Student bob = new Student("Bob","Burovski", 27, 88.3, 190,"KPI",14);
        Student jack = new Student("Jack","Vorovski", 27, 88.3, 190,"KPI",14);
        group.addStudentToGroup(bob);
        group.addStudentToGroup(jack);
        group.addStudentToGroup(rob);


        assertThat(group.findStudent("Korovski")).isEqualTo(rob);

    }
}
