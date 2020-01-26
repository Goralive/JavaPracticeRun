package fileinteractions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInteractions {
    private File[] fileList;
    private File folder;
    private String[] extensionList = {"txt", "doc"};
    private String folderFrom;
    private String folderTo;

    public FileInteractions(String folderFrom, String folderTo) {
        this.folderFrom = folderFrom;
        this.folderTo = folderTo;
    }

    public boolean isDirectoryContainsFiles() {
        MyFileFilter fileFilter = new MyFileFilter(extensionList);
        folder = new File(this.folderFrom);
        fileList = folder.listFiles(fileFilter);
        return fileList.length > 0;
    }

    public void directoryCreated() {
        if (!folder.exists()) {
            folder.mkdirs();
        }
    }

    public void copy() {
        System.out.printf("%nThe file will be copied to %s from %s folder", this.folderTo, this.folderFrom);
        for (File fileInTheList: fileList)
            try (FileInputStream fileInputStream = new FileInputStream(fileInTheList);
                 FileOutputStream fileOutputStream = new FileOutputStream(this.folderTo)) {
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
    public void copyDataFromFile() {
        if (isDirectoryContainsFiles()) {
            directoryCreated();
            copy();
        } else {
            System.out.println("No file found for extension");
            for (String temp : extensionList) {
                System.out.println(temp);
            }
        }
    }
}
// 1. Напишите программу которая скопирует файлы (с заранее
//определенным расширением — например только doc) из
//каталога источника в каталог приемник.


