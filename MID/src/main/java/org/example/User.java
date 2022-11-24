package org.example;

public class User
{
    ISmallDatabase smallDatabase;

    IDatabase database;

    public User(ISmallDatabase database)
    {
        this.smallDatabase = database;
    }

    public User(IDatabase database)
    {
        this.database = database;
    }

    public void addData(String data1, String data2)
    {
        smallDatabase.persist(data1);

        smallDatabase.extraData(data2);
    }

    public void addData(String data1)
    {
        database.persist(data1);
    }
}
