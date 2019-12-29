package human;

import java.util.Arrays;
import java.util.Comparator;

public class Group implements ArmyMan {
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
        int sizeOfArray = groupWithStudents.length;
        for (int i = 0; i < sizeOfArray; i++) {
            if (groupWithStudents[i] == null) {
                groupWithStudents[i] = student;
                System.out.println("Add student " + student.getName() + " " + student.getSurname());
                break;
            }
            if (groupWithStudents[sizeOfArray - 1] != null) {
                throw new AddStudentException();
            }
        }
    }


    public void deleteStudentFromGroup(String name, String surname) {
        for (int i = 0; i < groupWithStudents.length; i++) {
            try {
                if (groupWithStudents[i].getName() == name && groupWithStudents[i].getSurname() == surname) {
                    System.out.println("Student " + name + " " + surname + " was deleted");
                    groupWithStudents[i] = null;
                    break;
                }
            } catch (NullPointerException e) {
                System.out.println("No student was deleted");
            }
        }
    }

    public Student[] sortStudents(Student[] notSortedStudensts) {
        Arrays.sort(notSortedStudensts);
        return notSortedStudensts;
    }

    public Student[] sortStudents(Student[] notSortedStudensts, String sortBy) {
        switch (sortBy) {
            case "name":
                Arrays.sort(notSortedStudensts, new SortByName());
                break;
            case "age":
                Arrays.sort(notSortedStudensts, new SortByAge());
                break;
            default:
                Arrays.sort(notSortedStudensts);
                break;
        }

        return notSortedStudensts;
    }

    public Student findStudent(String name, String surname) {
        for (int i = 0; i < groupWithStudents.length; i++) {
            try {
                if (groupWithStudents[i].getName().equalsIgnoreCase(name) && groupWithStudents[i].getSurname().equalsIgnoreCase(surname)) {
                    System.out.println("Was found student: " + groupWithStudents[i].getName() + " " + groupWithStudents[i].getSurname());
                    return groupWithStudents[i];
                }
            } catch (NullPointerException e) {
                System.out.println("No student was found");
            }
        }
        return null;
    }

    public String printStudentsFromGroup() {
        String studentsNames = " ";
        for (Student studentName : groupWithStudents) {
            try {
                studentsNames += studentName.getFullName() + " ";
            } catch (NullPointerException e) {
            }
        }
        return studentsNames;
    }

    @Override
    public String toString() {
        return "----- \nUniversity name: " + this.universityName
                + "\nGroup number is " + this.groupNumber
                + "\nSize of the group is " + this.groupWithStudents.length
                + "\nStudents in the group: " + this.printStudentsFromGroup() + "\n-----";
    }


    @Override
    public Student[] recruits(Student[] students) {
        int recruiterAge = 18;
        Student[] recruits = new Student[students.length];
        for (Student temp : students) {
            if (temp.getAge() > recruiterAge) {
                for (int i = 0; 0 < recruits.length; i++) {
                    if (recruits[i] == null) {
                        recruits[i] = temp;
                        break;
                    }
                }
            }
        }
        return recruits;
    }

    @Override
    public void printListOfRecruits (Student[] recruits) {
        int freePlaces = 0;
        System.out.println("THIS STUDENTS WILL GO WITH ME:");
        try {
            for (Student recruit : recruits) {
                System.out.println(recruit.getFullName());
            }
        } catch (NullPointerException e) {
            freePlaces++;
        }
        System.out.println("We have a " + freePlaces + " free place here. FEEL FREE TO JOIN");
    }
}

