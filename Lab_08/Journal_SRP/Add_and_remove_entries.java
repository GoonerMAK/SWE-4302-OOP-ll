package org.example;

import java.util.List;

public class Add_and_remove_entries
{
    Journal journal = new Journal();

    public void addEntry(String s)
    {
        journal.setEntry(s);
    }

    public void addEntry(List<String> strings)
    {
        journal.setEntry(strings);
    }

    public void removeEntries(String s)
    {

    }
}
