package human;

public class Main {
    public static void main(String[] args) throws AddStudentException {
        Student jackson = new Student("Jackson", "Ford", 27, 82, 195, "KPI", 7);
        Student bob = new Student("Bobby", "Portis", 32, 60, 195, "KPI", 7);

        Group seven = new Group("KPI", 7, 2);

        seven.addStudentToGroup(bob);
        seven.addStudentToGroup(jackson);
        seven.findStudent("jackson","Ford");
        seven.findStudent("Bobby","Ford");
        seven.deleteStudentFromGroup("Jackson","Ford");
        seven.findStudent("jackson","Ford");
        seven.addStudentToGroup(jackson);
        seven.addStudentToGroup(jackson);


    }
}
