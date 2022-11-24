package org.example;

public class ChooseMasterProgram_Factory        // Factory Class
{

    public IMastersProgram chooseMasterProgram(DegreeType type, String major)
    {

        if (type.equals(DegreeType.RegularThesis))
        {
            return new RegularThesis(major);
        }
        else if (type.equals(DegreeType.RegularNonThesis))
        {
            return new RegularNonThesis(major);
        }

        else if(type.equals(DegreeType.Executive))
        {
            return new Executive(major);
        }

        else
        {
            throw new IllegalArgumentException("Invalid ting given...");
        }

    }
}
