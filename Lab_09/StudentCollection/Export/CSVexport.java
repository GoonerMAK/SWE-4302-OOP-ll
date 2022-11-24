package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVexport implements IExportable {

    @Override
    public void print(List<Student> students, String path) throws IOException {
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(path));

        for (Student student : students) {
            String line = student.toString();

            fileWriter.newLine();
            fileWriter.write(line);
        }

        fileWriter.close();

    }
}

