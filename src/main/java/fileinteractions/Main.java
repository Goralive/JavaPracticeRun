package fileinteractions;

public class Main {
    public static void main(String[] args) {
        FileInteractions.copy("build/", "build/tmp1");
        FileInteractions.mergeFiles("build/", "hello.txt", "hello2.txt");
    }
}

