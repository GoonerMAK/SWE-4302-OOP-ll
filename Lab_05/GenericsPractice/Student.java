package org.example;

public class Student extends Person {
    int studentID;

    Student(int age, String name, int studentID) {
        super(age, name);
        this.studentID = studentID;
    }

    @Override
    public String toString()
    {
        return "Name: " + name + " Age: " + age + " Student ID: " + studentID;
    }
}
