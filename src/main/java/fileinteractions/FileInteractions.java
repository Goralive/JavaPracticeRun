package fileinteractions;

import java.io.*;
import java.util.stream.Collectors;

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

    public void mergeTwoFiles(String firstFile, String secondFile) {
        String merged = readFileForMerge(firstFile, secondFile);
        writeToNewFile("merged.txt", merged);
        System.out.println();
    }

    private void writeToNewFile(String fileName, String content) {
        File file = new File(fileName);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(content);
            writer.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public String readFileForMerge(String firstFile, String secondFile) {
        String mergeTwoFiles = readAllLinesWithStream(firstFile) + "\n" + readAllLinesWithStream(secondFile);
        return mergeTwoFiles;
    }

    public String readAllLinesWithStream(String filePath) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            return bufferedReader.lines().collect(Collectors.joining(System.lineSeparator()));
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
