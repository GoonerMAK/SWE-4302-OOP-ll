package org.example;

public class Main {
    public static void main(String[] args)
    {

        User MySqlUser = new User(new MySqlDatabase());

        User OracleUser = new User( new OracleDatabase());

        MySqlUser.addData("Data exists", "I exist again");

        OracleUser.addData("Data exists");

    }
}


