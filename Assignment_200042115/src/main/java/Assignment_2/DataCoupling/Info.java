package Assignment_2.DataCoupling;

// Data coupling example
// With data coupling, an object passes only primitives to another

public class Info {

    Person p;

    public void setInfo(String name, int age, double height)
    {
        p = new Person();

        // Passing data

        p.setName(name);
        p.setAge(age);
        p.setHeight(height);

        System.out.println(p.toString());
    }


    public static void main(String[] args)
    {
        Info info = new Info();
        info.setInfo("MAK", 22, 1.7);    // passing data
    }

}
