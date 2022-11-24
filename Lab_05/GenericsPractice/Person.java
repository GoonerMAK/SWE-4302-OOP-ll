package org.example;

public class Person
{
    int age;
    String name;

    Person(int age, String name)
    {
        this.age = age;
        this.name = name;
    }


    @Override
    public String toString()
    {
        return "Name: " + name + " Age: " + age;
    }


}
