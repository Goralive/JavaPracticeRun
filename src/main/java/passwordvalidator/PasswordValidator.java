package passwordvalidator;

public class PasswordValidator {


    public boolean checkUsername(String username, User user) {
        return username.equals(user.getUsername());
    }

    public boolean checkPasswordLength(User user) throws Exception {
    return true;
    }

    public boolean checks(User user1, User user2) {
        return checkUsername(user1.getUsername(),user2);
    }

}
