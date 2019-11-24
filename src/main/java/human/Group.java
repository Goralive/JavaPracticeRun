package human;

public class Group {
    private int groupNumber;
    private String universityName;
    private Student[] groupWithStudents;

    public Group(String universityName, int groupNumber, int groupSize) {
        this.universityName = universityName;
        this.groupNumber = groupNumber;
        groupWithStudents = new Student[groupSize];
    }


    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public Student[] getGroupWithStudents() {
        return groupWithStudents;
    }


    public void addStudentToGroup(Student student) {
        for (int i = 0; i < groupWithStudents.length; i++) {
            if (groupWithStudents[i] == null) {
                groupWithStudents[i] = student;
                System.out.println("Add student " + student.getName() + " " + student.getSurname());
                break;
            }
            System.out.println(i + "." + groupWithStudents[i].getName() + " " + groupWithStudents[i].getSurname());
        }
    }


}
