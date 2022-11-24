package RefactoringWorkerClass;

import RefactoringWorkerClass.Worker;

public class Permanent extends Worker
{


    public Permanent(int workingDays, int baseWage)
    {
        super(workingDays, baseWage);
    }

    @Override
    public double yearlyVacation()
    {
        double vacationMultiplier = 0.03;
        int days = 20;

        return days + workingDays * vacationMultiplier;
    }

    @Override
    public double yearlyWage()
    {
        int months = 12;
        double multiplier = 0.3;

        return months * (baseWage + baseWage*multiplier + baseWage*2);
    }

}
