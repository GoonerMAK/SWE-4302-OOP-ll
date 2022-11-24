package org.example;

import java.io.*;
import java.util.List;

public class XMLexport implements IExportable {

    @Override
    public void print(List<Student> students, String path) throws IOException {

        OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(path), "UTF-16");

        for(Student student : students){
            String line = student.toString();

            out.write("\n");
            out.write(line);

        }
        out.close();

    }
}
