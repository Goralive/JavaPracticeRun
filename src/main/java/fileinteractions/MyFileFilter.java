package fileinteractions;

import java.io.File;
import java.io.FileFilter;

public class MyFileFilter implements FileFilter {
    private String[] arr;

    public MyFileFilter(String... arr) {
        super();
        this.arr = arr;
    }

    private boolean check(String ext) {
        for (String stringExt : arr) {
            if (stringExt.equalsIgnoreCase(ext)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean accept(File filePath) {
        int pointIndex = filePath.getName().lastIndexOf(".");
        if(pointIndex == -1) {
            return false;
        }
        String ext = filePath.getName().substring(pointIndex + 1);
        return check(ext);
    }
}
