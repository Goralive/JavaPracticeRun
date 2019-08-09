package passwordvalidator;

/**
 * Password should be
 * - at lease 8 characters long
 * - contain an uppercase letter
 * - contain a special character
 * - not contain the username
 * - not the same as the old password
 */
public class Main {
    public static void main(String[] args) {
        PasswordValidator validator = new PasswordValidator();
        User user = new User("Reno","Jackson#123");
        //User createNewUser = user.createUser();
        boolean isValid;
        do {
           isValid = validator.checks(new User().createUser(),user);
        } while (!isValid);
        System.out.println("Your username and password is valid");
    }
}
