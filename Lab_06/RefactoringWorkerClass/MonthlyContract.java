package RefactoringWorkerClass;

import RefactoringWorkerClass.Worker;

public class MonthlyContract extends Worker
{
    int days = 21;

    public MonthlyContract(int workingDays,  int baseWage)
    {
        super(workingDays, baseWage);
    }

    @Override
    public double yearlyVacation()
    {
        return days;
    }

    @Override
    public double yearlyWage()
    {
        int months = 12;

        return months * baseWage;
    }
}
