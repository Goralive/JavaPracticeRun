package fileinteractions;

import java.io.*;

public class FileInteractions {
    private static String[] extensionList = {"txt", "doc"};
    private static MyFileFilter fileFilter = new MyFileFilter(extensionList);

    public static void copy(String folderFrom, String folderTo) {
        File fileFolderFrom = new File(folderFrom);
        File fileFolderTo = new File(folderTo);

        File[] fileList = fileFolderFrom.listFiles(fileFilter);

        if (fileList.length > 0) {
            fileFolderTo.mkdirs();
            System.out.printf("%nThe file will be copied to %s from %s folder", fileFolderTo.getAbsolutePath(), fileFolderFrom.getAbsolutePath());
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
    }

    public static void mergeFiles(String folderPath, String... files) {
        File mergedFile = new File(folderPath + "merged.txt");
        File folder = new File(folderPath);
        File[] listFilesForMerge = folder.listFiles(fileFilter);


        if (listFilesForMerge.length > 0) {
            for (File file : listFilesForMerge) {
                for (String fileName : files) {
                    if (file.getName().equalsIgnoreCase(fileName)) {
                        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                             BufferedWriter writer = new BufferedWriter(new FileWriter(mergedFile, true))) {
                            String mergedContent = "";
                            while ((mergedContent = bufferedReader.readLine()) != null) {
                                writer.write(mergedContent);
                                writer.newLine();
                            }


                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                }
            }
        }
    }
}
