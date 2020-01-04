package human;

public class Main {
    public static void main(String[] args) throws AddStudentException {
        Student jackson = new Student("Jackson", "Ford", 33, 82, 195, "KPI", 7);
        Student bob = new Student("Bobby", "Portis", 32, 60, 195, "KPI", 7);
        Student vova = new Student("Vova", "Borysiv", 17, 77, 182, "KPI", 7);
        InteractiveControl input = new InteractiveControl();

        Group seven = new Group("KPI", 7, 3);

        seven.addStudentToGroup(vova);
        seven.addStudentToGroup(bob);
        seven.addStudentToGroup(jackson);
        seven.findStudent("jackson", "Ford");
        seven.findStudent("Bobby", "Portis");
        seven.deleteStudentFromGroup("Bobby", "Portis");
        System.out.println(seven.toString());

        seven.findStudent("jackson", "Ford");
        seven.recruits();
        seven.printListOfRecruits();
        System.out.println("----");
        System.out.println(seven.toString());

        Group userGroup = input.createNewGroup();

        //seven.addStudentToGroup(jackson);
        System.out.println("Created group by user\n" + userGroup.toString());


    }
}
