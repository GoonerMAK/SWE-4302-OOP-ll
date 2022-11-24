package org.example;

public class Course {
    private int code;
    private String name, type;
    private double credit;

    Course(int code, String name, String type, double credit) {
        this.code = code;
        this.name = name;
        this.type = type;
        this.credit = credit;
    }

    public String GetName()
    {
        return name;
    }

}
