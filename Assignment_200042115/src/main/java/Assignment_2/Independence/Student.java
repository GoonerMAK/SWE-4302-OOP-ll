package Assignment_2.Independence;

public class Student
{
    String name;
    int age;
    String department;

    Student(String name, int age, String department)
    {
        this.name = name;
        this.age = age;
        this.department  = department;
    }

    public void getInfo()
    {
        System.out.println(name + " " + age + " " + department);
    }

}
