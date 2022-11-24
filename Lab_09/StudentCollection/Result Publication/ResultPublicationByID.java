package org.example;

import java.util.Comparator;

public class ResultPublicationByID implements Comparator<Student>
{

    @Override
    public int compare(Student s1, Student s2) {
        return s1.GetID().compareTo(s2.GetID());
    }

}
