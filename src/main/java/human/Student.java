package human;

public class Student extends Human {
    private String institute;
    private int group;

    @Override
    public String toString() {
        return "Student{" +
                "institute='" + institute + '\'' +
                ", group=" + group +
                '}' + getName() + " " + getSurname();
    }

    public Student(String name, String surname, int age, double weight, int height, String institute, int group) {
        super(name, surname, age, weight, height);
        this.institute = institute;
        this.group = group;
    }

    public String getFullName(){
        return this.getName() + " " + this.getSurname();
    }

    @Override
    public String getInformation() {
        return super.getInformation() + "\nInstitute: " + institute + " and group " + group;
    }
}
