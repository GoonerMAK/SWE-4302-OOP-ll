package RefactoringWorkerClass;


public abstract class Worker
{
    int workingDays;
    int baseWage;

    Worker(int workingDays,  int baseWage)
    {
        this.workingDays = workingDays;
        this.baseWage = baseWage;
    }

    abstract double yearlyVacation();

    abstract double yearlyWage();



    public static void main(String[] args)
    {
        DayLabour dayLabour = new DayLabour(300, 100);
        Permanent permanent = new Permanent(214, 1000);
        MonthlyContract monthlyContract = new MonthlyContract(14, 400);

        System.out.println(permanent.yearlyVacation() + " " + permanent.yearlyWage());

        System.out.println(monthlyContract.yearlyVacation() + " " + monthlyContract.yearlyWage());
    }

}
