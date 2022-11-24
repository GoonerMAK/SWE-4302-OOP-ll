package org.example;

enum DegreeType {
    RegularThesis, RegularNonThesis, ExecutiveMastersProgram
}

public class MastersProgram {
    private DegreeType dt;
    private String major;

    public MastersProgram(DegreeType type, String major) {
        this.dt = type;
        this.major = major;
    }

    public boolean isEligible(float cgpa, String major) {
        if (dt == DegreeType.RegularThesis)
        {
            return this.major.equals(major) && cgpa >= 3.8;
        }
        else if( dt == DegreeType.ExecutiveMastersProgram )
        {
            return  (cgpa >= 3.75 || this.major.equals(major));
        }
        else
        {
            return this.major.equals(major);
        }
    }

    public int getMarks(int theoryM, int thesisM, int pm) {
        if (dt == DegreeType.RegularNonThesis) {
            return theoryM + pm / 2;
        }
        else if( dt == DegreeType.ExecutiveMastersProgram )
        {
            return theoryM;
        }
        else
        {
            return theoryM + thesisM;
        }
    }
}

