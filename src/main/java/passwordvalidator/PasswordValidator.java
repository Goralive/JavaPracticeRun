package passwordvalidator;

public class PasswordValidator {
    private String username = "Jackson_ford";
    private String password = "Hell0World";

    public boolean checkUsername (User user) {
        return user.getUsername().equals(username.toLowerCase());
    }
}
