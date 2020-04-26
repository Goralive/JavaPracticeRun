package human;

import java.io.*;
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

    public static void writeObject(Object object, String fileName) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            objectOutputStream.writeObject(object);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Group readObject(String fileName) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Group) objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
