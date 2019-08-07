package passwordvalidator;

import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type a new username: ");
        String username = sc.nextLine();
        System.out.println("Please type a new password: ");
        String userPass = sc.nextLine();
        validator.checkUsername(new User(username, userPass));


    }
}
