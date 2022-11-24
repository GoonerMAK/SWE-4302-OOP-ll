package org.example;

public class OracleDatabase implements IDatabase
{

    @Override
    public void persist(String data)
    {
        System.out.println("Oracle Database persists: " + data);
    }

}
