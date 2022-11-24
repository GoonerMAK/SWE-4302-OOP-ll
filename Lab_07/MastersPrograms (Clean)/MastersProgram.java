package org.example;

enum DegreeType {
    RegularThesis, RegularNonThesis, Executive
}

public class MastersProgram
{
    private IMastersProgram type;

    public MastersProgram(DegreeType type, String major)
    {
        this.type = new ChooseMasterProgram_Factory().chooseMasterProgram(type, major);
    }

    public boolean isEligible(float cgpa, String major)
    {
        return type.isEligible(cgpa, major);
    }

    public int getMarks(int theoryMarks, int thesisMarks, int projectMarks)
    {
        return type.getMarks(theoryMarks, thesisMarks, projectMarks);
    }


}
