package Assignment_2.StampCoupling;
import Assignment_2.DataCoupling.Person;

// Example of stamp coupling

public class Info {

    public void getInfo(Person p)      // stamp coupling (passing reference)
    {
        System.out.println("My name is " + p.getName() + " and I am " + p.getAge() + " years old.");
    }


    public static void main(String[] args)
    {
        Person p = new Person();
        p.setAge(22);
        p.setName("MAK");

        Info info = new Info();
        info.getInfo(p);
    }

}
