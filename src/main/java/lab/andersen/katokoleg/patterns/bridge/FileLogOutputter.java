package lab.andersen.katokoleg.patterns.bridge;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogOutputter implements LogOutputter {

    private File file;


    public FileLogOutputter(File file) {
        this.file = file;
    }

    @Override
    public void log(String message) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
