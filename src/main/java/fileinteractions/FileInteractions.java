package fileinteractions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInteractions {
    private File[] fileList;
    private File fileFolderTo;
    private File fileFolderFrom;
    private String[] extensionList = {"txt", "doc"};

    public FileInteractions(String folderFrom, String folderTo) {
        this.fileFolderTo = new File(folderTo);
        this.fileFolderFrom = new File(folderFrom);
    }

    public boolean isDirectoryContainsFiles() {
        MyFileFilter fileFilter = new MyFileFilter(extensionList);
        fileList = fileFolderFrom.listFiles(fileFilter);
        return fileList.length > 0;
    }

    public void directoryCreated() {
            this.fileFolderTo.mkdirs();
    }

    public void copy() {
        System.out.printf("%nThe file will be copied to %s from %s folder", this.fileFolderTo.getAbsolutePath(), this.fileFolderFrom.getAbsolutePath());
        for (File fileInTheList : fileList)
            try (FileInputStream fileInputStream = new FileInputStream(fileInTheList);
                 FileOutputStream fileOutputStream = new FileOutputStream(fileFolderTo.getAbsolutePath() + "/" + fileInTheList.getName())) {
                byte[] buffer = new byte[1024];
                int byteReader;
                for (; (byteReader = fileInputStream.read(buffer)) > 0; ) {
                    fileOutputStream.write(buffer, 0, byteReader);
                }
            } catch (IOException e) {
                System.out.println(e);
            }
    }

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


