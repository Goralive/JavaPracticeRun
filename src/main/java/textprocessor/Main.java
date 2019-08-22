package textprocessor;

public class Main {
    public static void main(String[] args) {
        TextProcessor text = new TextProcessor();
        text.countWords("My name is Igor Nosovskyi");
        text.reverseString("Hello");
        text.addSpaces("\nISeeTheLettersAndSpaces");
    }
}
