package org.example;

public class Main {
    public static void main(String[] args)
    {
        DayLabour dayLabour = new DayLabour(300, 100);
        Permanent permanent = new Permanent(214, 1000);
        MonthlyContract monthlyContract = new MonthlyContract(14, 400);

        System.out.println(permanent.yearlyVacation() + " " + permanent.yearlyWage());

        System.out.println(monthlyContract.yearlyVacation() + " " + monthlyContract.yearlyWage());
    }
}