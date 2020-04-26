package human;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Group implements ArmyMan, Serializable {
    private int groupNumber;
    private String universityName;
    private Student[] groupWithStudents;
    private static final long serialVersionUID = 1L;
    private Student[] recruits;


    public Group(String universityName, int groupNumber, int groupSize) {
        this.universityName = universityName;
        this.groupNumber = groupNumber;
        this.groupWithStudents = new Student[groupSize];
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

    public Student[] getStudensFromGroup() {
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
        int lengthOfArray = groupWithStudents.length;
        for (int i = 0; i < lengthOfArray; i++) {
            if (groupWithStudents[i].getName().equalsIgnoreCase(name) && groupWithStudents[i].getSurname().equalsIgnoreCase(surname)) {
                System.out.println("Student " + name + " " + surname + " was deleted");
                for (int j = i; j < lengthOfArray; j++) {
                    if (j + 1 < lengthOfArray && groupWithStudents[j] != null) {
                        groupWithStudents[j] = groupWithStudents[j + 1];
                        groupWithStudents[j + 1] = null;
                    } else {
                        groupWithStudents[j] = null;
                    }
                }
                break;
            }
        }
    }


    public Student[] sortStudents(Student[] notSortedStudensts) {
        try {
            Arrays.sort(notSortedStudensts);
        } catch (NullPointerException e) {
            System.out.println("Not a full group");
        }
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
        for (int i = 0; i < groupWithStudents.length; i++) {
            return groupWithStudents[i].getFullName() + "Age: " + groupWithStudents[i].getAge() + "Height: " + groupWithStudents[i].getHeight()
                    + "Weight " + groupWithStudents[i].getWeight();
        }
        return "";
    }


    private int calculateArraySize() {
        int arraySize = groupWithStudents.length - 1;
        for (Student temp : groupWithStudents) {
            if (temp == null) {
                arraySize -= 1;
            }
        }
        return arraySize;
    }

    public void groupToFile() {
        File file = new File("group" + this.getUniversityName() + this.getGroupNumber() + ".txt");
        System.out.println("Created txt file for group. File you can find using path " + file.getAbsolutePath());
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            bufferedWriter.write(this.toString());
            bufferedWriter.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }




    @Override
    public String toString() {
        return "----- \nUniversity name: " + this.universityName
                + "\nGroup number is " + this.groupNumber
                + "\nSize of the group is " + this.groupWithStudents.length
                + "\nStudents in the group: " + Arrays.toString(groupWithStudents) + "\n-----";
    }

    @Override
    public Human[] recruits() {
        int recruiterAge = 18;
        int arraysLength = calculateArraySize();

        recruits = new Student[arraysLength];
        for (Student temp : this.groupWithStudents) {
            if (temp != null) {
                if (temp.getAge() > recruiterAge) {
                    for (int i = 0; 0 < recruits.length; i++) {
                        if (recruits[i] == null) {
                            recruits[i] = temp;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println("The recruits array size is " + recruits.length);
        return recruits;
    }

    @Override
    public void printListOfRecruits() {
        System.out.println("THIS STUDENTS WILL GO WITH ME:");
        int iterator = 1;
        try {
            for (Student recruit : this.recruits) {
                System.out.println(iterator + "." + recruit.getFullName());
                iterator++;
            }
        } catch (NullPointerException e) {
        }
    }

    public static Group createGroupFromFile(String fileLocation) {
        Group tempGroup = null;

        try (Scanner input = new Scanner(new File(fileLocation))) {
            input.useDelimiter(",|\n");
            while (input.hasNext()) {
                String uniName = input.next();
                int groupNumber = input.nextInt();
                int sizeOfGroup = input.nextInt();
                tempGroup = new Group(uniName,groupNumber,sizeOfGroup);
                if (0 < sizeOfGroup) {
                    for (int i = 1; i <= sizeOfGroup ; i++) {
                        String name = input.next();
                        String surname = input.next();
                        int age = input.nextInt();
                        double weight = input.nextDouble();
                        int height = input.nextInt();
                        Student tempStudent = new Student(name,surname,age,weight,height,uniName,groupNumber);
                        tempGroup.addStudentToGroup(tempStudent);
                    }
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (AddStudentException e) {
            e.printStackTrace();
        }
        return tempGroup;
    }
}
