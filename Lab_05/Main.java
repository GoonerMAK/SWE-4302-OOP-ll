package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args)
    {
        MinStack minStack = new MinStack();

        minStack.push(3);
        minStack.push(2);
        minStack.push(5);
        minStack.push(1);
        minStack.showStack();
        System.out.println(minStack.getMin());
        minStack.pop();
        minStack.showStack();
        System.out.println(minStack.getMin());

        Person p = new Person(20, "Mark");

        Student s = new Student(20, "MAK", 200042115);

        Faculty f = new Faculty(21, "Jon", "Lecturer");

        Object[] List = {p, s, f, new Person(24, "DON"), new Student(21, "Nami", 200042169)};

        Printer.PrintArray(List);         // since the methods are static... Directly call them via class name



        List<Person> people = new ArrayList<>();

        people.add(new Person(20, "Mark"));
        people.add(new Student(20, "MAK", 200042115));
        people.add(new Faculty(21, "Jon", "Lecturer"));

        System.out.println(Printer.PrintList(people));      // since the methods are static... Directly call them via class name

    }
}