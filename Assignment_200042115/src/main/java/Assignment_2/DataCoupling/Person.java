package Assignment_2.DataCoupling;

public class Person
{
    private String name;
    private int age;
    private double height;

    public void setName(String val)
    {
        this.name = val;
    }

    public void setAge(int val)
    {
        this.age = val;
    }

    public void setHeight(double val)
    {
        this.height = val;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public double getHeight()
    {
        return height;
    }

    @Override
    public String toString() {
        return "Person {" +
                "Age = " + age +
                ", Name='" + name + '\'' +
                ", Height=" + height +
                '}';
    }

}


