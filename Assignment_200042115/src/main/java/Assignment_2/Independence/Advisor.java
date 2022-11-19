package Assignment_2.Independence;

public class Advisor
{
    String name;
    int age;
    String designation;
    String department;

    Advisor(String name, int age, String designation ,String department)
    {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.department  = department;
    }

    public void getInfo()
    {
        System.out.println(name + " " + age + " " + designation + " " + department);
    }
}
