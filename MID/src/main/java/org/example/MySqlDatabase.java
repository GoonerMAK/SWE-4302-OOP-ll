package org.example;

public class MySqlDatabase implements ISmallDatabase
{
    @Override
    public void persist(String data)
    {
        System.out.println("MySQL Database persists: " + data);
    }

    @Override
    public void extraData(String extraData)
    {
        System.out.println("MySQL Database has extra small data: " + extraData);
    }
}
