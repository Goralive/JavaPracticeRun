package fileinteractions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInteractions {

    public boolean isDirectoryContainsTXT(String folderFrom) {
        MyFileFilter fileFilter = new MyFileFilter("txt", "doc");
        File f = new File(folderFrom);
        return false;
    }

    public void directoryCreated(String folderTo) {
    }

    public void copyTXT(String from, String to) {
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
    }

    // page 239 //274
    public void copyDataFromtxt(String folderFrom, String folderTo) {
        isDirectoryContainsTXT(folderFrom);
        directoryCreated(folderTo);
        copyTXT(folderFrom, folderTo);
    }
}
// 1. Напишите программу которая скопирует файлы (с заранее
//определенным расширением — например только doc) из
//каталога источника в каталог приемник.


