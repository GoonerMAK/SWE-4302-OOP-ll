package org.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class MastersProgramTest
{

    @Test
    public void isEligibleThesis(){
        MastersProgram mp = new MastersProgram(DegreeType.RegularThesis, "swe");
        boolean isEligible = mp.isEligible(2, "swe");
        assertFalse(isEligible);
        isEligible = mp.isEligible(3.9f, "swe");
        assertTrue(isEligible);
    }

    @Test
    public void getMarksThesis(){
        MastersProgram mp = new MastersProgram(DegreeType.RegularNonThesis, "swe");
        int marks = mp.getMarks(80,60, 40);
        assertEquals(100, marks);
    }

    @Test
    public void isEligibleThesisDifferentMajor(){
        MastersProgram mp = new MastersProgram(DegreeType.RegularThesis, "cse");
        boolean isEligible = mp.isEligible(3.9f, "swe");
        assertFalse(isEligible);
    }


    @Test
    public void isEligibleExecutiveMasterProgram()
    {
        MastersProgram mp = new MastersProgram(DegreeType.Executive, "cse");
        boolean isEligible = mp.isEligible(3.9f, "cse");
        assertTrue(isEligible);
    }


    @Test
    public void getMarksExecutiveMasterProgram()
    {
        MastersProgram mp = new MastersProgram(DegreeType.Executive, "cse");
        int marks = mp.getMarks(100, 0 , 0);
        assertEquals(100, marks);
    }

}