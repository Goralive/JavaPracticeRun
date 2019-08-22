package Inheritance;

public class Employee extends Person {

    private String employeeID;
    private String title;

    public Employee() {
        System.out.println("Constructor in employee");
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
