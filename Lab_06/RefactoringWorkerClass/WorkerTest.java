package org.example;

import RefactoringWorkerClass.DayLabour;
import RefactoringWorkerClass.Worker;
import RefactoringWorkerClass.MonthlyContract;
import RefactoringWorkerClass.Permanent;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import static org.junit.Assert.*;

public class WorkerTest
{

    @Test
    public void CheckDayLabourer()
    {
        DayLabour dayLabour = new DayLabour(300, 100);

        Double expected1 = 0.0;
        Double expected2 = 14400.0;

        assertEquals(expected1, dayLabour.yearlyVacation(), 0.001);

        assertEquals(expected2, dayLabour.yearlyWage(), 0.001);
    }

    @Test
    public void CheckPermanent()
    {
        Permanent permanent = new Permanent(214, 1000);

        Double expected1 = 26.42;
        Double expected2 = 39600.0;

        assertEquals(expected1, permanent.yearlyVacation(), 0.001);

        assertEquals(expected2, permanent.yearlyWage(), 0.001);
    }


    @Test
    public void CheckMonthlyContract()
    {
        MonthlyContract monthlyContract = new MonthlyContract(14, 400);

        Double expected1 = 21.0;
        Double expected2 = 4800.0;

        assertEquals(expected1, monthlyContract.yearlyVacation(), 0.001);

        assertEquals(expected2, monthlyContract.yearlyWage(), 0.001);
    }


    @Test
    public void ObjectTestDayLabourer()
    {
        DayLabour dayLabour = new DayLabour(300, 100);

        assertInstanceOf(DayLabour.class, dayLabour );
    }

    @Test
    public void ObjectTestPermanent()
    {
        Permanent permanent = new Permanent(214, 1000);

        assertInstanceOf(Permanent.class, permanent );
    }


    @Test
    public void ObjectTestMonthly()
    {
        MonthlyContract monthlyContract = new MonthlyContract(14, 400);

        assertInstanceOf(MonthlyContract.class, monthlyContract );
    }

}