package org.example;

import java.util.Comparator;

public class ResultPublicationByCGPA implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2)
    {
        Float CGPA1 = Float.valueOf(s1.GetCGPA());
        Float CGPA2 = Float.valueOf(s2.GetCGPA());
        return CGPA1.compareTo(CGPA2);
    }

}
