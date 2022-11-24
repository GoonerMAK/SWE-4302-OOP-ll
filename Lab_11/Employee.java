package org.example;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Employee {
    private int ID;
    private String name;
    private int experience;
    private int age;
    private double salary;

    public Employee(String name, int ID, Date experience, int age, double salary) {
        this.name = name;
        this.setID(ID);
        setExperience(experience);
        this.setAge(age);
        this.setSalary(salary);
    }

    public void setID(int newID) {
        this.ID = (int) (Math.random() * newID);
    }

    public void setExperience(Date joining) {
        Calendar calendar = Calendar.getInstance(Locale.US);
        calendar.setTime(joining);
        LocalDateTime now = LocalDateTime.now();
        int years = now.getYear() - calendar.get(Calendar.YEAR);
        this.experience = years;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void setSalary(double newSalary) {
        this.salary =  newSalary;
    }

    public int getAge()
    {
        return age;
    }

    public double getSalary()
    {
        return salary;
    }



    @Override
    public String toString() {
        return   ID + "," + name + "," +experience + "," + age + "," + salary;
    }

}
