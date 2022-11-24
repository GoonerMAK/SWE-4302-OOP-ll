package org.example;

import java.util.Map;

public class Account
{
    private String accountId;

    private long balance;

    private Map<String, Account> accounts;

    Account(String accountId, long balance)
    {
        this.accountId = accountId;

        this.balance = balance;
    }

}


