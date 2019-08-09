package passwordvalidator;

public class PasswordValidator {
    private int validPassLength = 8;


    public boolean checkUsername(String newUserName, User existingUser) {
        return newUserName.equals(existingUser.getUsername());
    }

    public boolean checks(User createdNewUser, User existingUser) {
        String password = createdNewUser.getPassword();

        if (validPassLength <= password.length()) {
            if (isUpperCase(password)) {
                if (isLowerCase(password)) {
                    return true;
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

        // return checkUsername(createdNewUser.getUsername(), existingUser);
    }

    public boolean isUpperCase(String password) {
        boolean isUppercase = false;
        char[] chars = password.toCharArray();
        char[] upperCaseChars = password.toUpperCase().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == upperCaseChars[i]) {
                isUppercase = true;
                break;
            } else {
                isUppercase = false;
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
            } else {
                isLowerCase = false;
            }
        }
        return isLowerCase;
    }

}


//        * - contain an uppercase letter
//        * - contain a special character
//        * - not contain the username
//        * - not the same as the old password
