package RefactoringWorkerClass;

import RefactoringWorkerClass.Worker;

public class DayLabour extends Worker
{
    public DayLabour(int workingDays,  int baseWage)
    {
        super(workingDays, baseWage);
    }

    @Override
    public double yearlyVacation()
    {
        return 0;
    }

    @Override
    public double yearlyWage()
    {
        int months = 12;

        return months * (workingDays * baseWage / 25);
    }
}
