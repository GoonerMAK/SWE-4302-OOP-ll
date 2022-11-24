package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

public class ResultPublicationTest
{
    @Test
    public void SortedByName()
    {
        String expected = "Name:DON ID:200042115 CGPA:3.95 Program: CSE\n" +
                "Name:MAK ID:123456789 CGPA:3.725 Program: IT\n" +
                "Name:SAM ID:111111111 CGPA:3.85 Program: CSE\n";

        String s = "";

        List<Student> Array = new ArrayList<>();

        Array.add(new Student("123456789", "MAK", 3.725f, Student.Program.IT));
        Array.add(new Student("111111111", "SAM", 3.85f, Student.Program.CSE));
        Array.add(new Student("200042115", "DON", 3.95f, Student.Program.CSE));

        Collections.sort(Array, new ResultPublicationByName());

        Iterator<Student> iterator1 = Array.iterator();

        while (iterator1.hasNext())
        {
            Student student = iterator1.next();
            s = s + "Name:" + student.GetName() + " ID:" + student.GetID() + " CGPA:" + student.GetCGPA() + " Program: " + student.GetProgram() + "\n";
        }

        assertEquals(expected, s);
    }


    @Test
    public void SortedByID()
    {
        String expected = "Name:SAM ID:111111111 CGPA:3.85 Program: CSE\n" +
                "Name:MAK ID:123456789 CGPA:3.725 Program: IT\n" +
                "Name:DON ID:200042115 CGPA:3.95 Program: CSE\n";

        String s = "";

        List<Student> Array = new ArrayList<>();

        Array.add(new Student("123456789", "MAK", 3.725f, Student.Program.IT));
        Array.add(new Student("111111111", "SAM", 3.85f, Student.Program.CSE));
        Array.add(new Student("200042115", "DON", 3.95f, Student.Program.CSE));

        Collections.sort(Array, new ResultPublicationByID());

        Iterator<Student> iterator1 = Array.iterator();

        while (iterator1.hasNext())
        {
            Student student = iterator1.next();
            s = s + "Name:" + student.GetName() + " ID:" + student.GetID() + " CGPA:" + student.GetCGPA() + " Program: " + student.GetProgram() + "\n";
        }

        assertEquals(expected, s);
    }


    @Test
    public void SortedByCGPA()
    {
        String expected = "Name:MAK ID:123456789 CGPA:3.725 Program: IT\n" +
                "Name:SAM ID:111111111 CGPA:3.85 Program: CSE\n" +
                "Name:DON ID:200042115 CGPA:3.95 Program: CSE\n";

        String s = "";

        List<Student> Array = new ArrayList<>();

        Array.add(new Student("123456789", "MAK", 3.725f, Student.Program.IT));
        Array.add(new Student("111111111", "SAM", 3.85f, Student.Program.CSE));
        Array.add(new Student("200042115", "DON", 3.95f, Student.Program.CSE));

        Collections.sort(Array, new ResultPublicationByCGPA());

        Iterator<Student> iterator1 = Array.iterator();

        while (iterator1.hasNext())
        {
            Student student = iterator1.next();
            s = s + "Name:" + student.GetName() + " ID:" + student.GetID() + " CGPA:" + student.GetCGPA() + " Program: " + student.GetProgram() + "\n";
        }

        assertEquals(expected, s);
    }



}