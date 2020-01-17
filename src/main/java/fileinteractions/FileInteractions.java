package fileinteractions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInteractions {

    public void isDirectoryContainsTXT(){}

    public void isDirectoryForCopyCreated(){}

    public void copyTXT(String from, String to) {

        File f = new File(from);
        System.out.printf("Your file path %s%nName is %s", f.getAbsolutePath(), f.getName());
        String compare = f.getName().substring(f.getName().length() - 3);

        if (compare.equalsIgnoreCase("txt")) {
            System.out.printf("%nThe file will be copied to %s", to);
            try (FileInputStream fileInputStream = new FileInputStream(from);
                 FileOutputStream fileOutputStream = new FileOutputStream(to)) {
                byte[] buffer = new byte[1024];
                int byteReader;
                for (; (byteReader = fileInputStream.read(buffer)) > 0; ) {
                    fileOutputStream.write(buffer, 0, byteReader);
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        } else {
            System.out.println("This method copy only txt files");
        }


    }
    // page 239 //274
    public void copyDataFromtxt(String folderFrom, String folderTo) {
    }
}
