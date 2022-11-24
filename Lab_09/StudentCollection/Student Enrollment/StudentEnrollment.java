package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentEnrollment
{
    private List<Student> students = new ArrayList<>();

    public void AddStudent(Student s)
    {
        students.add(s);
    }

    public void RemoveStudent(String id)
    {
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext())
        {
            Student student = iterator.next();

            if( student.GetID() == id )
            {
                students.remove(student);
                break;
            }
        }

    }


    public void GetStudent(String id)
    {
        int flag = 0;

        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext())
        {
            Student student = iterator.next();

            if( student.GetID() == id )
            {
                flag ++;
                System.out.println("Name:" + student.GetName() + " ID:" + student.GetID() + " CGPA:" + student.GetCGPA() + " Program: " + student.GetProgram());
                break;
            }
        }

        if( flag == 0 )
        {
            System.out.println("No such Student found");
        }

    }


    public void GetAllStudent()
    {
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext())
        {
            Student student = iterator.next();

            System.out.println("Name:" + student.GetName() + " ID:" + student.GetID() + " CGPA:" + student.GetCGPA() + " Program: " + student.GetProgram());

        }
    }


    public void Print()
    {
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext())
        {
            Student student = iterator.next();

            System.out.println("Name:" + student.GetName() + " ID:" + student.GetID() + " CGPA:" + student.GetCGPA());

        }
    }


    public void GetStudent(Student s)
    {
        String id = s.GetID();
        int flag = 0;

        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext())
        {
            Student student = iterator.next();

            if( student.GetID() == id )
            {
                flag ++;
                System.out.println("Name:" + student.GetName() + " ID:" + student.GetID() + " CGPA:" + student.GetCGPA() + " Program: " + student.GetProgram());
                break;
            }
        }

        if( flag == 0 )
        {
            System.out.println("No such Student found");
        }

    }



    public void RemoveStudent(Student s)
    {
        String id = s.GetID();

        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext())
        {
            Student student = iterator.next();

            if( student.GetID() == id )
            {
                students.remove(student);
                break;
            }
        }

    }

}
