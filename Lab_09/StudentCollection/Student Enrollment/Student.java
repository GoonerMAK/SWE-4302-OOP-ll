package org.example;

public class Student {
    enum Program {
        CSE, SWE, IT;
    }

    private String id, name;
    private float CGPA;
    private Program program;


    Student( String id, String name, float CGPA, Program program)
    {
        if (id.length() == 9)
        {
            this.id = id;
        }

        else
        {
            throw new RuntimeException("Invalid Student ID");
        }

        this.name = name;
        this.CGPA = CGPA;
        this.program = program;
    }

    public String GetID()
    {
        return id;
    }

    public String GetName()
    {
        return name;
    }

    public float GetCGPA()
    {
        return CGPA;
    }

    public Program GetProgram(){ return program; }

    public void Study()
    {
        System.out.println("Time to study");
    }

    public void Play()
    {
        System.out.println("Time to play");
    }


    @Override
    public String toString() {
        return "Name:" + name + " ID:" + id + " CGPA:" + CGPA + " Program: " + program;
    }

}





//    public void SetID(String id)
//    {
//        if (id.length() == 9)
//        {
//            this.id = id;
//        }
//
//        else
//        {
//            throw new RuntimeException("Invalid Student ID");
//        }
//    }


//    public void SetCGPA(float CGPA)
//    {
//        this.CGPA = CGPA;
//    }


//    public void SetName(String name)
//    {
//        this.name = name;
//    }
