package org.example;

public class RegularNonThesis implements IMastersProgram {

    String major;

    RegularNonThesis(String major) {
        this.major = major;
    }

    @Override
    public boolean isEligible(float cgpa, String major)
    {
        return this.major.equals(major);
    }

    @Override
    public int getMarks(int theoryMarks, int thesisMarks, int projectMarks)
    {
        return theoryMarks + projectMarks/2;
    }

}
