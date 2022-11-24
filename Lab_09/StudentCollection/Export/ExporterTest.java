package org.example;

import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ExporterTest
{

    @Test
    public void exportCSV() throws IOException {
        List<Student> Array = new ArrayList<>();

        Array.add(new Student("123456789", "MAK", 3.725f, Student.Program.IT));
        Array.add(new Student("111111111", "SAM", 3.85f, Student.Program.CSE));
        Array.add(new Student("200042115", "DON", 3.95f, Student.Program.CSE));

        CSVexport csv = new CSVexport();

        csv.print(Array, "D:\\IUT 2-1\\SWE 4302 OOP II\\Lab_09\\StudentCollection\\csvTest.csv");



    }

    @Test
    public void exportXML() throws IOException {
        List<Student> Array = new ArrayList<>();

        Array.add(new Student("123456789", "MAK", 3.725f, Student.Program.IT));
        Array.add(new Student("111111111", "SAM", 3.85f, Student.Program.CSE));
        Array.add(new Student("200042115", "DON", 3.95f, Student.Program.CSE));

        XMLexport xml = new XMLexport();

        xml.print(Array, "D:\\IUT 2-1\\SWE 4302 OOP II\\Lab_09\\StudentCollection\\xmlTest.xml");

    }
}