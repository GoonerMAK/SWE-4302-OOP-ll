package org.example;

import java.util.Comparator;

public class ResultPublicationByCGPA_ID implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2)
    {
        Float CGPA1 = Float.valueOf(s1.GetCGPA());
        Float CGPA2 = Float.valueOf(s2.GetCGPA());

        if(CGPA1.compareTo(CGPA2) == 0)
        {
            return s1.GetID().compareTo(s2.GetID());
        }

        else
        {
            return CGPA1.compareTo(CGPA2);
        }
    }
}
