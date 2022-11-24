package org.example;
import java.util.ArrayList;


@Development_History(developer = "MAK")
public class Faculty
{
    String name, designation;
    double salary;

    ArrayList<Course> courses = new ArrayList<>();

    @Development_History_With_Reviewer(development_history = @Development_History(tester = "MAK"))
    public Faculty(String name, String designation, double Salary, ArrayList<Course> courseList)
    {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.courses = courseList;
    }

    @Development_History_With_Reviewer(development_history = @Development_History( version = 2) )
    public Faculty(String name, String designation, double salary)
    {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    @Development_History_With_Reviewer( development_history = @Development_History() ,reviewers = {"MAK","DON"} )
    public void research(String topic)
    {
        System.out.println("Researching " + topic);
    }

    @Development_History_With_Reviewer( development_history = @Development_History(), reviewers = {"SAM","FAM"} )
    public void teach(Course c)
    {
        System.out.println("Teaching " + c.GetName() );
    }

}


