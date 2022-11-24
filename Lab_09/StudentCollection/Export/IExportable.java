package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public interface IExportable
{
    public void print(List<Student> students, String path) throws IOException;
}

