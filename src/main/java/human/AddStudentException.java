package human;

public class AddStudentException extends Exception {

    @Override
    public String getMessage() {
        return "Can't add new student. Size of the group is less";
    }
}
