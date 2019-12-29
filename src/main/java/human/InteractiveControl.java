package human;

import java.util.Scanner;

public class InteractiveControl {
    Scanner sc = new Scanner(System.in);

    public Group createNewGroup() {
        System.out.println("Hello you can add a group: ");
        System.out.println("University name: ");
        String universityName = sc.nextLine();
        System.out.println("Add group number: ");
        int groupNumber = sc.nextInt();
        System.out.println("Specify group size: ");
        int groupSize = sc.nextInt();
        return new Group(universityName, groupNumber, groupSize);
    }
}
