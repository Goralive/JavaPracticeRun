package fileinteractions;

public class Main {
    public static void main(String[] args) {
        FileInteractions fi = new FileInteractions("build/","build/tmp1");
        fi.copyDataFromFile();
    }
}

