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


    public void addStudentToGroup(Student student) throws AddStudentException {
        for (int i = 0; i < groupWithStudents.length; i++) {

            if (groupWithStudents[i] == null) {
                groupWithStudents[i] = student;
                System.out.println("Add student " + student.getName() + " " + student.getSurname());
                break;
            }
            if (groupWithStudents[9] != null) {
                throw new AddStudentException();
            }
        }
    }


    public void deleteStudentFromGroup(Student student) {
        try {
            for (int i = 0; i < groupWithStudents.length; i++) {
                if (groupWithStudents[i].hashCode() == student.hashCode()) {
                    System.out.println("Student " + student.getName() + " " + student.getSurname() + " was deleted");
                    groupWithStudents[i] = null;
                    break;
                }
            }
        } catch (NullPointerException e) {
            System.out.println("No student was deleted");
        }
    }

    public Student findStudent(String surname) {
        try {
            for (int i = 0; i < groupWithStudents.length; i++) {
                if (groupWithStudents[i].getSurname().equalsIgnoreCase(surname)) {
                    return groupWithStudents[i];
                }
            }
        } catch (NullPointerException e) {
            System.out.println("No student was found");
        }
        return null;
    }
}

