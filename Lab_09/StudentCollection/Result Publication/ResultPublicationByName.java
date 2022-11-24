package org.example;

import java.util.Comparator;

public class ResultPublicationByName implements Comparator<Student> {


    @Override
    public int compare(Student s1, Student s2)
    {
        return s1.GetName().compareTo(s2.GetName());
    }

}
