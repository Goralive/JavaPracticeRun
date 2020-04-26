package advanced.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();

        Class personClass = Person.class;
        Class personClass2 = person.getClass();
        Class personClass3 = Class.forName("advanced.reflection.Person");

        Method[] methods = personClass.getMethods();
        Field[] fields = personClass.getDeclaredFields();
        Annotation[] annotations = personClass.getAnnotations();

        for (Annotation annotation: annotations) {
            if(annotation instanceof Author){
                System.out.println("YES!!!");
            }
        }
    }
}
