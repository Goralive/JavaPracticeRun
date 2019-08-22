package passwordvalidator;

import java.util.Scanner;

public class User {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    Scanner sc = new Scanner(System.in);

    public User createUser() {
        System.out.println("Please type a new username: ");
        String username = sc.nextLine();
        System.out.println("Please type a new password: ");
        String userPass = sc.nextLine();
        return new User(username,userPass);
    }
}
