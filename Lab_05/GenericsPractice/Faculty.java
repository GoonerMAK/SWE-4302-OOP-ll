package org.example;

public class Faculty extends Person
{
    String designation;

    Faculty(int age, String name, String designation)
    {
        super(age, name);
        this.designation = designation;
    }

    @Override
    public String toString()
    {
        return "Name: " + name + " Age: " + age + " Designation: " + designation;
    }

}
