package passwordvalidator;

public class PasswordValidator {
    private int validPassLength = 8;

    public boolean checks(User createdNewUser, User existingUser) {
        String password = createdNewUser.getPassword();

        if (passwordLength(createdNewUser) && isUpperCase(password) &&
                isLowerCase(password) && isSpecialCharacter(password) &&
                checkPassword(createdNewUser, existingUser) && isSameUsername(createdNewUser, existingUser)) {
            return true;
        }
        return false;
    }

    public boolean passwordLength(User user) {
        if (user.getPassword().matches("\\w{8,}\\S")) {
            return true;
        }
        System.out.println("Your password is less then 8 characters");
        return false;
    }

    public boolean isSameUsername(User newUser, User existingUser) {
        if (newUser.getUsername().equals(existingUser.getUsername())) {
            System.out.println("Please provide a new username");
            return false;
        }
        return true;
    }

    public boolean checkPassword(User newUser, User existingUser) {
        if (newUser.getPassword().equals(existingUser.getPassword())) {
            System.out.println("Please provide a new password");
            return false;
        }
        return true;
    }


    public boolean isUpperCase(String password) {
        if (password.matches("(?s).*[A-Z].*")) {
            return true;
        }
        System.out.println("Your password should contain an uppercase letters");
        return false;
    }

    public boolean isLowerCase(String password) {
        if (password.matches("(?s).*[a-z].*")) {
            return true;
        }
        System.out.println("Your password should contain an lowercase letters");
        return false;
    }

    public boolean isSpecialCharacter(String password) {
        if (password.matches("(?s).*[@$!%*#?&].*")) {
            return true;
        }
        System.out.println("Your password should contain a special characters");
        return false;
    }
}



