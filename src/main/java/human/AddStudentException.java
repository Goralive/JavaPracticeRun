package human;

public class AddStudentException extends Exception {

    @Override
    public String getMessage() {
        return "Only 10 student can be in the group";
    }
}
