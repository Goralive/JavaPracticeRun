package fileinteractions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileInteractions fi = new FileInteractions();
        fi.copyDataFromtxt("test.txt","build/copy.txt");




    }

}

