package passwordvalidator;

public class PasswordValidator {
    private int validPassLength = 8;

    public boolean checks(User createdNewUser, User existingUser) {
        String password = createdNewUser.getPassword();

        if (validPassLength <= password.length()) {
            if (isUpperCase(password)) {
                if (isLowerCase(password)) {
                    if (isSpecialCharacter(password)) {
                        if (checkPassword(createdNewUser, existingUser)) {

                        }
                    }
                } else {
                    System.out.println("Your password should contain an lowercase letters");
                    return false;
                }
            } else {
                System.out.println("Your password should contain an uppercase letters");
                return false;
            }
        } else {
            System.out.println("Your password less then 8 characters");
            return false;
        }
        return checkUsername(createdNewUser, existingUser);
    }

    public boolean checkUsername(User newUser, User existingUser) {
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
        boolean isUppercase = false;
        char[] chars = password.toCharArray();
        char[] upperCaseChars = password.toUpperCase().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == upperCaseChars[i]) {
                isUppercase = true;
                break;
            }
        }
        return isUppercase;
    }

    public boolean isLowerCase(String password) {
        boolean isLowerCase = false;
        char[] chars = password.toCharArray();
        char[] lowerCaseChars = password.toLowerCase().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == lowerCaseChars[i]) {
                isLowerCase = true;
                break;
            }
        }
        return isLowerCase;
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



