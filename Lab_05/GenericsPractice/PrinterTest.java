package org.example;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PrinterTest {

    @Test
    public void personAndFaculty()
    {
        Person p = new Person(20, "MAK");
        Faculty f = new Faculty(21, "Jon", "Lecturer");

        List<Person> people = new ArrayList<>();

        people.add(p);
        people.add(f);

        String expected = "Name: MAK Age: 20\n" +
                "Name: Jon Age: 21 Designation: Lecturer\n";

        String actual = Printer.PrintList(people);

        assertEquals(expected, actual);

    }

    @Test
    public void studentAndFaculty()
    {
        Student s = new Student(20, "MAK", 200042115);

        Faculty f = new Faculty(21, "Jon", "Lecturer");

        List<Person> people = new ArrayList<>();

        people.add(s);
        people.add(f);

        String expected = "Name: MAK Age: 20 Student ID: 200042115\n" +
                        "Name: Jon Age: 21 Designation: Lecturer\n";

        String actual = Printer.PrintList(people);

        assertEquals(expected, actual);

    }


    @Test
    public void listOfPeople()
    {
        Person p = new Person(20, "Mark");

        Student s = new Student(20, "MAK", 200042115);

        Faculty f = new Faculty(21, "Jon", "Lecturer");

        List<Person> people = new ArrayList<>();

        people.add(s);
        people.add(f);
        people.add(p);


        String expected = "Name: MAK Age: 20 Student ID: 200042115\n" +
                "Name: Jon Age: 21 Designation: Lecturer\n" +
                "Name: Mark Age: 20\n";

        String actual = Printer.PrintList(people);

        assertEquals(expected, actual);

    }

}