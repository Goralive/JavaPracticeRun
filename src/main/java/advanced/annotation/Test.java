package advanced.annotation;

public class Test {
    @MethodInfo(dataOfCreation = 2019, purpose = "Print Hello")
    public void printHello(){
        System.out.println("Hello World!");
    }
}
