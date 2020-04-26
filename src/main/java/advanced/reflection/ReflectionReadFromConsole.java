package advanced.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ReflectionReadFromConsole {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Scanner sc = new Scanner(System.in);
        // Name_class1 Name_class2 Method_Name
        System.out.println("Name for 1 class");
        Class classObject1 = Class.forName(sc.next());
        System.out.println("Name for 2 class");
        Class classObject2 = Class.forName(sc.next());
        System.out.println("Method name");
        String methodName = sc.next();

        Method m = classObject1.getMethod(methodName, classObject2);
        Object o1 = classObject1.newInstance();
        Object o2 = classObject2.getConstructor(String.class).newInstance("String value");

        m.invoke(o1,o2);

        System.out.println(o1);
    }
}
