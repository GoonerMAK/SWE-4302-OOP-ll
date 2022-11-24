package org.example;

import static org.junit.Assert.*;

public class StudentEnrollmentTest {


    @org.junit.Test
    public void AddStudent()
    {
        String expected = "200042181";
        Student s = new Student("200042181", "WOW", 4.0f, Student.Program.CSE);
        StudentEnrollment studentEnrollment = new StudentEnrollment();


    }

    @org.junit.Test
    public void removeStudent() {
    }

    @org.junit.Test
    public void getStudent() {
    }

    @org.junit.Test
    public void getAllStudent() {
    }

    @org.junit.Test
    public void print() {
    }

    @org.junit.Test
    public void testGetStudent() {
    }

    @org.junit.Test
    public void testRemoveStudent() {
    }
}