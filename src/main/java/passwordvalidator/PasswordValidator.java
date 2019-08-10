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
        if (validPassLength <= user.getPassword().length()) {
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
        //  String temp = password.replaceAll("[^A-Za-z0-9]", "");
        char[] chars = password.toCharArray();
        char[] upperCaseChars = password.toUpperCase().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == upperCaseChars[i]) {
                return true;
            }
        }
        System.out.println("Your password should contain an uppercase letters");
        return false;
    }

    public boolean isLowerCase(String password) {
        char[] chars = password.toCharArray();
        char[] lowerCaseChars = password.toLowerCase().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == lowerCaseChars[i]) {
                return true;
            }
        }
        System.out.println("Your password should contain an lowercase letters");
        return false;
    }

    public boolean isSpecialCharacter(String password) {
        String temp = password.replaceAll("[A-Za-z0-9]", "");
        if (0 < temp.length()) {
            return true;
        } else {
            System.out.println("Password should contain a special characters");
            return false;
        }
    }
}



